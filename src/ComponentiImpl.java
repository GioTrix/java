public class ComponentiImpl {
	
	String nome;
	String paese;
	Double tempoOrdinazione;
	double costoComponente;
	
	public ComponentiImpl(String nome, String paese, Double tempoOrdinazione, double costoComponente) {
		
		this.nome = nome;
		this.paese = paese;
		this.tempoOrdinazione = tempoOrdinazione;
		this.costoComponente = costoComponente;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPaese() {
		return paese;
	}

	public void setPaese(String paese) {
		this.paese = paese;
	}

	public Double getTempoOrdinazione() {
		return tempoOrdinazione;
	}

	public void setTempoOrdinazione(Double tempoOrdinazione) {
		this.tempoOrdinazione = tempoOrdinazione;
	}

	public double getCostoComponente() {
		return costoComponente;
	}

	public void setCostoComponente(double costoComponente) {
		this.costoComponente = costoComponente;
	}
	
	@Override
	public String toString() {
		return this.getNome()+" ("+this.getPaese()+")";
	}
}
