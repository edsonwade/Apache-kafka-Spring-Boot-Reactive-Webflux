package code.vanilson.apachekafka.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {

    private int studentId;
    private String firstName;
    private String lastName;

}
