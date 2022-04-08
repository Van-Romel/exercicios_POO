package exercicio3;

import java.util.Random;

public class TrianguloRetangulo implements FormaGeometrica {

    String name = "Triangulo Retangulo";

    @Override
    public String cor() {
        Random r = new Random();
        String[] cores = {"azul", "verde", "vermelho", "amarelo", "branco", "preto"};
        return cores[r.nextInt(cores.length - 1)];
    }

    @Override
    public String quantidadeDeLados() {
        return "Três";
    }

    @Override
    public double area(double base, double altura) {
        if (base < 0 || altura < 0) throw new IllegalArgumentException("Os valores de medida devem ser positivos");
        if (base == altura) throw new IllegalArgumentException("A base e a altura não podem ser iguais");
        return (base * altura) / 2;
    }
}
