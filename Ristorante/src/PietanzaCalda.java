import java.util.List;

public class PietanzaCalda extends Pietanza{
	int tempoCottura;
	
	public PietanzaCalda(TipoPietanza tp, int tempoCottura,String nomeCibo, double prezzoCibo, List<IngredientiImpl> ingredienti, int quantita, int tempoPrep) {
		super(tp, nomeCibo, prezzoCibo, ingredienti, quantita,tempoPrep);
		this.tempoCottura=tempoCottura;
		
	}
	public double getCostoCottura() {
		return tempoPrep*Costanti.costoGas;
	}
}
