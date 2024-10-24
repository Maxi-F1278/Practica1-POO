public class fabricachocolate {

	public static void main(String[] args) {
		caja c1 = new caja(12.0);
		caja c2 = new caja(2.0);
		caja c3 = new caja(30.0);
		
		bolsa b = new bolsa();
		b.addcomponente(c1);
		b.addcomponente(c2);
		
        System.out.println("Precios:");
		System.out.println("caja 1: " + "$" + c1.precio());
        System.out.println("caja 2: " + "$" + c2.precio());
        System.out.println("caja 3: " + "$" + c3.precio());
		System.out.println("bolsa 1: " + "$" + b.precio());
	}
}