
public class IngredientiImpl {
	String nomeIngredienti;
	double costoEtto;
	
	public IngredientiImpl(String nomeIngredienti, double costoEtto) {
		this.nomeIngredienti = nomeIngredienti;
		this.costoEtto = costoEtto;
	}
	
	public String getNomeIngredienti() {
		return nomeIngredienti;
	}
	public void setNomeIngredienti(String nomeIngredienti) {
		this.nomeIngredienti = nomeIngredienti;
	}
	public double getCostoEtto() {
		return costoEtto;
	}
	public void setCostoEtto(double costoEtto) {
		this.costoEtto = costoEtto;
	}
	
	
}
