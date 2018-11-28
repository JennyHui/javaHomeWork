package Spring.DiDemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayerImpl implements CDPlayer{
    @Override
    public void play() {

    }

    @Autowired
    private void setData(){

    }
}