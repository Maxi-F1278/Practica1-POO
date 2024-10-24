import java.util.ArrayList;
import java.util.List;

public class bolsa implements componente {

	private static final double PROCENTAJE = 0.10; 
	
	private List<componente> componentes = new ArrayList<componente>();
	
	public double precio() {
		double p = 0;
		
		for(componente c : componentes)
			p+=c.precio();
		
		return p - (p * PROCENTAJE);
	}

	public void addcomponente(componente c) {
		componentes.add(c);
	}
	
}
