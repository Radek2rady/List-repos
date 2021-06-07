package com.gfa.quiz.services;

import com.gfa.quiz.models.Question;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface QuestionService {
    List<Question> getAll();

    void addQuestion(Question question);

    Question randomQuestion();

    Question findQuestionById(long id);

    boolean checkAnswer(long questionId, long answerId);


}
