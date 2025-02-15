package com.example.quiz.domain;

/**
 * 選択肢.
 */
public record Option(long id, String text, boolean correctAnswer) {}
