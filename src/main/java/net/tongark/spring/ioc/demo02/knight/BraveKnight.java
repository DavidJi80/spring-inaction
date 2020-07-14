package net.tongark.spring.ioc.demo02.knight;

import net.tongark.spring.ioc.demo01.knight.Knight;
import net.tongark.spring.ioc.demo01.knight.Quest;

/**
 * 无畏骑士
 */
public class BraveKnight implements Knight {
    private String name;
    private Quest quest;

    public BraveKnight(String name) {
        this.name = name;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    @Override
    public Object embarkOnQuest() {
        System.out.println("BraveKnight "+this.name+" embarkOnQuest");
        return quest.embark();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
