package com.hatim.org.design.patterns.simple.example;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // Constructeur privé pour empêcher l'instanciation directe depuis l'extérieur de la classe
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Méthode pour exécuter une requête (exemple factice)
    /*public String executeQuery(String query) {
        // Ici, vous pouvez implémenter la logique réelle pour exécuter une requête
        return "Résultat de la requête : " + query;
    }*/
}
