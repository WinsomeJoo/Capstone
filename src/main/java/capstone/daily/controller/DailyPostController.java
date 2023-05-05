package capstone.daily.controller;


import capstone.daily.service.DailyPostService;
import capstone.daily.vo.DailyPost;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dailyPost")
public class DailyPostController {

    private final DailyPostService dailyPostService;

    @PostMapping("")
    public DailyPost save(@RequestBody DailyPost dailyPost){
        dailyPostService.save(dailyPost);
        return dailyPost;
    }


}
