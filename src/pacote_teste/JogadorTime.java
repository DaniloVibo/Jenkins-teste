package pacote_teste;

import java.util.ArrayList;
import java.util.List;


public class JogadorTime {

	private static List<Jogador> barcelona = new ArrayList<>();
	
	public static void inserirJogador(Jogador jogador){
		barcelona.add(jogador);
	}
	
	public static void pesquisarCamisa(Integer camisa){
		for(Jogador jogador: barcelona){
			if(jogador.getNumeroCamisa().equals(camisa)){
				System.out.println(jogador);
			}
		}
	}
}

