package com.example.stageinnov.service;

import com.example.stageinnov.entity.Comment;
import com.example.stageinnov.entity.Image;
import com.example.stageinnov.repository.CommentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
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

    public void update(Integer id, Comment commentInfo) {
        Comment comment=commentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("comment not found with id " + id));
        comment.setNote(commentInfo.getNote());
        comment.setRate(commentInfo.getRate());
        commentRepository.save(comment);
    }
    public List<Comment> findCommentsByProjetId(int id) {
        return commentRepository.findCommentsByProjetId(id);
    }
}
