package com.example.quiz.domain;

/**
 * 回答あり.
 */
public class Answered implements Answer {
    private Question question;
    private Long selectedOptionId;

    public Answered(Question question, Long selectedOptionId) {
        this.question = question;
        this.selectedOptionId = selectedOptionId;
    }

    @Override
    public boolean isCorrect() {
        return question.isCorrect(selectedOptionId);
    }

    @Override
    public int getScore() {
        if (isCorrect()) {
            return question.score();
        }
        return 0;
    }
}
