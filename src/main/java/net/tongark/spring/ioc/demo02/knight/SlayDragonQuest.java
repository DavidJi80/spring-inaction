package net.tongark.spring.ioc.demo02.knight;

import net.tongark.spring.ioc.demo01.knight.Quest;

/**
 * 屠龙任务
 */
public class SlayDragonQuest implements Quest {
    @Override
    public Object embark() {
        String slayDragon="Slay Dragon Quest";
        return slayDragon;
    }
}
