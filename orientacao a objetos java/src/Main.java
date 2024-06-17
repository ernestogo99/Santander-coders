import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import animais.Passaro;
import lojas.Petshop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //precisavamos de um método main para executar o aplicativo em java
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("ares","marrom",25,20.5,5,"nada");
        Gato gato1=new Gato("felix","branco",22);
        Passaro passaro1=new Passaro("jonas","azul",2);
        Petshop petshop=new Petshop();
        //polimorfismo
        Animal gato2=new Gato("ronaldo","preto",12);
        //
        cachorro1.soar();
        petshop.darbanho(cachorro1);
        System.out.println(cachorro1.getEstado_espirito());
        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstado_espirito());
    }
}