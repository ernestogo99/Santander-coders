package pilha;

public class Inverter {
    public static void main(String[] args) {
        int [] numeros={1,2,3,4,5};
        inverter(numeros);
    }

    private static void inverter(final int[] numeros){
        Stack pilha=new Stack(numeros[0]);
        for(int i=1;i<numeros.length;++i){
            pilha.push(numeros[i]);
        }
        var node=pilha.pop();
        while (node!=null){
            System.out.println(node.getValue());
            node=pilha.pop();
        }
    }
}
