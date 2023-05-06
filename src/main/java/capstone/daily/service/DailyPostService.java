package capstone.daily.service;

import capstone.daily.dto.ThumbnailDailyPostDto;
import capstone.daily.dto.UpdateDailyPostDto;
import capstone.daily.repository.DailyPostRepository;
import capstone.daily.vo.DailyPost;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class DailyPostService {
    private final DailyPostRepository dailyPostRepository;


    public DailyPost saveDailyPost(DailyPost dailyPost){
        Timestamp now = Timestamp.valueOf(LocalDateTime.now());
        dailyPost.setRegisterAt(now);
        dailyPostRepository.saveDailyPost(dailyPost);
        return dailyPost;
    }

    public UpdateDailyPostDto updateDailyPost(int dailyPostId, UpdateDailyPostDto updateDailyPostDto){
        Timestamp now = Timestamp.valueOf(LocalDateTime.now());
        //updated createdAt 삽입
        updateDailyPostDto.setUpdatedAt(now);
        //daily PostId 삽입
        updateDailyPostDto.setDailyPostId(dailyPostId);

        dailyPostRepository.updateDailyPost(dailyPostId,updateDailyPostDto);
        return updateDailyPostDto;
    }

    public List<ThumbnailDailyPostDto> findThumbnail(ThumbnailDailyPostDto thumbnailDailyPostDto){
        List<ThumbnailDailyPostDto> thumbnail = dailyPostRepository.findThumbnail(thumbnailDailyPostDto);
        return thumbnail;
    }

    public void deleteDailyPost(int dailyPostId){
        dailyPostRepository.deleteDailyPost(dailyPostId);
    }



}
