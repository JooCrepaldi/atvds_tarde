public class Triangulo extends Figura {

    //construtor padrão da classe Figura
    public Triangulo() {
        super();
    }

    //segundo construtor --> com os atributos da Figura
    public Triangulo(double altura, double largura) {
        super(altura, largura);
    }

    //método para cálculo do triângulo
    public void areaTriangulo(double altura, double largura) {
        double val = ((altura*largura) / 2);
        System.out.println(val);
    }

}
