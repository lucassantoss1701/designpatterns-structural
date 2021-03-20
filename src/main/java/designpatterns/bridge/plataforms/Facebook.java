package designpatterns.bridge.plataforms;

public class Facebook implements IPlataform{

    public Facebook(){
        configureRMTP();
        System.out.println("Facebook iniciado!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook conta autoriada.");
    }

    @Override
    public void authToken() {
        System.out.println("Autorizando Facebook!");
    }
}
