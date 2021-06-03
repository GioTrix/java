package studenteSuperiore;

import java.util.ArrayList;
import java.util.List;

public class ClasseImpl implements Classe{
	Integer annoNascita;
	Integer annoCorso;
	String sezione;
	
	List<StudenteImpl> studenti;
	
	

	public ClasseImpl(Integer annoNascita, Integer annoCorso, String sezione, List<StudenteImpl> studenti) {
		this.annoNascita = annoNascita;
		this.annoCorso = annoCorso;
		this.sezione = sezione;
		this.studenti = studenti;
	}

	@Override
	public int getNumeroStudenti() {
		//controllo se la lista studenti è inizializzata
		if (this.getStudenti()!=null) {
			return this.getStudenti().size(); 
		}
		return 0;
	}

	public Integer getAnnoNascita() {
		return annoNascita;
	}

	public void setAnnoNascita(Integer annoNascita) {
		this.annoNascita = annoNascita;
	}

	public Integer getAnnoCorso() {
		return annoCorso;
	}

	public void setAnnoCorso(Integer annoCorso) {
		this.annoCorso = annoCorso;
	}

	public String getSezione() {
		return sezione;
	}

	public void setSezione(String sezione) {
		this.sezione = sezione;
	}

	public List<StudenteImpl> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<StudenteImpl> studenti) {
		this.studenti = studenti;
	}

	@Override
	public List<Integer> getRipetenti() {
		// TODO Auto-generated method stub
		List<Integer> ripetenti = new ArrayList<>();
		if (this.getStudenti()!=null) {
			for(Studente s: this.getStudenti()) {
				Integer anniRipetente = s.getAnniRipetente(this.getAnnoNascita());
				if (anniRipetente > 0)
					ripetenti.add(anniRipetente);
				
				
			}
		}
		
		
		return ripetenti;
	}

}


