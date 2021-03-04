package ru.geekbrains;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {

    static final Logger log = LoggerFactory.getLogger(TriangleTest.class);


    // метод выполняется прежде ВСЕХ тестов
    @BeforeAll
    static void setUp() {
        log.info("\tBEFORE ALL TESTS =>");
        int a;
        int b;
        int c;

        {
            a = (int) (Math.random() * 100);
            b = (int) (Math.random() * 100);
            c = (int) (Math.random() * 100);
        }
    }
}

