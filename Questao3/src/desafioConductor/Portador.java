package desafioConductor;


import java.text.DecimalFormat;

public class Portador extends UsuarioComum {

	private double limiteDeCredito;
	private double resultado;
	private double limiteEspecial= 1975.7;

	
	DecimalFormat df = new DecimalFormat(".##");
	
	public void calculoLimiteCredito() {
		this.resultado = (getRenda() * 2) + (getNumeroDeDependentes() * 0.5);
		System.out.println("o resultado é " + df.format(this.resultado));
		 
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
}
