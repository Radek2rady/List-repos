package com.gfa.quiz.services;

import com.gfa.quiz.models.Question;
import com.gfa.quiz.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuestionServiceImpl implements QuestionService {


    private QuestionRepository questionRepository;
    private List<Long> correctAnsweredIds = new ArrayList<>();

    @Autowired
    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public void addQuestion(Question question) {
        if (question != null) {
            questionRepository.save(question);
        }
    }

    @Override
    public Question randomQuestion() {
        Random random = new Random();
        List<Question> questions = questionRepository.findAll();
        questions.removeIf(q -> correctAnsweredIds.contains(q.getId()));
        int nrQuestions = questions.size();
        if (nrQuestions > 1) {
            Question question = questions.get(random.nextInt(nrQuestions));
            return question;
        }
        return null;
    }

    @Override
    public Question findQuestionById(long id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public boolean checkAnswer(long questionId, long answerId) {
        var q = questionRepository.findById(questionId).orElse(null);
        assert q != null;
        if (Integer.parseInt(q.getCorrectAnswer().substring(6, 7)) == answerId) {
            correctAnsweredIds.add(q.getId());
        }
        return Integer.parseInt(q.getCorrectAnswer().substring(6, 7)) == answerId;
    }
}
