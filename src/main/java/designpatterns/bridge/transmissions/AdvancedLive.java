package designpatterns.bridge.transmissions;

import designpatterns.bridge.plataforms.IPlataform;

public class AdvancedLive extends Live{

    public AdvancedLive(IPlataform plataform){
        super.plataform = plataform;
    }

    public void subtitles(){
        System.out.println("Legendas ativadas!");
    }

    public void comments(){
        System.out.println("Comentários ok!");
    }
}
