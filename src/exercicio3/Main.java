package exercicio3;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo();

        try {
            imprime(circulo.name, circulo.cor(), circulo.quantidadeDeLados(), circulo.area(Math.PI, 2));
        } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        }
        try {
            imprime(quadrado.name, quadrado.cor(), quadrado.quantidadeDeLados(), quadrado.area( 2,2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            imprime(retangulo.name, retangulo.cor(), retangulo.quantidadeDeLados(), retangulo.area(2, 2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            imprime(trianguloRetangulo.name, trianguloRetangulo.cor(), trianguloRetangulo.quantidadeDeLados(), trianguloRetangulo.area(3, 2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static void imprime(String name, String cor, String quantidadeDeLados, double area) {
        System.out.printf("O %s, de cor %s, tem %s lados. Dados os valores da funcao, a area do %s é de %.2f \n\n",
                name, cor, quantidadeDeLados, name, area);
    }
}
