package jdbc.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table("people")
public class Person {
    @Id
    private Long id;
    private Integer age;
    private String firstName;
    private String lastName;
}
