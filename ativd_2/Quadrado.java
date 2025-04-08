public class Quadrado extends Figura{
    
    //construtor padrão da classe Figura
    public Quadrado(){
        super();
    }

    //segundo construtor --> com os atributos da Figura
    public Quadrado(double altura, double largura){
        super(altura, largura);
    }

    //método funcional para cálculo do quadrado
    public void areaQuadrado(double altura, double largura){
        double val = (altura*largura);
        System.out.println(val);
    }
}