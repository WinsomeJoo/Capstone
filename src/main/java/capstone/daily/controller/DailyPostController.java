package capstone.daily.controller;


import capstone.daily.dto.ThumbnailDailyPostDto;
import capstone.daily.dto.UpdateDailyPostDto;
import capstone.daily.service.DailyPostService;
import capstone.daily.vo.DailyPost;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dailyPost")
public class DailyPostController {

    private final DailyPostService dailyPostService;

    @PostMapping("")
    public DailyPost saveDailyPost(@RequestBody DailyPost dailyPost){
        dailyPostService.saveDailyPost(dailyPost);
        return dailyPost;
    }

    @PostMapping("/{dailyPostId}/edit")
    public UpdateDailyPostDto updateDailyPost(@PathVariable int dailyPostId, @RequestBody UpdateDailyPostDto updateDailyPostDto) {
        dailyPostService.updateDailyPost(dailyPostId, updateDailyPostDto);
        return updateDailyPostDto;
    }

    @GetMapping("")
    public List<ThumbnailDailyPostDto> findThumbnail(@RequestBody ThumbnailDailyPostDto thumbnailDailyPostDto) {
        List<ThumbnailDailyPostDto> thumbnail = dailyPostService.findThumbnail(thumbnailDailyPostDto);
        return thumbnail;
    }


    @DeleteMapping("{dailyPostId}")
    public void deleteDailyPost(@PathVariable int dailyPostId){
        dailyPostService.deleteDailyPost(dailyPostId);
    }


}
