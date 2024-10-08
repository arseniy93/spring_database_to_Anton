package dependency_injection;

import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
// внедрение зависиомти через сеттер
public class CarWithSetter {
    @Setter
    private Engine engine;
    //внедрение зависимотей не рекомендуется
//    public Engine engine(){
//        return engine;
//    }
}
