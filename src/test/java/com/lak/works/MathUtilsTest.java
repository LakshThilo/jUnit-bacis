package com.lak.works;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils utils;

    @Nested
    class Subtraction {

        @Test
        @DisplayName("Positive values")
        void testSubstationPas(){
            assertEquals(4,utils.subtraction(8,4));
            assertEquals(-4,utils.subtraction(-8,-4));

        }

        @Test
        @DisplayName("Negative values")
        void testSubtractionNeg(){
            assertEquals(-4,utils.subtraction(4,8));
            assertEquals(-12,utils.subtraction(-8,4));

        }
    }


    @Test
    @BeforeAll
    static void beforeAllInit(){
        System.out.println("Running Before All..\n");
    }

    @BeforeEach
    void init(){
      utils = new MathUtils();
    }

    @Test
    @AfterEach
    void cleanUp(){
        System.out.println("Cleaning up...\n");
    }

    @Test
    void testAddition() {
        assertEquals(utils.addition(5,5),10);
    }

   @RepeatedTest(3)
    void division() {
        assertThrows(ArithmeticException.class, () -> utils.division(1,0),"Divided by zero");
    }

    @Test
    @DisplayName("Multiplication")
    void testMultiplication(){
        assertAll(
                () -> assertEquals(4,utils.multiplication(2,2)),
                () -> assertEquals(2,utils.multiplication(1,2)),
                () -> assertEquals(4,utils.multiplication(-2,-2)),
                () -> assertEquals(-4,utils.multiplication(-2,2))

        );

    }


}