package site.repository;

import site.acavallo.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
