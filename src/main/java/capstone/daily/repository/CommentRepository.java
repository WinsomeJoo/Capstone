package capstone.daily.repository;

import capstone.daily.vo.Comment;
import capstone.daily.vo.DailyPost;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class CommentRepository {
    private final CommentMapper commentMapper;

    public Comment saveComment(int dailyPostId,Comment comment){
        commentMapper.saveComment(dailyPostId,comment);
        return comment;
    }

}
