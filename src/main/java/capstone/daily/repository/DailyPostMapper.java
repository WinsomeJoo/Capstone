package capstone.daily.repository;

import capstone.daily.dto.DailyPostDto;
import capstone.daily.vo.DailyPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface DailyPostMapper {
    void save(DailyPost dailyPost);

    void update(@Param("userId")int userId,@Param("dailyPostDto")DailyPostDto dailyPostDt);


}
