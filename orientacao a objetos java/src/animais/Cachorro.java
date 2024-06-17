package animais;

public class Cachorro extends Animal{
   static int numerodecachorros;
   private int tamanho_do_rabo;



 public Cachorro(String nome, String cor, int altura,double peso,int tamanho_do_rabo, String estado_espirito){
     super(nome,cor,peso);
        this.nome=nome;
        this.cor=cor;
        this.altura=altura;
        this.peso=peso;
        this.tamanho_do_rabo=tamanho_do_rabo;
        this.estado_espirito=estado_espirito;
        numerodecachorros++;
  }

    public  int getNumerodecachorros() {
        return numerodecachorros;
    }

    public  void setNumerodecachorros(int numerodecachorros) {
        Cachorro.numerodecachorros = numerodecachorros;
    }

    public String getNome(){
      return  this.nome;
  }

  public void setNome(String nome){
      if(nome.equals("lily")){
          this.nome=null;
      }
      this.nome=nome;
  }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanho_do_rabo() {
        return tamanho_do_rabo;
    }

    public void setTamanho_do_rabo(int tamanho_do_rabo) {
        this.tamanho_do_rabo = tamanho_do_rabo;
    }

    public String getEstado_espirito() {
        return estado_espirito;
    }

    public void setEstado_espirito(String estado_espirito) {
        this.estado_espirito = estado_espirito;
    }

    public void latir(){
      System.out.println("AUAU");
   }

   public String pegar(String algo){
      return algo;
   }

   public  String interagir(String acao){
       switch (acao){
           case "carinho":this.estado_espirito="feliz";
           break;
           case "vai dormir":this.estado_espirito="bravo";
           break;
           case "pisar na patinha":this.estado_espirito="triste";
           break;
           default:this.estado_espirito="neutro";
           break;

       }
       return this.estado_espirito;
   }

    @Override //pega o método do pai da classe e altera o resultado(override)
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public  void soar(){
     System.out.println("au au");
    }
}
