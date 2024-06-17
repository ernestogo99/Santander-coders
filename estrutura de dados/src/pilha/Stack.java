package pilha;

public class Stack {
    private Node top;
    private int altura;

   public class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }
    }

    Stack(int value){
        Node newnode= new Node(value);
        top=newnode;
        altura=1;
    }

    public  void getop(){
        if(top==null){
            System.out.println("VAZIO");
        }else{
            System.out.println("topo: "+ top.value);
        }
    }

    public void getAltura(){
        System.out.println("altura: "+ altura);
    }

    public void print(){
        System.out.println("--------");
        Node temp=top;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
        System.out.println("--------");
    }

    public void push(int valor){
        Node novo=new Node(valor);
        if(altura==0){
            top=novo;
        }else{
            novo.next=top;
            top=novo;
        }
        altura++;
    }

    public Node pop(){
        if(altura==0) return null;
        Node temp=top;
        top=top.next;
        temp.next=null;
        altura--;
        return temp;

    }


    public static void main(String[] args){
        Stack pilha=new Stack(4);
        pilha.push(2);
        pilha.pop();
        pilha.getAltura();
        pilha.getop();
        pilha.print();
    }
}
