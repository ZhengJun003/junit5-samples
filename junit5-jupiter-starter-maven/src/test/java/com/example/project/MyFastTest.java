package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * MyFastTest
 */
class MyFastTest {

    @FastTest
    void myFastTest() {
        assertEquals(2, 1);
    }
}