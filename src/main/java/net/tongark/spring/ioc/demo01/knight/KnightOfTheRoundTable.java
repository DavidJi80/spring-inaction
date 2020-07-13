package net.tongark.spring.ioc.demo01.knight;

/**
 * 圆桌骑士
 */
public class KnightOfTheRoundTable implements Knight {
    private String name;
    private Quest quest;

    public KnightOfTheRoundTable(String name) {
        this.name = name;
    }

    /**
     * 分配探险任务。
     * 是一个接口，而不是具体的实现类。这是DI带来的松耦合。
     *
     * @param quest
     */
    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    @Override
    public Object embarkOnQuest() {
        System.out.println(this.name+" embarkOnQuest");
        return quest.embark();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
