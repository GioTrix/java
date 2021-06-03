package studenteSuperiore;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudenteImpl a = new StudenteImpl(1999, "Roma", "Verdi", "Luigi", 2012);
		StudenteImpl a1 = new StudenteImpl(2001, "Roma", "Rossi", "Mario", 2012);
		
		
		List<StudenteImpl> studenti = new ArrayList<>();
		studenti.add(a);
		studenti.add(a1);
		
		ClasseImpl c = new ClasseImpl(2001, 2020, "5A", studenti);
		int studClasse = c.getNumeroStudenti();
		List<Integer> ripetenti = c.getRipetenti();
		
		StringBuilder sb = new StringBuilder();
		for(Integer b: ripetenti) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(b);
		}
		
		System.out.println("La classe è formata da: " + studClasse + " studenti.");
		System.out.println(ripetenti.size() + " studenti sono ripetenti.");
		if (ripetenti.size() > 0)
			System.out.println("Rispettivamente di anni: " + sb);
		
	}

}
