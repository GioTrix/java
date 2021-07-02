import java.util.List;

public class Prodotto {
	
	String identificativo;
	String nome;
	double costoProduzione;
	double prezzo;
	public List<ComponentiImpl> componenti;
	String provenienza;
	double tempoRealizzazione;
	
	public Prodotto(String identificativo, String nome, double costoProduzione, double prezzo,
			List<ComponentiImpl> componenti, String provenienza,double tempoRealizzazione) {
		
		this.identificativo = identificativo;
		this.nome = nome;
		this.costoProduzione = costoProduzione;
		this.prezzo = prezzo;
		this.componenti = componenti;
		this.provenienza = provenienza;
		this.tempoRealizzazione=tempoRealizzazione;
	}

	public double getTempoRealizzazione() {
		return tempoRealizzazione;
	}

	public void setTempoRealizzazione(double tempoRealizzazione) {
		this.tempoRealizzazione = tempoRealizzazione;
	}

	public String getIdentificativo() {
		return identificativo;
	}

	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCostoProduzione() {
		return costoProduzione;
	}

	public void setCostoProduzione(double costoProduzione) {
		this.costoProduzione = costoProduzione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public List<ComponentiImpl> getComponenti() {
		return componenti;
	}

	public void setComponenti(List<ComponentiImpl> componenti) {
		this.componenti = componenti;
	}

	public String getProvenienza() {
		return provenienza;
	}

	public void setProvenienza(String provenienza) {
		this.provenienza = provenienza;
	}
	
	public double getRanking() {

		double guadagno=this.getPrezzo()-this.getCostoProduzione();
		double tempoOrdinazione=0;
		for(ComponentiImpl c: this.getComponenti()) {
			tempoOrdinazione+=c.getTempoOrdinazione();
		}
		double tempoProduzione=tempoOrdinazione+this.getTempoRealizzazione();
		return guadagno/tempoProduzione;
	}


}
