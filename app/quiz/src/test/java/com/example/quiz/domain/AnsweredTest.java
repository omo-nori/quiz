package com.example.quiz.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AnsweredTest {
    @DisplayName("回答の正否を判定するテスト")
    @ParameterizedTest(name = "ケース{index}: 選択肢ID={0}, 判定結果={2}")
    @MethodSource("optionProvider")
    void isCorrectTest(long selectedOptionId, Map<Long, Option> options, boolean expected) {
        Question question = new Question(1L, "テスト問題１", 99, 10, options);
        Answer answer = new Answered(question, selectedOptionId);
        boolean actual = answer.isCorrect();
        assertEquals(expected, actual);
    }

    @DisplayName("得点のテスト")
    @ParameterizedTest(name = "ケース{index}: 選択肢ID={0}")
    @MethodSource("scoreProvider")
    void getScoreTest(long selectedOptionId, Map<Long, Option> options, int score, int expected) {
        Question question = new Question(1L, "テスト問題１", 99, score, options);
        Answer answer = new Answered(question, selectedOptionId);
        int actual = answer.getScore();
        assertEquals(expected, actual);
    }

    static Stream<Arguments> optionProvider() {
        Map<Long, Option> options = Map.of(
            1L, new Option(1L, "テスト選択肢１", false),
            2L, new Option(2L, "テスト選択肢２", true)
        );
        return Stream.of(
            arguments(1L, options, false),
            arguments(2L, options, true)
        );
    }

    static Stream<Arguments> scoreProvider() {
        Map<Long, Option> options = Map.of(
            1L, new Option(1L, "テスト選択肢１", false),
            2L, new Option(2L, "テスト選択肢２", true)
        );
        int score = 10;
        return Stream.of(
            arguments(1L, options, score, 0),
            arguments(2L, options, score, 10)
        );
    }
}
