package designpatterns.bridge.transmissions;

import designpatterns.bridge.plataforms.IPlataform;

public class Live implements ITransmission{
    protected IPlataform plataform;

    public Live(){

    }

    public Live(IPlataform plataform){
        this.plataform = plataform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando transmissão!");
    }

    @Override
    public void result() {
        System.out.println("*** NO AR ***");
    }
}
