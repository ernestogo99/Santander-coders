package arvore;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public noh raiz;


    public static class noh{
        public int value;
        public noh left;
        public noh right;

        public noh(int value){
            this.value=value;
        }

        public boolean isleaf(){
            return  (this.left==null) && (this.right==null);
        }
    }

    public void insert(int value){
        if(raiz==null) raiz= new noh(value);
        else{
            noh novo=new noh(value);
            Queue<noh> fila=new LinkedList<>();
            fila.add(raiz);
            while (fila.size()>0){
                noh currentnode=fila.remove();
                if(currentnode.left==null){
                    currentnode.left=novo;
                    break;
                }else{
                    fila.add(currentnode.left);
                }
                if(currentnode.right==null){
                    currentnode.right=novo;
                    break;
                }else{
                    fila.add(currentnode.right);
                }
            }
        }
    }
    private void pre_order(final noh node){
        //raiz-esquerda-direita
        if(node==null) return;
        System.out.println(node.value);
        pre_order(node.left);
        pre_order(node.right);
    }

    public void preorder(){
        pre_order(raiz);
    }

    private void em_order(final noh node){
        //esquerda-raiz-direita
        if (node==null)return;
        em_order(node.left);
        System.out.println(node.value);
        em_order(node.right);
    }

    public void emordem(){
        em_order(raiz);
    }

    private void pos_ordem(final noh node){
        //esquerda-direita-raiz
        if (node==null) return;
        pos_ordem(node.left);
        pos_ordem(node.right);
        System.out.println(node.value);
    }

    public void posordem(){
        pos_ordem(raiz);
    }

    public void busca_em_largura(){
        if(raiz==null) return;
        Queue<noh> fila=new LinkedList<>();
        fila.add(raiz);
        while (!fila.isEmpty()){
            noh node=fila.remove();
            if(node.left!=null) fila.add(node.left);
            if(node.right!=null) fila.add(node.right);

            System.out.println(node.value);

        }
    }

    public void busca_profundidade(){
        pre_order(raiz);
    }

    public static void main(String[] args) {
        Tree arvore=new Tree();
        arvore.insert(37);
        arvore.insert(11);
        arvore.insert(66);
        arvore.insert(8);
        arvore.insert(17);
        arvore.insert(42);
        arvore.insert(72);
        System.out.println("------");
        arvore.preorder();
        System.out.println("------");
        System.out.println("------");
        arvore.emordem();
        System.out.println("------");
        System.out.println("------");
        arvore.posordem();
        System.out.println("------");
        System.out.println("------");
        arvore.busca_em_largura();
        System.out.println("------");
    }


}
