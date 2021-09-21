import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Ristoratore ristoratore = new Ristoratore();
		List<IngredientiImpl> ingrAmatriciana = new ArrayList<>();
		ingrAmatriciana.add(new IngredientiImpl("Guanciale", 8.16));
		ingrAmatriciana.add(new IngredientiImpl("Passata pomodoro", 0.020));
		ingrAmatriciana.add(new IngredientiImpl("Spaghetti", 0.56));
		Pietanza amatriciana = new Pietanza(TipoPietanza.PRIMI, "pasta all'amatriciana", 8.0, ingrAmatriciana, 2, 15);
		List<IngredientiImpl> ingrPollo = new ArrayList<>();
		ingrPollo.add(new IngredientiImpl("Pollo", 10.05));
		ingrPollo.add(new IngredientiImpl("Olio EVO", 0.6));
		ingrPollo.add(new IngredientiImpl("Aromi naturali", 0.03));
		Pietanza pollo = new Pietanza(TipoPietanza.SECONDI, "pollo", 6.0, ingrPollo, 1, 40);

		List<IngredientiImpl> ingrTiramisu = new ArrayList<>();
		ingrTiramisu.add(new IngredientiImpl("Uova", 3.0));
		ingrTiramisu.add(new IngredientiImpl("Caffe", 10.00));
		ingrTiramisu.add(new IngredientiImpl("Savoiardi", 1.5));
		ingrTiramisu.add(new IngredientiImpl("Mascarpone", 1.20));
		Pietanza tiramisu = new Pietanza(TipoPietanza.DOLCI, "tiramisu", 4.0, ingrTiramisu, 1, 10);

		List<IngredientiImpl> ingrPannaCotta = new ArrayList<>();
		ingrPannaCotta.add(new IngredientiImpl("Panna", 0.45));
		ingrPannaCotta.add(new IngredientiImpl("Vaniglia", 25.00));
		ingrPannaCotta.add(new IngredientiImpl("Sciroppo d'amarena", 2.15));
		Pietanza pannaCotta = new Pietanza(TipoPietanza.DOLCI, "panna cotta", 4.0, ingrPannaCotta, 1, 10);

		ristoratore.inserisciPietanza(amatriciana);
		ristoratore.inserisciPietanza(pollo);
		ristoratore.inserisciPietanza(tiramisu);
		ristoratore.inserisciPietanza(pannaCotta);

		System.out.println(ristoratore.toString());
		System.out.println("Costo complessivo: " + pollo.getCostoComplessivo() + "€");
	}
}
