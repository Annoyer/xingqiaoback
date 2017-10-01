package security;

import net.sf.json.JSONObject;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by joy12 on 2017/9/23.
 */
public class AuthFailHandler implements AccessDeniedHandler {
    private String errorPage;

    public AuthFailHandler() {

    }



    public AuthFailHandler(String errorPage) {

        this.errorPage = errorPage;

    }



    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        errorPage = "access_err?errType=noAuth";
        if(request.getHeader("x-requested-with") != null){
            //是ajax请求
            System.out.println("handler catch ajax");
            //response.sendRedirect(errorPage);
            PrintWriter out = response.getWriter();
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("errorPage",errorPage);
            out.write(jsonObject.toString());
            out.flush();
        }else if (!response.isCommitted()) {
            System.out.println("handler catch non-ajax");
            if (errorPage != null) {
                // Put exception into request scope (perhaps of use to a view)
                request.setAttribute(WebAttributes.ACCESS_DENIED_403, accessDeniedException);

                // Set the 403 status code.
                response.setStatus(HttpServletResponse.SC_FORBIDDEN);

                // forward to error page.
                RequestDispatcher dispatcher = request.getRequestDispatcher(errorPage);
                dispatcher.forward(request, response);
            } else {
                response.sendError(HttpServletResponse.SC_FORBIDDEN, accessDeniedException.getMessage());
            }
        }


    }



    public String getErrorPage() {

        return errorPage;

    }



    public void setErrorPage(String errorPage) {

        this.errorPage = errorPage;

    }
}
