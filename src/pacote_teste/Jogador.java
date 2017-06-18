package pacote_teste;

public class Jogador {

	private String nome;
	private Integer numeroCamisa;
	private PosicaoENUM posicao;

	public Jogador(String nome, Integer numeroCamisa, PosicaoENUM posicao) {
		super();
		this.nome = nome;
		this.numeroCamisa = numeroCamisa;
		this.posicao = posicao;
	}

	
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public Integer getNumeroCamisa() {
		return numeroCamisa;
	}




	public void setNumeroCamisa(Integer numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}




	public PosicaoENUM getPosicao() {
		return posicao;
	}




	public void setPosicao(PosicaoENUM posicao) {
		this.posicao = posicao;
	}




	@Override
	public String toString() {
		return "Jogador [" + nome + ", " + numeroCamisa + ", " + posicao + "]";
	}

}
