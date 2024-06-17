package fila;

import java.util.Random;

public class Atendimento {
    public static void main(String[] args) {
        int n=5;
        var random= new Random();
        int cliente=random.nextInt(101);
        Queue fila= new Queue(cliente);
        System.out.println("chegou o cliente: " + cliente);
        //simula a chegada dos clientes
        for (int i=2;i<=n;i++){
            cliente=random.nextInt(101);
            System.out.println("chegou o cliente: "+ cliente);
            fila.enfilar(cliente);
        }
        // atendimento
        var node=fila.desenfilar();
        while (node!=null){
            System.out.println("atendido o cliente: " + node.getValue() );
            node=fila.desenfilar();
        }
    }
}
