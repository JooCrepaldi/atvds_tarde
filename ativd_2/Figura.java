public class Figura{
    //atributos da figura
    private double altura;
    private double largura;

    //construtor padrão
    public Figura(){}

    //segundo construtor
    public Figura(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    //getters e setters
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }

}