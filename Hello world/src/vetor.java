import java.util.Arrays;

public class vetor {
    public static void main(String[] args){
        int[] numeros=new int[5];
        numeros[0]=1;
        numeros[1]=2;
        numeros[2]=3;
        numeros[3]=4;
        numeros[4]=5;
        for (int i=0;i<numeros.length;++i){
            System.out.println(numeros[i]);
        }

        String[] letras={"a","b","c","d","e"};
        for(int i=0;i<letras.length;++i){
            System.out.println(letras[i]);
        }

        //outra forma de printar arrays
        System.out.println(Arrays.toString(letras));
        //
        int[] numbers={9,10,20,22,3};
        int maior=numbers[0],menor=numbers[0];
        float media =(float) 0;
        for(int i=0;i<numbers.length;++i){
            if(numbers[i]>maior){
                maior=numbers[i];
            }
            if(numbers[i]<menor){
                menor=numbers[i];
            }
            media+=numbers[i];
        }
        System.out.println("maior: "+ maior);
        System.out.println("menor: "+ menor);
        System.out.println("media: "+ media/numbers.length);
    }




}
