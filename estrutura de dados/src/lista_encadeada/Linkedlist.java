package lista_encadeada;

public class Linkedlist {
    private Node head;
    private Node tail;
    private int tam;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
        }
    }

    public Linkedlist(String data){
        this.tam=1;
        Node newNode=new Node(data);
        head=newNode;
        tail=newNode;
    }

    public void gettail(){
        if(this.head==null){
            System.out.println("lista vazia");
        }else{
            System.out.println("head: "+ this.head.data);
        }
    }

    public void gethead(){
        if(this.tail==null){
            System.out.println("lista vazia");
        }else{
            System.out.println("tail: "+ this.tail.data);
        }
    }

    public void getTam(){
        System.out.println("tamanho: "+ this.tam);
    }

    public void esvaziar(){
        head=null;
        tail=null;
        tam=0;
    }

    public void print(){
        System.out.println("--------------");
        Node temp=this.head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("--------------");
    }
    //inserir no final
    public void append(String data){
        Node newNode=new Node(data);
        if(tam==0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        tam++;
    }
    public Node removerlast(){
        if(tam==0) return null;
        Node pre=head;
        Node temp=null;
        while (pre.next!=tail){
            pre=pre.next;
        }
        temp=tail;
        tail=pre;
        tail.next=null;
        tam--;
        if(tam==0){
            head=null;
            tail=null;
        }
        return temp;
    }

    public void prepend(String data){
        Node newNode=new Node(data);
        if(tam==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        tam++;
    }

    public Node remover_inicio(){
        if(tam==0) return null;
        Node temp=head;
        head=head.next;
        temp.next=null;
        tam--;
        if(tam==0){
            head=null;
            tail=null;
        }
        return temp;
    }

    public  Node get(int index){
        if(index<0 || index>=tam) return null;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public boolean inserir(int index,String data){
        if(index<0 || index>tam)return  false;
        if(index==0){
            prepend(data);
            return true;
        }
        if(index==tam){
            append(data);
            return true;
        }
        Node newnode=new Node(data);
        Node temp= get(index-1);
        newnode.next=temp.next;
        temp.next=newnode;
        tam++;
        return true;
    }

    public boolean set(int index,String data){
        Node temp=get(index);
        if(temp!=null){
            temp.data=data;
            return true;
        }
        return false;
    }

    public Node remove(int index){
        if (index<0 || index>=tam) return null;
        if(index==0) return remover_inicio();
        if(index==tam-1) return removerlast();
        Node prev=get(index-1);
        Node temp=prev.next;
        prev.next=temp.next;
        temp.next=null;
        tam--;
        return   temp;
    }


    public static void main(String[] args){
        Linkedlist list=new Linkedlist("elemento 1");
        list.append("elemetno 2");
        list.append("elemento 3");
        list.prepend("elemento 0");
        System.out.println(list.get(2).data);
        list.gethead();
        list.gettail();
        list.getTam();
        list.inserir(3,"elemento 2.5");
        list.removerlast();
        list.remover_inicio();
        list.remove(2);
        list.print();
    }

}
