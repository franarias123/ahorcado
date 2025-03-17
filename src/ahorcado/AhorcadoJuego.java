package ahorcado;

import java.util.Scanner;

/**
 *
 * @authors: 
    Carlos Arroyo Villalobos
    Jean Carlo Campos Madrigal
    Andrés Navarro Durán
    Claudio Umaña Arias
 */

public class AhorcadoJuego {
    
    public static void main(String[] args) {
        
        System.out.println("¿Cuántas letras tiene su palabra?");
	Scanner tampalScan = new Scanner(System.in);
        int tampal = tampalScan.nextInt();
	tampalScan.nextLine(); // Limpia el buffer después de nextInt()
	Ahorcado A = new Ahorcado();
	A.reducirtamanio(tampal);

	//Repite el proceso de imprimir hasta que vida sea 0, posib sea 1 o 0.
	while(A.getVida() > 0 && A.getPosib() != 1 && A.getPosib() != 0){
            A.imprimir();
	}
	 
        //Dice cual es la palabra encontrada.
	if(A.getPosib() == 1)
            for(int i = 0; i < A.getCantidadD(); i++)
                if(A.getElemSoN(i) == true)
                    System.out.println("La palabra es " + A.getElemD(i));
        
	//No se encontro la palabra.
	if(A.getPosib() == 0)
            System.out.println("La palabra no se encuentra en el diccionario.");

	//El programa perdio.
	if(A.getVida() == 0)
            System.out.println("Has ganado el juego. ¡Felicidades!");
	
        System.out.println("Fin del juego.");
        
        System.out.println("Presione ENTER para terminar...");
        tampalScan.nextLine(); //espera el ENTER
    }
    
}
