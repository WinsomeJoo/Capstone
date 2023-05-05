package capstone.daily.repository;


import capstone.daily.vo.DailyPost;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DailyPostRepository {
    private final DailyPostMapper dailyPostMapper;

    public DailyPost save(DailyPost  dailyPost){
        dailyPostMapper.save(dailyPost);
        return dailyPost;
    }


}
