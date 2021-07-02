import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Venditore venditore = new Venditore();
		List<ComponentiImpl> compDivano = new ArrayList<>();
		compDivano.add(new ComponentiImpl("Legno","Italia",1.0, 70.0));
		compDivano.add(new ComponentiImpl("Pelle","Spagna",2.5, 43.0));
		compDivano.add(new ComponentiImpl("Tessuto","Francia",2.0, 56.0));
		Prodotto divano = new Prodotto("3829","divano",50.66, 90.89,compDivano,"Italia",3.0);
		
		
		venditore.inserisciProdotto(divano);
		
		
		System.out.println(venditore.toString());
		System.out.println(divano.getRanking());
	}
}
