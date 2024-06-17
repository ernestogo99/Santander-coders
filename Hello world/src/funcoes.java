public class funcoes {
    public static void main(String[] args){
        saudacao("ernestogo");
        System.out.println(soma(1,5));
    }

    //funcao
    public static void saudacao(String nome){
        System.out.println("ola, " +nome);
    }

    public static int soma(int number1, int number2){
        return number1+number2;
    }
}
