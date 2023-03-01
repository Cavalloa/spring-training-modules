package site.acavallo.proxy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import site.acavallo.model.Comment;
@Component
@Qualifier("PUSH")
public class PushNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification: " + comment.getText());
    }
}
