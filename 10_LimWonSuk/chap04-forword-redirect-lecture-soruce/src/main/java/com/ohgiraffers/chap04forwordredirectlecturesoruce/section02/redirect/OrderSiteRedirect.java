package com.ohgiraffers.chap04forwordredirectlecturesoruce.section02.redirect;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/othersite")
public class OrderSiteRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Get 요청후 naver로 redirect");
        response.sendRedirect("http://www.naver.com");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}