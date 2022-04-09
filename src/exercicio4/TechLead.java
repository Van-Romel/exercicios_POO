package exercicio4;
import java.util.*;

public class TechLead extends Funcionario {
	
	private List<String> stack = new ArrayList<>();

	@Override
	public double bonus(double salario) {
		// TODO Auto-generated method stub
		if(this.getStack().size() > 3) return this.getSalario() * 1.3;
		
		return this.getSalario() * 1.15;
		
	}

	public List<String> getStack() {
		return stack;
	}

	public void setStack(List<String> stack) {
		this.stack = stack;
	}	
	
}
