package mercado;

public class Supermarket implements Supermercado {
    private final String[] items;
    private int lastindex;


    public Supermarket(final int size) {
        this.items=new String[size];
        this.lastindex=-1;//
    }

    @Override
    public void add(String item) {
        if(lastindex== items.length-1){
            System.err.println("lista cheia");
        }else{
            lastindex++;
            items[lastindex]=item;
        }
    }

    @Override
    public void print() {
        System.out.println("---------------");
        if(lastindex<0){
            System.out.println("LISTA VAZIA");
        }
        for(int i=0;i<=lastindex;i++){
            System.out.println(i + "-" + items[i]);
        }
        System.out.println("------------------");
    }

    @Override
    public void delete(int index) {
        if(index>=0 && index<=lastindex){
            shift(index);
            lastindex--;
        }else{
            System.out.println("indice invalido");
        }
    }
    //puxar os elementos da direita para a esquerda
    private void shift(final int index) {
        for (int i = index; i <lastindex ; i++) {
            items[i]=items[i+1];
        }
    }
}
