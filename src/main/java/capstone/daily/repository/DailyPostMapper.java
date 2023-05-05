package capstone.daily.repository;

import capstone.daily.dto.UpdateDailyPostDto;
import capstone.daily.vo.DailyPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DailyPostMapper {
    void save(DailyPost dailyPost);

    void update(@Param("dailyPostId")int dailyPostId,@Param("dailyPostDto") UpdateDailyPostDto dailyPostDt);


}
