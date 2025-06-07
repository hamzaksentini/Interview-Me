package AI.Ksentini.InterviewMe.Models;

import AI.Ksentini.InterviewMe.Enums.QuestionType;
import lombok.*;
import org.springframework.data.elasticsearch.annotations.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(indexName = "questions")
public class Question extends BaseEntity {

    @Field(type = FieldType.Text, analyzer = "english")
    private String text;

    @Field(type = FieldType.Keyword)
    private QuestionType type; // ENUM

    @Field(type = FieldType.Keyword)
    private String industry;

    @Field(type = FieldType.Integer)
    private int difficultyLevel; // 1-5
}