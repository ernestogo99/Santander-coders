package fila;

public class Queue {
    private node ini;
    private node fim;
    private int tam;


    public class node{
        int value;
        node next;
        node(int value){
            this.value=value;
        }

        public int getValue() {
             return this.value;
        }
    }

    public Queue(int value){
        node novo=new node(value);
        ini=novo;
        fim=novo;
        tam++;
    }

    public void getfirst(){
        if(ini!=null){
            System.out.println("First: "+ini.value);
        }else{
            System.out.println("fila esta vazia");
        }
    }

    public void getlast(){
        if(fim!=null){
            System.out.println("Last: "+fim.value);
        }else{
            System.out.println("fila esta vazia");
        }
    }

    public void getTam(){
        System.out.println("tamanho: "+ tam);
    }

    public void print(){
        System.out.println("---------");
        node temp=ini;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
        System.out.println("---------");
    }

    public void enfilar(int value){
        node novo=new node(value);
        if(tam==0){
            ini=novo;
            fim=novo;
        }else{
            fim.next=novo;
            fim=novo;
        }
        tam++;
    }

    public  node desenfilar(){
        if(tam==0)return null;
        node temp=ini;
        if(tam==1){
            ini=null;
            fim=null;
        }else{
            ini=ini.next;
            temp.next=null;
        }
        tam--;
        return temp;
    }

    public static void main(String[] args) {
        Queue fila= new Queue(1);
        fila.enfilar(2);
        fila.enfilar(3);
        fila.desenfilar();
        fila.getfirst();
        fila.getlast();
        fila.getTam();
        fila.print();
    }
}
