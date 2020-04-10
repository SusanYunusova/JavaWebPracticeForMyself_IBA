package web2_lesson31;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter writer = resp.getWriter()) {
            Map<String, String[]> params = req.getParameterMap();
            int a = Integer.parseInt(req.getParameter("a"));
            int  b = Integer.parseInt(req.getParameter("b"));
            String op = req.getParameter("op");
            int result = 0;
            if (op.equals("add")){
                result = a+b;
            }//just add for now
            writer.write(result);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);//todo check later
    }
}
