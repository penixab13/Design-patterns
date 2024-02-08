package com.hatim.org.design.patterns.simple.example;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy() {
        if (strategy != null) {
            strategy.execute();
            return "Strategy executed";
        }
        return "No strategy set";
    }
}

