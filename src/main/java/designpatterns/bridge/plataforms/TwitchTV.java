package designpatterns.bridge.plataforms;

public class TwitchTV implements IPlataform{
    public TwitchTV(){
        configureRMTP();
        System.out.println("TwitchTV iniciado!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV conta autoriada.");
    }

    @Override
    public void authToken() {
        System.out.println("Autorizando TwitchTV!");
    }
}
