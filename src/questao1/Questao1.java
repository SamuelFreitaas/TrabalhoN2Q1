package questao1;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Figura listaDeFiguras[] = new Figura[4];
        double somaPerimetro = 0;
        double somaArea = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < listaDeFiguras.length; i++) {
            if (i < 2) {
                System.out.println("Digite o raio de círculo " + (i + 1));
                Circulo c = new Circulo();

                c.setR(scan.nextDouble());
                listaDeFiguras[i] = c;

            } else {
                System.out.println("\nDigite a base do retângulo " + (i - 1));
                Retangulo r = new Retangulo();
                r.setLargura(scan.nextDouble());

                System.out.println("\nDigite a altura do retângulo " + (i - 1));
                r.setAltura(scan.nextDouble());
                listaDeFiguras[i] = r;
            }

        }
        for (int i = 0; i < listaDeFiguras.length; i++) {

            somaArea += listaDeFiguras[i].calcArea();
            somaPerimetro += listaDeFiguras[i].calcPerimetro();

            if (i < 2) {

                System.out.println("Círculo " + (i + 1) + " ---------\nÁrea: " + listaDeFiguras[i].getArea() + "\nPerímetro: " + listaDeFiguras[i].getPerimetro());

            } else {
                System.out.println("Retângulo " + (i - 1) + " ---------\nÁrea: " + listaDeFiguras[i].getArea() + "\nPerímetro: " + listaDeFiguras[i].getPerimetro());

            }

        }

        System.out.println("\n\nA soma de todos os perímetros é: " + somaPerimetro);
        System.out.println("A soma de todas as áreas é: " + somaArea);

    }

}
