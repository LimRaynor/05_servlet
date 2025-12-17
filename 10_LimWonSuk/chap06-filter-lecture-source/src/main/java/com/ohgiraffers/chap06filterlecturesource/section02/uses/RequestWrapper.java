package com.ohgiraffers.chap06filterlecturesource.section02.uses;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class RequestWrapper extends HttpServletRequestWrapper {

    /* Servlet Wrapper를 이용하려면
     * HttpservletRequest/HttpServletResponse를
     *    매개 변수로 전달 받는 생성자가 필요하다!
     *  */
    public RequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {
        if ("password".equals(name)) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            return encoder.encode(super.getParameter(name));// 암호화

        } else {
            return super.getParameter(name);
        }

    }
}