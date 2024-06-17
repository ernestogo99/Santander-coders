package arvore;

public class Bintree {
    public nohde raiz;

    public class nohde{
        public int value;
        public nohde left;
        public nohde right;

        nohde(int value){
            this.value=value;
        }
    }
    private void inserir(final nohde root,final int value){
        if(root==null) return;
        if(value==root.value) return;
        if(value> root.value){
            if(root.right==null)root.right=new nohde(value);
            else inserir(root.right,value);
        }else{
            if(root.left==null)root.left=new nohde(value);
            else inserir(root.left,value);
        }
    }

    public void insert(int valor){
        if(raiz==null){
            raiz=new nohde(valor);
        }else{
            inserir(raiz,valor);
        }
    }

    private void em_order(final nohde node){
        //esquerda-raiz-direita
        if (node==null)return;
        em_order(node.left);
        System.out.println(node.value);
        em_order(node.right);
    }

    public void emordem(){
        em_order(raiz);
    }

    public boolean contem(int value){
        return contains(raiz,value);
    }

    private boolean contains(final nohde root,final int value){
        if(root==null) return false;
        if(root.value==value) return true;
        if(value>root.value) return contains(root.right,value);
        else return contains(root.left,value);
    }

    public int minvalue(nohde currentnode){
        while (currentnode.left!=null){
            currentnode=currentnode.left;
        }
        return currentnode.value;
    }

    private nohde deletenoh(final nohde root,final int value){
        if(root==null)return null;
        if(value<root.value){
            root.left=deletenoh(root.left,value);
        }else if(value>root.value){
            root.right=deletenoh(root.right,value);
        }else{
            if(root.left==null && root.right==null){
                return null;
            } else if ((root.left==null)){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                int minvalue=minvalue(root.right);
                root.value=minvalue;
                root.right=deletenoh(root.right,minvalue);

            }
        }
        return root;
    }

    public void deletenode(int value){
        raiz=deletenoh(raiz,value);
    }

    public static void main(String[] args) {
        Bintree btree=new Bintree();
        btree.insert(2);
        btree.insert(1);
        btree.insert(3);

        btree.deletenode(3);
        btree.emordem();
        System.out.println(btree.contem(11));
        System.out.println(btree.contem(3));
    }
}
