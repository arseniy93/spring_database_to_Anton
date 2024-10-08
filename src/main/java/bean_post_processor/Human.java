package bean_post_processor;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Human {
    private String name;
    private int phoneNumber;
}
