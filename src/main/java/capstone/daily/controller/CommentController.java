package capstone.daily.controller;


import capstone.daily.service.CommentService;
import capstone.daily.vo.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/review")
public class CommentController {
    private final CommentService commentService;

    @PostMapping("{dailyPostId}")
    public Comment saveComment(@PathVariable int dailyPostId, @RequestBody Comment comment){
        commentService.saveComment(dailyPostId,comment);
        return comment;
    }


}
