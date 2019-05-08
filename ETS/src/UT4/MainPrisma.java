package UT4;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
public class MainPrisma {
	/**
	 * Variables static:
	 *  
	**/
	static ArrayList<Prisma>listadoPrismas=new ArrayList<>();
	static ArrayList<Float>listadoAT=new ArrayList<>();
	/**
	 * FUNCION DEL PROGRAMA:
	 * Programa que realizar el calculo de 3 objetos Prismas 
	 * con valores aleatorios comprendidos entre 1 y 50. 
	**/
	public static void main(String[] args) {
		Random numAleatorio = new Random();
		System.out.println("==============================\n" + 
		           " CREACION DE OBJETOS PRISMA:\n" + 
		           "==============================");
		System.out.println("");
		leerDatos(numAleatorio);
		MostrarPrismas();
		System.out.println("==============================");
		System.out.println("");
		System.out.println("Ordenados de mayor a menor:");
		OrdenaMeMa();
	}
	
	/**
	 * Método que lee datos aleatoriamente y 
	 * realiza la insercion del Objeto Prisma en una lista
	 * @param numAleatorio
	 */
	public static void leerDatos(Random numAleatorio) {
		int cont=0;
		do {
			//Creamos el objeto prisma con la clase Prisma creada anteriormente.
			Prisma prisma;
			prisma=new Prisma() {};
			int vBaseTriangulo=numAleatorio.nextInt(50)+1;
			prisma.setBaseTriangulo(vBaseTriangulo);
			int vAlturaPrisma=numAleatorio.nextInt(50)+1;
			prisma.setAlturaPrisma(vAlturaPrisma);
			listadoPrismas.add(prisma);
			
			cont++;
		}while(cont<3);
	}
	/**
	 * Metodo que muestra los atributos y el 
	 * Area total de cada Objeto Prisma y a su
	 * vez mete el Valor del area total de cada uno
	 * de los prismas en una lista 
	**/
	public static void MostrarPrismas() {
		int i=0;
		for (Prisma n : listadoPrismas) {
			float at=n.areaTotal(n.areaBase(n.alturaTriangulo()), n.areaLateral(n.perimetro()));
			listadoAT.add(at);
			System.out.println("Creado el objeto Prisma "+(i+1)+" con:");
			System.out.println("- Base: "+n.getBaseTriangulo());	
			System.out.println("- Altura: "+n.getAlturaPrisma());	
			System.out.println("- Area total: "+at);
			System.out.println("");
			i++;
		}
	}
	/**
	 * Metodo que ordena de mayor a menor 
	 * la lista de Areas totales y las muestra del ultimo valor 
	 * al primero para hacer ver el orde de menor a mayor 
	 */
	public static void OrdenaMeMa() {
		listadoAT.sort(null);
		ListIterator<Float> iter = listadoAT.listIterator(listadoAT.size());
		while (iter.hasPrevious()) {
		      System.out.println("Area Total: "+iter.previous());
		}
	}
}