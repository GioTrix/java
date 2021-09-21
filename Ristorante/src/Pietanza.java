import java.util.List;

public class Pietanza {
	public String nomeCibo;
	public double prezzoCibo;
	public List<IngredientiImpl> ingredienti;
	int quantita;
	int tempoPrep;
	TipoPietanza tipoPietanza;
	
	public Pietanza(TipoPietanza tp, String nomeCibo, double prezzoCibo, List<IngredientiImpl> ingredienti, int quantita, int tempoPrep) {
		this.nomeCibo = nomeCibo;
		this.prezzoCibo = prezzoCibo;
		this.ingredienti = ingredienti;
		this.quantita = quantita;
		this.tipoPietanza = tp;
		this.tempoPrep = tempoPrep;
	}
	
	public String getNomeCibo() {
		return nomeCibo;
	}
	public void setNomeCibo(String nomeCibo) {
		this.nomeCibo = nomeCibo;
	}
	public double getPrezzoCibo() {
		return prezzoCibo;
	}
	public void setPrezzoCibo(double prezzoCibo) {
		this.prezzoCibo = prezzoCibo;		
	}
	public List<IngredientiImpl> getIngredienti() {
		return ingredienti;
	}
	public void setIngredienti(List<IngredientiImpl> ingredienti) {
		this.ingredienti = ingredienti;
	}
	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public int getTempoPrep() {
		return tempoPrep;
	}

	public void setTempoPrep(int tempoPrep) {
		this.tempoPrep = tempoPrep;
	}
	
	public double getCostoComplessivo() {
		return prezzoCibo*quantita;
	}
	
	public double getCostoPreparazione() {
		return tempoPrep*Costanti.manodopera;
	}

	public TipoPietanza getTipoPietanza() {
		return tipoPietanza;
	}

	public void setTipoPietanza(TipoPietanza tipoPietanza) {
		this.tipoPietanza = tipoPietanza;
	}
	
	
	
}

