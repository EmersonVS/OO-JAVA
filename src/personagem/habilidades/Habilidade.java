package personagem.habilidades;

import java.text.NumberFormat;
import java.util.Locale;

public class Habilidade {

	private String Nome;
	private int Nivel;
	private double Cooldown;

	public Habilidade(String nome, int nivel, double cooldown) {
		this.Nome = nome;
		this.Nivel = nivel;
		this.Cooldown = cooldown;
	}

	public String getNome() {
		return Nome;
	}

	public int getNivel() {
		return Nivel;
	}

	private void setNivel(int nivel) {
		Nivel = nivel;
	}

	public double getCooldown() {
		return Cooldown;
	}

	private void setCooldown(double cooldown) {
		Cooldown = cooldown;
	}

	public void EvoluirHabilidade(int niveis) {
		setNivel(getNivel() + niveis);
		for (int i = 0; i < niveis; i++) {
			setCooldown(getCooldown() * .92);
		}
	}

	@Override
	public String toString() {
		Locale l = new Locale("en", "EN");
		NumberFormat nf = NumberFormat.getInstance(l);
		return String.format("{\"Nome\": \"%s\", \"Nível\": %d, \"Cooldown(s)\": %s}", getNome(), getNivel(),
				nf.format(getCooldown()));
	}
}
