package org.adscale.lester_add;

import org.adscale.Add;
import org.adscale.ReversePolishNotation;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.support.RequestContextUtils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebApplicationContext ctxt = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        ReversePolishNotation rpn = (ReversePolishNotation) ctxt.getBean("rpn");

        String calc = req.getParameter("calc");
        adjustResponse(resp, rpn.reversePolishNotation(calc) + "");
    }


    private void adjustResponse(HttpServletResponse resp, String result) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().write(result);
        resp.setStatus(200);
    }
}
