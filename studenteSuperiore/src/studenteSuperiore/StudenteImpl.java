package studenteSuperiore;

public class StudenteImpl implements Studente {
	Integer annoNascita;
	String luogoNascita;
	String cognome;
	String nome;
	Integer annoIscrizione;
	
	
	
	public StudenteImpl(int annoNascita, String luogoNascita, String cognome, String nome, int annoIscrizione) {
		// TODO Auto-generated constructor stub
		this.annoNascita = annoNascita;
		this.luogoNascita = luogoNascita;
		this.cognome = cognome;
		this.nome = nome;
		this.annoIscrizione = annoIscrizione;
		
	}



	public Integer getAnnoNascita() {
		return annoNascita;
	}



	public void setAnnoNascita(Integer annoNascita) {
		this.annoNascita = annoNascita;
	}



	public String getLuogoNascita() {
		return luogoNascita;
	}



	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Integer getAnnoIscrizione() {
		return annoIscrizione;
	}



	public void setAnnoIscrizione(Integer annoIscrizione) {
		this.annoIscrizione = annoIscrizione;
	}




	@Override
	public int getAnniRipetente(int annoCorso) {
		return annoCorso-this.getAnnoNascita();
	}
}
