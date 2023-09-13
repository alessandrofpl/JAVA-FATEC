public class Carro {
	int velocidade;
	int potencia;
	String nome;
	
	void Acelerar() {
		velocidade +=potencia;
	}
	void Frear() {
		velocidade = velocidade/2;
	}
	int getVelocidade() {
		return velocidade;
	}
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	void imprimir() {
		System.out.println("O carro " + nome + ", esta a " + velocidade + "km/h");
	}
}
