package com.example.firstcasebootcamp.repository;

import com.example.firstcasebootcamp.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments,Long> {
}
