import java.util.ArrayList;
import java.util.List;

public class Venditore {
	List<Prodotto> prodotti = new ArrayList<>();

	void inserisciProdotto(Prodotto prodotti) {
		this.prodotti.add(prodotti);

	}

	
	@Override
	public String toString() {

		StringBuilder sb=new StringBuilder();

		for (Prodotto p : prodotti) {

			sb.append(p.getNome() + " componenti: ");
			for (ComponentiImpl c : p.getComponenti()) {
				sb.append(c.getNome() + ", ");
			}
			sb.append("Prezzo: " + p.getPrezzo() + "€ \n"
			+ "Prezzo: \n" + p.getPrezzo() + "\n" + "Componenti: \n"
			+ p.getComponenti() + "\n" + "Provenienza: \n" + p.getProvenienza());

		}
		return "Prodotti: \n" + sb.toString();
	}
}
