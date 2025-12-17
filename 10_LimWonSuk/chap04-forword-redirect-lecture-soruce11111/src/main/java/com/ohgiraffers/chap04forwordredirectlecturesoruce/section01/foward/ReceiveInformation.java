package com.ohgiraffers.chap04forwordredirectlecturesoruce.section01.foward;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/foward")
public class ReceiveInformation extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        /*  RequestDispatcher (쵸청 발송자)
        * - 현재서블릿이 받은 요청을
        *       다른 서블릿으로 위힘(FOWARD)하는 역할의 객체
        *
        * - 객체 생성시 위임할 경로 작성
        *  1) JSC 파일 경로
        *  2) 서블릿 요청 주소
        * */

        /* 비즈니스 로직 수행과
        * 응답 화면 생성을 분리하기 위해 다른 서블릿으로 위임*/
        RequestDispatcher rd
                = request.getRequestDispatcher("/print");

        rd.forward(request, response);
    }
}