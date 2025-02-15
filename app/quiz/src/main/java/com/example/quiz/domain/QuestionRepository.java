package com.example.quiz.domain;

import java.util.Collection;

public interface QuestionRepository {
    /**
     * 保存する.
     */
    public void save(Question question);

    /**
     * 削除する.
     */
    public void delete(Question question);

    /**
     * IDをキーに取得する.
     */
    public Question findById(Long id);

    /**
     * 全件取得する.
     */
    public Collection<Question> findAll();
}
