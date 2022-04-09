package exercicio4;
import java.util.ArrayList;

import exercicio4.Dev.Senioridade;

public class Main {
	public static void main (String[] args) {
		
		TechLead funcionario1 = new TechLead();
		Dev funcionario2 = new Dev();
		Dev funcionario3 = new Dev();
		
		funcionario1.setNome("João das Couves");
		funcionario1.setCpf("1112223334455");
		funcionario1.setSalario(5000);
		funcionario1.setStack(new ArrayList<String>() {{
			add("Java");
			add("Python");
			add("AWS");
			add("Git");
			
		}});
		System.out.printf("O novo salário do %s é R$%.2f%n", funcionario1.getNome(), funcionario1.bonus(funcionario1.getSalario()));
		
		
		funcionario2.setNome("Van-Romel");
		funcionario2.setCpf("1112223334456");
		funcionario2.setSalario(1000);
		funcionario2.setSenioridade(Senioridade.JUNIOR);
		System.out.printf("O novo salário do %s é R$%.2f%n", funcionario2.getNome(), funcionario2.bonus(funcionario2.getSalario()));
		
		
		funcionario3.setNome("Guilherme Paulista");
		funcionario3.setCpf("6662223334455");
		funcionario3.setSalario(2500);
		funcionario3.setSenioridade(Senioridade.SENIOR);
		System.out.printf("O novo salário do %s é R$%.2f%n", funcionario3.getNome(), funcionario3.bonus(funcionario3.getSalario()));
		
		
		
		
	}
}
