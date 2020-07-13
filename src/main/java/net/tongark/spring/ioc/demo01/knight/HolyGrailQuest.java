package net.tongark.spring.ioc.demo01.knight;

/**
 * 圣杯任务
 */
public class HolyGrailQuest implements Quest{
    public HolyGrailQuest(){}

    public Object embark(){
        return new HolyGrail();
    }
}
