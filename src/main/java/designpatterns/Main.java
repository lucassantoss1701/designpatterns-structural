package designpatterns;

import designpatterns.bridge.plataforms.Facebook;
import designpatterns.bridge.plataforms.IPlataform;
import designpatterns.bridge.plataforms.TwitchTV;
import designpatterns.bridge.plataforms.YouTube;
import designpatterns.bridge.transmissions.AdvancedLive;
import designpatterns.bridge.transmissions.Live;

public class Main {

    public static void main(String[] args) {
        startlive(new YouTube());
        startlive(new TwitchTV());
        startlive(new Facebook());
    }

    public static void startlive(IPlataform plataform){
        System.out.println("Aguarde...");
        Live live = new AdvancedLive(plataform);
        live.broadcasting();
        live.result();
    }
}
