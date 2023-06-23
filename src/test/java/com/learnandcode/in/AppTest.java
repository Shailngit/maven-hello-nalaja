package com.learnandcode.in;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testPrintsHelloWorld() {
    	App test = new App();
    	// Arrange
        String expectedOutput = "Hello World";

        // Act
        String actualOutput = test.getHello();

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
}

