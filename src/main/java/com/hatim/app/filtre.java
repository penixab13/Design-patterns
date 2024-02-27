package com.soukaina.app;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Date;

@WebFilter("/*") // Ce filtre s'applique à toutes les URL de l'application
public class filtre implements Filter {
 
    public void init(FilterConfig filterConfig) throws ServletException {
        // Méthode d'initialisation du filtre (peut être vide dans cet exemple)
    }
     
    public void destroy() {
        // Méthode de destruction du filtre (peut être vide dans cet exemple)
    }
 
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        // Enregistrement de la requête entrante
        System.out.println("[" + new Date() + "] Requête entrante depuis " + req.getRemoteAddr() + " : " + req.getLocalPort() + " " + req.getRemoteHost() + " " + req.getProtocol());
         
        // Passage de la requête à la servlet suivante dans la chaîne de filtres
        chain.doFilter(req, resp);
         
        // Enregistrement de la réponse sortante
        System.out.println("[" + new Date() + "] Réponse sortante vers " + req.getRemoteAddr() + " : " + req.getLocalPort() + " " + req.getRemoteHost() + " " + req.getProtocol());
    }
}

