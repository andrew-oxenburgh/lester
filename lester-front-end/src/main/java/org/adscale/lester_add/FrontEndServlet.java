package org.adscale.lester_add;

import org.adscale.Add;
import org.adscale.ReversePolishNotation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontEndServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String calc = req.getParameter("calc");
        adjustResponse(resp, new ReversePolishNotation().reversePolishNotation(calc) + "");
    }


    private void adjustResponse(HttpServletResponse resp, String result) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().write(result);
        resp.setStatus(200);
    }
}
