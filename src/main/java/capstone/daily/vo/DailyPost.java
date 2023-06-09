package capstone.daily.vo;

import lombok.*;

import java.sql.Timestamp;


@Data
public class DailyPost {
    private int dailyPostId;
    private int userId;
    private String title;
    private String content;
    private String image;
    private Timestamp registerAt;
    private Timestamp updatedAt;

}
