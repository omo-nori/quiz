package com.example.quiz.domain;

public class NoAnswer implements Answer {
    @Override
    public boolean isCorrect() {
        return false;
    }

    @Override
    public int getScore() {
        return 0;
    }
}
