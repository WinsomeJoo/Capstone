package capstone.daily.service;

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


    public DailyPost save(DailyPost dailyPost){
        Timestamp now = Timestamp.valueOf(LocalDateTime.now());
        dailyPost.setRegisterAt(now);
        dailyPostRepository.save(dailyPost);
        return dailyPost;
    }





}
