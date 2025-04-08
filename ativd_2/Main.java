import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // definindo variável para fechar o looping do programa
        boolean sair = false;

        Scanner entrada = new Scanner(System.in);
        do {
            // definindo e instanciando os objetos
            Figura fig1 = new Figura();
            Quadrado q1 = new Quadrado();
            Triangulo t1 = new Triangulo();

            // desenvolvimento do menu de escolhas
            System.out.println("1-área do quadrado");
            System.out.println("2-área do triângulo");
            System.out.println("3-sair");

            System.out.println("escolha uma opção:");
            int op = entrada.nextInt();
            entrada.nextLine();

            switch (op) {
                case 1:
                    // verificando se é um quadrado
                    System.out.println("Insira a altura da figura: ");
                    double x = entrada.nextDouble();
                    fig1.setAltura(x);

                    System.out.println("Insira a largura da figura: ");
                    double y = entrada.nextDouble();
                    fig1.setLargura(y);
                    if (x != y) {
                        System.out.println("Não é um quadrado!");
                    } else {
                        // invocamos a função da classe objeto Quadrado que calcula sua área
                        q1.areaQuadrado(y, x);
                        System.out.println("----------");
                    }

                    break;

                case 2:
                    // invocamos a função da classe objeto Triangulo que calcula sua área
                    System.out.println("Insira a altura da figura: ");
                    double x2 = entrada.nextDouble();
                    fig1.setAltura(x2);

                    System.out.println("Insira a largura da figura: ");
                    double y2 = entrada.nextDouble();
                    fig1.setLargura(y2);
                    t1.areaTriangulo(y2, x2);
                    System.out.println("----------");
                    break;

                case 3:
                    // encerramos o programa definindo "sair" como true
                    System.out.println("Obrigado por usar nosso programa!");
                    sair = true;
                    break;

                default:
                    // mensagem caso aperte um número diferente dos disponíveis no menu
                    System.out.println("ERRADO!!");
                    break;
            }

        } while (sair == false);

        // fechando o scanner
        entrada.close();
    }

}
