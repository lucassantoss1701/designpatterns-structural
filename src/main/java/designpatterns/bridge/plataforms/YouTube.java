package designpatterns.bridge.plataforms;

public class YouTube implements IPlataform{
    public YouTube(){
        configureRMTP();
        System.out.println("YouTube iniciado!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube conta autoriada.");
    }

    @Override
    public void authToken() {
        System.out.println("Autorizando YouTube!");
    }
}
