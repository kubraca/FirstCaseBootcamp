package com.example.firstcasebootcamp.service.Impl;

import com.example.firstcasebootcamp.repository.CommentsRepository;
import com.example.firstcasebootcamp.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentsRepository commentsRepository;
}
