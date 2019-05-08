package UT4;
/**
 * 
 * @author Desiree
 *
 */
public class ProgramaComposicionCono {
	/**
	 * Crea cinco objetos cono e imprime por pantalla sus atributos
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Random aleatorio = new java.util.Random();
		for (int i = 1; i <= 5; i++) {
			int radio = aleatorio.nextInt(9) + 1;
			Cono cono = new Cono(0, 0, radio, i, "Azul");
			cono.imprimir();
		}
	}
	
	//METODOS
	
	/**
	 * Imprime por pantalla
	 * @param datos
	 */
	public static void imprimir(Object datos) {
		System.out.println(datos);
	}
}