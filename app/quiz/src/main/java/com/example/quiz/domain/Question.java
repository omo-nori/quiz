package com.example.quiz.domain;

import java.util.Map;

/**
 * 問題.
 */
public record Question(long id, String text, int timeLimit, int score, Map<Long, Option> options) {
    /**
     * 正否を判定する.
     */
    public boolean isCorrect(long selectedOptionId) {
        return options.get(selectedOptionId).correctAnswer();
    }
}
