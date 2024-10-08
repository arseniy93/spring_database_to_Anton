package model;
import lombok.*;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Component//@Service//@Repository
public class User {
    private String name;
    private int age;

}
