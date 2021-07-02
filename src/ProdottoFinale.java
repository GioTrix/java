import java.util.List;

import javax.xml.crypto.Data;

public class ProdottoFinale extends Prodotto {
	int quantita;
	Data tempoTotale;

	public ProdottoFinale(int quantita, Data tempoTotale, String identificativo, String nome, int costoProduzione,
			double prezzo, List<ComponentiImpl> componenti, String provenienza, double tempoRealizzazione) {
		super(identificativo, nome, costoProduzione, prezzo, componenti, provenienza, tempoRealizzazione);
		this.quantita = quantita;
		this.tempoTotale = tempoTotale;
	}

	public double getCostoComplessivo() {
		return prezzo * quantita;
	}

	public double getCostoProduzione() {
		return (prezzo * quantita + Costanti.manodopera);
	}

}
