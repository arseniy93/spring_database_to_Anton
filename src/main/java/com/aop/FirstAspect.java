package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FirstAspect {
    /**
     * аспект
     */
    @Before(value = "isServiceLayerPackage()")
    public void addLogging1() {
        System.out.println("isServiceLayerPackage");
    }

    @After(value = "isServiceLayerPackage()&& target(repository)",argNames = "point, repository")
    public void addLogging(JoinPoint point, Object repository) {
        System.out.println("isServiceLayerPackage"+repository);
    }
//    @Before("execution(public * com.dmdev.spring.service.*Service.findById(*))")


    /**
     * ClassLoader
     * poincut - условия
     */
    /**
     * @within проверяет наличие аннотации на уровне класса
     */


//    @Pointcut(value = "@within(org.springframework.stereotype.Repository)")
//    public void isSRepositoryLayerMarkedAnnotated() {
//        System.out.println("org.springframework.stereotype.Repository there is");
//    }
//
//    /**
//     * within - проверяет наличие класса в указанном пакете
//     */
    @Pointcut("within(com.aop..*)")
    public void isServiceLayerPackage() {
        System.out.println("ldldldl");
    }
//
//    /**
//     * @this - проверяет, принадлжет ли тип класса этому классу
//     * обращается к прокси которые получается из аоп
//     */

    @Pointcut(value = "this(com.aop.service.*)")
    public void isRepositoryImplementsFromProxy() {
    }
//
//    @Pointcut(value = "this(com.aop.repository.Repository)")
//    public void isRepositoryService() {
//    }
//
//    /**
//     * target проверяет принаджледит ли тип класса этому класса к исходному объекту
//     */
//
@Pointcut(value = "target(com.aop.repository.RepositoryImpl)")
public void isRepositoryImplementsFromObject() {
}
//
//    /**
//     * MethodMatcher
//     */
//
//
//    /**
//     * @annotation проверяет налчие аннотации на уровне метода
//     */
//
//    @Pointcut(value = "@annotation(com.aop.annotation.Sam)")
//    public void IsMethodHaveAnnotationSam() {
//
//    }
//
//    /**
//     * проверка двух условий : двух методов в FirstAspect  isRepositoryImplementsFromObject() && IsMethodHaveAnnotationSam()
//     */
//    @Pointcut(value = "isRepositoryImplementsFromObject() && IsMethodHaveAnnotationSam()")
//    public void isRepositoryPAckageAnsAnnotationSam() {
//
//    }
//
//    /**
//     * args для работы с аргументами метода.
//     * .. любые параметры. args(java.lang.String,..)
//     * *-один параметр args(java.lang.String,*)
//     */
//
//    @Pointcut(value = "args(java.lang.String)")
//    public void isStringArg() {
//    }
//
//    /**
//     * args проверяет стоит ли аннотация в аргумента метода
//     */
//    @Pointcut(value = "@args(com.aop.annotation.Nick)")
//    public void isNickAnnotation() {
//
//    }
//
//    /**
//     * bean проверяет имя нашего bean
//     */
//
//    @Pointcut(value = "bean(*Service)")
//    public void IsBeanName() {
//
//    }
//
//    /**
//     * execute(some param)
//     *
//     * modifiers-pattern? - модификатор достпупа(опицонально)?public
//     *          ret-type-pattern - тип возвращаемого значения
//     *          declaring-type-pattern?name-pattern(param-pattern) - класс(опионально), в котором объявлен метод и его имя com.aop.repository.*Service.print(..)
//     *          throws-pattern? - исключения, которые может бросить метод(опиционально)
//     */
//    @Pointcut(value = "public * aop.repository.*Service.print(..) ")
//    public void anyFindByIdServiceMetgod(){
//
//    }


}
