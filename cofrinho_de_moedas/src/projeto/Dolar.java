package projeto;

public class Dolar extends Moeda {

	Dolar(double valor) {
		super(valor);
	}

	@Override
	public String info() {
		return "Dolar - " + valor;
	}

	@Override
	public double converter() {
		return this.valor * 4.80;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
		
}
