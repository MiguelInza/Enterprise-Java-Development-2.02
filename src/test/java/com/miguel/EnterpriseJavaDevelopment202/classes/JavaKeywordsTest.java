package com.miguel.EnterpriseJavaDevelopment202.classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaKeywordsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void containsKeyword_true() {
            String input = "Don't break my heart";
            boolean result = JavaKeywords.containsKeyword(input);
            assertTrue(result);
        }

    @Test
    void containsKeyword_false() {
        String input = "I love to breakdance";
        boolean result = JavaKeywords.containsKeyword(input);
        assertFalse(result);
    }





}
