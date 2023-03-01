/*Criar uma aplica��o em Java, que tenha uma fun��o recursiva, 
 *que calcule o somat�rio dos 'N' primeiros n�meros NATURAIS 
 *(a fun��o deve retornar zero para n�meros negativos).
 *O C�digo deve apresentar, em formato de coment�rio,como foi 
 *definida a condi��o de parada;
 *O C�digo deve apresentar, em formato de coment�rio,como foi
 *definida a rela��o de chamada dos passos.
*/

package controller;

public class SomatorioController {

	public SomatorioController() {
		super();
	}
	
	//Fun��o recursiva que calcula o somat�rio dos N primeiros n�meros naturais.
	public static int somatorio(int n) {
	//Condi��o de Parada:
		//Se o n�mero for menor que 0, retorn 0.
		if(n < 0) {
			return 0;
		}
		
		//Rela��o da chamada dos passos:
		//Se o n�mero for maior que 0, retorna n soma � chamada recursiva n-1.
		else {
			return n + somatorio(n-1);
		}
	}
}

