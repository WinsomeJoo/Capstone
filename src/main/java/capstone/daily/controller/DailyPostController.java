package capstone.daily.controller;


import capstone.daily.dto.UpdateDailyPostDto;
import capstone.daily.service.DailyPostService;
import capstone.daily.vo.DailyPost;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/{dailyPostId}/edit")
    public UpdateDailyPostDto update(@PathVariable int dailyPostId, @RequestBody UpdateDailyPostDto updateDailyPostDto) {
        dailyPostService.update(dailyPostId, updateDailyPostDto);
        return updateDailyPostDto;
    }



}
