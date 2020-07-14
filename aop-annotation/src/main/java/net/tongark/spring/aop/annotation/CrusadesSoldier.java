package net.tongark.spring.aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class CrusadesSoldier {
    public String embarkOnQuest() {
        String quest="Crusades Quest";
        System.out.println(quest);
        return quest;
    }
}
