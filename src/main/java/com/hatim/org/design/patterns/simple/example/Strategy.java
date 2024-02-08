
package com.hatim.org.design.patterns.simple.example;

    // Interface Strategy
public interface Strategy {
    void execute();
}

// ConcreteStrategyA
 class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing ConcreteStrategyA");
    }
}

// ConcreteStrategyB
class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing ConcreteStrategyB");
    }
}

