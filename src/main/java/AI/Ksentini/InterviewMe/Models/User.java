package AI.Ksentini.InterviewMe.Models;

import AI.Ksentini.InterviewMe.Enums.ERoles;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(indexName = "users")
public class User extends BaseEntity {
    @Field(type = FieldType.Text)
    private String username;

    @Field(type = FieldType.Keyword)
    private String email;

    @Field(type = FieldType.Nested)
    private List<ERoles> roles;


}
