public class booleano {
    public static  void main(String[] args){
        boolean fimdesemana=true;
        boolean fazendo_sol=false;
        boolean vamos_a_praia=fimdesemana && fazendo_sol;
        System.out.println(vamos_a_praia);


        String mensagem= fimdesemana ? "é fim de semana": "não é fim de semana";
        System.out.println(mensagem);
        //tabela verdade
        //operador && (and)
        // true and true=true
        // true and false=false
        //false and true=false
        //false and false= false

        //operador || (or)
        //true or true=true
        // true or false=true
        // false or true= true
        // false or false=false
    }
}
