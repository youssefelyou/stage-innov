package com.example.stageinnov.service;

import com.example.stageinnov.entity.Comment;
import com.example.stageinnov.repository.CommentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    public Optional<Comment> findById(Integer id) {
        return commentRepository.findById(id);
    }

    @Transactional
    public void deleteById(Integer id) {
        commentRepository.deleteById(id);
    }
}
