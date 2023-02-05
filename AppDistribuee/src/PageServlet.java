import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

@WebServlet(urlPatterns={"/mapage"})
public class PageServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        response.setContentType( "text/html" );
        PrintWriter out = response.getWriter();
        out.println( "<html><body>" );
        out.println( "<h1>Link to Bonjour Carl Haddad</h1>" );
        out.println( "<a href=\"http://localhost:8080/HelloServlet\">Let's Go!</a>");
        out.println( "</body></html>" );

        out.close();
    }
}
