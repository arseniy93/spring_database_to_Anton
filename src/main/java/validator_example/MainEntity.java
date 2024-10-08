package validator_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;

public class MainEntity {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigEntity.class);

        // Получаем валидатор из контекста
        Validator validator = context.getBean(Validator.class);

        // Создаем объект пользователя для валидации
        Entity user = new Entity();
        user.setName("Lol");
        user.setPassword("wear");
        // Создаем объект для хранения результатов валидации
        BindingResult bindingResult = new BeanPropertyBindingResult(user, "user");
        // Выполняем валидацию
        validator.validate(user, bindingResult);
        // Проверяем наличие ошибок
        if (bindingResult.hasErrors()) {
            System.out.println("Validation failed:");
            System.out.println(bindingResult.getFieldError());
            bindingResult.getAllErrors().forEach(error -> System.out.println(error.getDefaultMessage()));
        } else {
            System.out.println("Validation passed.");
        }

        // Закрываем контекст приложения
        context.close();
    }
}
