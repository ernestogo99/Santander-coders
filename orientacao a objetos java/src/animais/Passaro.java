package animais;

public class Passaro extends  Animal {
    static int numerodepassaros;

    public Passaro(String nome,String cor,double peso){
        super(nome,cor,peso);
    }

    @Override
    public  void soar(){
        System.out.println("pi pi");
    }



}
