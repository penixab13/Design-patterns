package com.hatim.org.design.patterns.simple.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void testGetInstance() {
        // Obtenir deux instances de SimpleClass
    	Singleton instance1 = Singleton.getInstance();
    	Singleton instance2 = Singleton.getInstance();

        // Les deux instances doivent être les mêmes (singleton)
        assertEquals(instance1, instance2);
    }
}



 
	