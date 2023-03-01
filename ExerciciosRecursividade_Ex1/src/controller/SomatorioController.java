/*Criar uma aplicação em Java, que tenha uma função recursiva, 
 *que calcule o somatório dos 'N' primeiros números NATURAIS 
 *(a função deve retornar zero para números negativos).
 *O Código deve apresentar, em formato de comentário,como foi 
 *definida a condição de parada;
 *O Código deve apresentar, em formato de comentário,como foi
 *definida a relação de chamada dos passos.
*/

package controller;

public class SomatorioController {

	public SomatorioController() {
		super();
	}
	
	//Função recursiva que calcula o somatório dos N primeiros números naturais.
	public static int somatorio(int n) {
	//Condição de Parada:
		//Se o número for menor que 0, retorn 0.
		if(n < 0) {
			return 0;
		}
		
		//Relação da chamada dos passos:
		//Se o número for maior que 0, retorna n soma à chamada recursiva n-1.
		else {
			return n + somatorio(n-1);
		}
	}
}

