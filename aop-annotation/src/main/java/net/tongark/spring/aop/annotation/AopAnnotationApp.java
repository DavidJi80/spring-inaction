package net.tongark.spring.aop.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopAnnotationApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AopAnnotationApp.class);
        CrusadesSoldier soldier = ctx.getBean(CrusadesSoldier.class);
        soldier.embarkOnQuest();
    }
}
