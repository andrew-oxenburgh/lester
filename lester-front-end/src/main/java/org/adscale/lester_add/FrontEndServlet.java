package org.adscale.lester_add;

import org.adscale.Add;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontEndServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] params = req.getParameterValues("i");

        if (params == null || params.length < 1) {
            adjustResponse(resp, "0");
            return;
        }

        int[] is = new int[params.length];

        for (int i = 0; i < params.length; i++) {
            is[i] = Integer.parseInt(params[i]);
        }

        adjustResponse(resp, new Add().add(is) + "");

    }


    private void adjustResponse(HttpServletResponse resp, String result) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().write(result);
        resp.setStatus(200);
    }
}
