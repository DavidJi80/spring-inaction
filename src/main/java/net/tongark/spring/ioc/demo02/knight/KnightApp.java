package net.tongark.spring.ioc.demo02.knight;

import net.tongark.spring.ioc.demo01.knight.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightAppconfig.class);
        Knight knight=context.getBean(BraveKnight.class);
        knight.embarkOnQuest();
    }
}
