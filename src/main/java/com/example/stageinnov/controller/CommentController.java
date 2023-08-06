package com.example.stageinnov.controller;

import com.example.stageinnov.entity.Comment;
import com.example.stageinnov.service.CommentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comment")
@CrossOrigin
public class CommentController {



    @Autowired
    private CommentService commentService;

    @GetMapping("/all")
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    @PostMapping("/save")
    public Comment save(@RequestBody Comment comment) {
        return commentService.save(comment);
    }

    @GetMapping("/{id}")
    public Optional<Comment> findById(@PathVariable Integer id) {
        return commentService.findById(id);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        commentService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id,@RequestBody Comment commentInfo) {
        commentService.update(id, commentInfo);
    }
}
