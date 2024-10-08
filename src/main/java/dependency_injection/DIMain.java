package dependency_injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(DICOnfig.class);
        CarWithSetter carWithSetter = context1.getBean(CarWithSetter.class);
        carWithSetter.setEngine(new Engine());
        System.out.println(carWithSetter.toString());
        Ola ola = context1.getBean(Ola.class);
        System.out.println(ola.hashCode());
        Ola ola1 = context1.getBean(Ola.class);
        System.out.println(ola1.hashCode());
        context1.close();
    }
}
