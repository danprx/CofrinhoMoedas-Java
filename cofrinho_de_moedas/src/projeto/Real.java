package projeto;

public class Real extends Moeda {

	Real(double valor) {
		super(valor);
	}
	
	@Override
	public String info() {
		return "Real - " + valor;
	}

	@Override
	public double converter() {
		return this.valor;
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
