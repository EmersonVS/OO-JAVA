import personagem.classes.Guerreiro;

public class TestePersonagem {

	public static void main(String[] args) {
		
		Guerreiro Classe1 = new Guerreiro();
		Guerreiro Classe2 = new Guerreiro();
		
		Classe1.AdicionarHabilidade("Soco", 1, 2);
		Classe1.AdicionarHabilidade("Pontapé", 1, 4);
		Classe1.AdicionarHabilidade("Esquiva", 1, 3);
		
		Classe2.AdicionarHabilidade("Ataque Espada", 1, 2);
		Classe2.AdicionarHabilidade("Ataque Escudo", 1, 4);
		Classe2.AdicionarHabilidade("Esquiva", 1, 3);
		
		Classe2.EvoluirHabilidade(2, 1);
		
		System.out.println(Classe1);
		System.out.println(Classe2);
	}
}
