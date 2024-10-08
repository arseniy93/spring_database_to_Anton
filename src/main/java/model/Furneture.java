package model;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Component
public class Furneture {
    private int cost;
    private String name;

}
