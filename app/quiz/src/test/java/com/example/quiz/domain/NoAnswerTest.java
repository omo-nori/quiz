package com.example.quiz.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NoAnswerTest {
    @DisplayName("回答の正否を判定するテスト")
    @Test
    void isCorrectTest() {
        Answer answer = new NoAnswer();
        assertFalse(answer.isCorrect());
    }

    @DisplayName("得点のテスト")
    @Test
    void getScoreTest() {
        Answer answer = new NoAnswer();
        assertEquals(0, answer.getScore());
    }
}
