package capstone.daily.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateDailyPostDto {
    private int dailyPostId;
    private int userId;
    private String title;
    private String content;
    private String image;
    private Timestamp updatedAt;
}
