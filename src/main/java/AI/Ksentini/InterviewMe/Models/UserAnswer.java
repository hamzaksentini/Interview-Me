package AI.Ksentini.InterviewMe.Models;


import lombok.*;
import org.springframework.data.elasticsearch.annotations.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAnswer {

    @Field(type = FieldType.Keyword)
    private String questionId;

    @Field(type = FieldType.Text)
    private String answerText;

    @Field(type = FieldType.Double)
    private Double score;

    @Field(type = FieldType.Text)
    private String feedback;
}
