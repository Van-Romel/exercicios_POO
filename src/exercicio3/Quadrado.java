package exercicio3;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Quadrado implements FormaGeometrica {

    String name = "Quadrado";

    @Override
    public String cor() {
        Random r = new Random();
        String[] cores = {"azul", "verde", "vermelho", "amarelo", "branco", "preto"};
        return cores[r.nextInt(cores.length - 1)];
    }

    @Override
    public String quantidadeDeLados() {
        return "Quatro";
    }

    @Override
    public double area(double a, double b) {
        if (a != b) throw new IllegalArgumentException("As medidas devem ser iguais");
        if (a < 0 || b < 0) throw new IllegalArgumentException("Os valores de medida devem ser positivos");
        return a * 2;
    }
}
