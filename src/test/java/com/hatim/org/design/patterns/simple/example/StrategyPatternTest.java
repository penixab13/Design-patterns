package com.hatim.org.design.patterns.simple.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class StrategyPatternTest {

    @Test
    public void testConcreteStrategyA() {
        Context context = new Context();
        Strategy strategy = new ConcreteStrategyA();
        context.setStrategy(strategy);

        assertEquals("Strategy executed", context.executeStrategy());
    }

    @Test
    public void testConcreteStrategyB() {
        Context context = new Context();
        Strategy strategy = new ConcreteStrategyB();
        context.setStrategy(strategy);

        assertEquals("Strategy executed", context.executeStrategy());
    }

    @Test
    public void testContextChangingStrategy() {
        Context context = new Context();
        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();

        // Initially set to strategy A
        context.setStrategy(strategyA);
        assertEquals("Strategy executed", context.executeStrategy());

        // Change to strategy B
        context.setStrategy(strategyB);
        assertEquals("Strategy executed", context.executeStrategy());
    }
}
