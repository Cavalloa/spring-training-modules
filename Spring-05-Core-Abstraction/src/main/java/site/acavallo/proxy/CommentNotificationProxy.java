package site.acavallo.proxy;

import site.acavallo.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
