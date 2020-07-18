package net.tongark.spring.ioc.demo02.knight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightAppconfig {
    /**
     * 定义一个骑士
     * @return
     */
    @Bean
    public BraveKnight braveKnight(){
        //设置骑士的名字
        BraveKnight braveKnight=new BraveKnight("Jone");
        //给予骑士一个探险任务
        braveKnight.setQuest(slayDragonQuest());
        return braveKnight;
    }

    /**
     * 定义一个探险任务
     * @return
     */
    @Bean
    public SlayDragonQuest slayDragonQuest(){
        return new SlayDragonQuest();
    }
}
