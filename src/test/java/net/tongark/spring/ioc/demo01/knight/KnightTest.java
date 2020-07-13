package net.tongark.spring.ioc.demo01.knight;

import junit.framework.TestCase;

public class KnightTest extends TestCase {
    public void testEmbarkOnQuest(){
        KnightOfTheRoundTable knight=new KnightOfTheRoundTable("Bedivere");
        Quest quest=new HolyGrailQuest();
        knight.setQuest(quest);
        HolyGrail grail;
        try {
            grail=(HolyGrail)knight.embarkOnQuest();
            assertNotNull(grail);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
