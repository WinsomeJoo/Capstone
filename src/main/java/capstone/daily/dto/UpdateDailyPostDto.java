package capstone.daily.dto;


import lombok.*;

import java.sql.Timestamp;

@Data
public class UpdateDailyPostDto {
    private int dailyPostId;
    private int userId;
    private String title;
    private String content;
    private String image;
    private Timestamp updatedAt;
}
