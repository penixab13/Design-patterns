package com.soukaina.app;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
 
/*un filtre (souvent appelé filtre servlet) est un composant de logiciel 
qui s'exécute sur le serveur web pour effectuer des opérations de prétraitement
 et de post-traitement sur les requêtes HTTP entrantes et les réponses HTTP sortantes. */
public class SecurityFilter implements Filter {
 
 
         public void init(FilterConfig filterConfig) throws ServletException { 
			System.out.println("security filter init");
		 }
		 
		public void destroy() {
				System.out.println("security filter destroyed");
		}
 
     public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chainObj) throws IOException, ServletException {
        System.out.println("IN SECURITY FILTER");
		
		String restrictedUser="RACHID";
        RequestDispatcher rdObj = null;
        PrintWriter out = resp.getWriter();
        
        String yourName = req.getParameter("your_name");
        
        if( !restrictedUser.equals(yourName.toUpperCase()) ) {
            /***** Send Request To Next Resource *****/
            chainObj.doFilter(req, resp);
        } else {
            out.write("<html><body><div  style='text-align: center;'>");
			out.write("<h1>"+restrictedUser+" you are not allowed in!</h1>");
			out.write("<h1>Please contact the administrator.</h1>");
			out.write("</div></body></html>");
        }
 
        
        out.close();
    }

}



