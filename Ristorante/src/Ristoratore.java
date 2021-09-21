import java.util.ArrayList;
import java.util.List;

public class Ristoratore {
	List<Pietanza> pietanze = new ArrayList<>();

	void inserisciPietanza(Pietanza pietanze) {
		this.pietanze.add(pietanze);
	}

	Double ranking(Pietanza p) {

		return Costanti.guadagno / p.tempoPrep;
	}

	@Override
	public String toString() {
		StringBuilder sbAntipasti = new StringBuilder();
		StringBuilder sbPrimi = new StringBuilder();
		StringBuilder sbSecondi = new StringBuilder();
		StringBuilder sbDolci = new StringBuilder();

		StringBuilder sb;
		
		try {
			for (Pietanza p : pietanze) {
				switch (p.getTipoPietanza()) {
					case PRIMI:
						sb = sbPrimi;
						break;
					case SECONDI:
						sb = sbSecondi;
						break;
					case ANTIPASTI:
						sb = sbAntipasti;
						break;
					case DOLCI:
						sb = sbDolci;
						break;
					default:
						throw new Exception("Tipo di piatto non definito");
				}
		
				sb.append(p.getNomeCibo() + " ingredienti: ");
				for (IngredientiImpl i : p.getIngredienti()) {
					sb.append(i.getNomeIngredienti() + ", ");
				}
				sb.append("Prezzo: " + p.getPrezzoCibo() + "€ \n");
		
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
			return "";
		}

		return "Antipasti: \n" + sbAntipasti.toString() +"\n" +
	       "Primi: \n"+ sbPrimi.toString() + "\n" +
	       "Secondi: \n"+ sbSecondi.toString() + "\n" +
	       "Dolci: \n"+ sbDolci.toString();
	}

}