package exercicio3;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Circulo implements FormaGeometrica {

    String name = "Circulo";

    @Override
    public String cor() {
        Random r = new Random();
        String[] cores = {"azul", "verde", "vermelho", "amarelo", "branco", "preto"};
        return cores[r.nextInt(cores.length - 1)];
    }

    @Override
    public String quantidadeDeLados() {
        return "Zero";
    }

    @Override
    public double area(double pi, double raio) {
        if (raio < 0) throw new IllegalArgumentException("O valor do raio deve ser maior que zero");
        if (!(pi >= 3.14 || pi <= 3.142)) throw new IllegalArgumentException("Valor de PI inválido");
        return Math.PI * raio * raio;
    }
}
