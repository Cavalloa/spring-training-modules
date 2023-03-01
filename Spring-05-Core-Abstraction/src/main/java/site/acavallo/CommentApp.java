package site.acavallo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.acavallo.config.CommentConfig;
import site.acavallo.model.Comment;
import site.acavallo.service.CommentService;

public class CommentApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

    }
}
