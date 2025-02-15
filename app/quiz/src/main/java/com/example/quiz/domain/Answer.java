package com.example.quiz.domain;

/**
 * 回答.
 */
public interface Answer {
    /**
     * 正否を判定する.
     */
    public boolean isCorrect();

    /**
     * 得点を出す.
     */
    public int getScore();
}
