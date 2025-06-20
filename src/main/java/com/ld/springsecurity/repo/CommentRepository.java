package com.ld.springsecurity.repo;

import com.ld.springsecurity.model.Comment;
import com.ld.springsecurity.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {
    Page<Comment> findByPost(Post post, Pageable pageable);

    List<Comment> findByPostId(String postId);
}
