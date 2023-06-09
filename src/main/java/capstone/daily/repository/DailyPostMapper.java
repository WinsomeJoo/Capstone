package capstone.daily.repository;

import capstone.daily.dto.ThumbnailDailyPostDto;
import capstone.daily.dto.UpdateDailyPostDto;
import capstone.daily.vo.DailyPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DailyPostMapper {
    void saveDailyPost(DailyPost dailyPost);

    void updateDailyPost(@Param("dailyPostId")int dailyPostId,@Param("dailyPostDto") UpdateDailyPostDto dailyPostDt);

    List<ThumbnailDailyPostDto> findThumbnail(ThumbnailDailyPostDto thumbnailDailyPostDto);

    void deleteDailyPost(int dailyPostId);
}
