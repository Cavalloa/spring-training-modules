package site.proxy;

import site.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
