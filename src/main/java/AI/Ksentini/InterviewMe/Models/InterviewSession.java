package AI.Ksentini.InterviewMe.Models;


import lombok.*;
import org.springframework.data.elasticsearch.annotations.*;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(indexName = "interview_sessions")
public class InterviewSession extends BaseEntity {

    @Field(type = FieldType.Keyword)
    private String userId;

    @Field(type = FieldType.Nested)
    private List<Question> questions;

    @Field(type = FieldType.Nested)
    private List<UserAnswer> userAnswers;

    @Field(type = FieldType.Double)
    private Double overallScore;
}