package site.acavallo.repository;

import site.acavallo.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
