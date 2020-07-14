package net.tongark.spring.ioc.demo01.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightApp {
    public static void main(String[] args) {
        //加载上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.demo01.knight/knight.xml");
        //获取Bean
        Knight knight = context.getBean("knight", Knight.class);
        //使用Bean
        knight.embarkOnQuest();
    }
}
