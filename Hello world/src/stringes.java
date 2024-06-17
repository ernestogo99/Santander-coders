import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class stringes {
    public static void main(String[] args){
        //ola, {nome}. hoje é {data}
        String nome="ernesto";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String outronome="ernestogo";
        System.out.println(nome.equalsIgnoreCase(outronome));// ignora as diferenças de maisculos e minusculos

        LocalDate hoje= LocalDate.now();// representa o dia de hoje com a data local
        Locale brasil=new Locale("pt","BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));
        String dia_semana= hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;
        LocalDateTime agora=LocalDateTime.now(); // que horas são atualmente
        if(agora.getHour()>=0 && agora.getHour()<12){
            saudacao="bom dia";
        } else if (agora.getHour()>=12 && agora.getHour() <18) {
            saudacao="boa tarde";
        }else if(agora.getHour()>= 18 && agora.getHour()<24){
            saudacao="boa noite";
        }else{
            saudacao="erro";
        }

        System.out.printf("ola %s. hoje é  %s, %s.%n",nome,dia_semana,saudacao.toUpperCase());
    }
}
