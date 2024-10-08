package dependency_injection;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
@AllArgsConstructor
// внедрение зависиомти через конструктор
//перед конструктором ставим @Autowired чтобы внедрить бин движок, но в версии 4,3 спринг данную аннотацию можно пропустить
public class CarWithConstructor {
    private Engine engine;
}
