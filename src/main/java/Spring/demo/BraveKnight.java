package Spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class BraveKnight implements Knight {

    private AbstractQuest quest;

    public BraveKnight(AbstractQuest quest) {
        this.quest = quest;// quest被注入到对象中
    }

    @Override
    public void embarhOnQuest() throws Exception {
        quest.embark();
    }

}