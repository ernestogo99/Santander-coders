package lojas;

import animais.Animal;
import animais.Cachorro;

public class Petshop {
    public void darbanho(Animal animal){
        animal.setEstado_espirito("limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstado_espirito("tosado");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstado_espirito("saudade");
    }
}
