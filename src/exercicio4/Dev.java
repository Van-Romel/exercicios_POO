package exercicio4;

public class Dev extends Funcionario {

	private Senioridade senioridade;
	@Override
	public double bonus(double salario) {
		switch (this.getSenioridade()) {
		case JUNIOR:
			return salario * this.getSenioridade().multiplica;
		case PLENO:
			return salario * this.getSenioridade().multiplica;
		case SENIOR:
			return salario * this.getSenioridade().multiplica;
		default:
			return 0d;
		}
		
	}
	

	public Senioridade getSenioridade() {
		return senioridade;
	}


	public void setSenioridade(Senioridade senioridade) {
		this.senioridade = senioridade;
	}


	public enum Senioridade{
		JUNIOR("jr",1d),
		PLENO("pl",1.5d),
		SENIOR("sr",2d);
		private String descricao;
		private double multiplica;
		
		Senioridade(String descricao , double multiplica){
			this.descricao = descricao;
			this.multiplica = multiplica;
		}

		public String getDescricao() {
			return descricao;
		}

		public double getMultiplica(double multiplica) {
			return multiplica;
		}
		
	}
}
