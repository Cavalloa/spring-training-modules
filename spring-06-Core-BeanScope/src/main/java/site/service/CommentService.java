package site.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import site.acavallo.model.Comment;
import site.acavallo.proxy.CommentNotificationProxy;
import site.acavallo.repository.CommentRepository;

@Component
public class CommentService {
    public CommentService(CommentRepository commentRepository, @Qualifier("emailCommentNotificationProxy") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) { //Save to database. Send email.
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }
}
