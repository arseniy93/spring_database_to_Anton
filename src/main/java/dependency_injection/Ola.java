package dependency_injection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
@Scope("prototype")
public class Ola {

    {
        System.out.println("Я блок инициализации " + this.getClass().getSimpleName());
    }


    static {
        System.out.println("Я статический блок инициализации " + Ola.class.getSimpleName());
    }

    public Ola() {
        System.out.println("Я конструктор " + this.getClass().getSimpleName());
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("Я инит-метод " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Я дестрой-метод " + this.getClass().getSimpleName());
    }
}
