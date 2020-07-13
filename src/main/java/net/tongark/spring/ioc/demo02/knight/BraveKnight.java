package net.tongark.spring.ioc.demo02.knight;

import net.tongark.spring.ioc.demo01.knight.Knight;
import net.tongark.spring.ioc.demo01.knight.Quest;

public class BraveKnight implements Knight {
    private String name;
    private Quest quest;

    @Override
    public Object embarkOnQuest() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
