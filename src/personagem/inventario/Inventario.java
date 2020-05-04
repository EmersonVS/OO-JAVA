package personagem.inventario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import personagem.inventario.exceptions.IException;
import personagem.inventario.exceptions.ItemNaoEncontradoExcpetion;

public class Inventario {

	private Collection<Item> Inventario = new ArrayList<Item>();

	public Collection<Item> getInventario() {
		return Collections.unmodifiableCollection(Inventario);
	}

	public void AdicionarItemNoInventario(Item itemEnviado) {
		if (itemEnviado.getTipo() != "Equipamento" && Inventario.contains(itemEnviado)) {
			for (Item item : Inventario) {
				if (item.equals(itemEnviado)) {
					item.AdicionarItem(itemEnviado.getQuantidade());
				}
			}
		} else {
			this.Inventario.add(itemEnviado);
		}
	}

	public void RemoverItemNoInventario(Item itemEnviado) {
		try {
			if (Inventario.contains(itemEnviado))
				Inventario.remove(itemEnviado);
			else
				throw new ItemNaoEncontradoExcpetion(itemEnviado.getNome());
		} catch (IException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	public String toString() {
		return String.format("%s", getInventario());
	}
}
