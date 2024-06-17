package animais;
// abstract-não pode criar objetos a partir dela, só ser herdada
public abstract class Animal {
    protected String nome;
    protected   String cor;
    protected int altura;
    protected double peso;
    protected String estado_espirito;

   protected void comer(){}
   protected void dormir(){}
   public abstract void soar(); /*todo animal tem o metodo soar*/

    public Animal(String cor, String nome,double peso) {
        this.cor = cor;
        this.nome = nome;
        this.peso=peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEstado_espirito() {
        return estado_espirito;
    }

    public void setEstado_espirito(String estado_espirito) {
        this.estado_espirito = estado_espirito;
    }
}
