package capstone.daily.service;

import capstone.daily.repository.CommentRepository;
import capstone.daily.vo.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public Comment saveComment(int dailyPostId,Comment comment){
       commentRepository.saveComment(dailyPostId,comment);
       return comment;
    }
}
