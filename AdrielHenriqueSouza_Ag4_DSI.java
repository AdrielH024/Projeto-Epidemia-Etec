package AdrielHenriqueSouza_Ag4_DSI;
import java.util.Scanner;

public class AdrielHenriqueSouza_Ag4_DSI {
/*
 * nome da região
 * número de casos da região
 * mostrar informações
 * nome da região e número de dados
 * */

	public static int [] numdecasos = new int[27];
	public static String [] nomederegiao = new String[27];
	public static int brasil;
	
	public static int entrada() {
		final int numdeestados = 26;
		int i = 0;
		Scanner myObj = new Scanner(System.in);
		boolean foipassado = false;
		boolean verificoutodas = false;
		
		while(i <= numdeestados) {
			//garantir que todos os estados foram passados
			System.out.println("escreva nome do estado");
			String scan = myObj.nextLine();
			nomederegiao[i] = scan;
			System.out.println("escreva o número de casos de " + nomederegiao[i]);
			scan = myObj.nextLine();
			numdecasos[i] = Integer.parseInt(scan);
			verificoutodas = false;
			
			while(foipassado == false && i != 0 && i < numdeestados) {
				//comparar para ver se não temos estados repetidos
				if(verificoutodas == true) {
					break;
				}
				for(int j=0;j<=i;j++) {
					if(j == i) {
						verificoutodas =true;
						break;
					}
					
					if(!nomederegiao[i].equals(nomederegiao[j])) {
							j++;

					}else{
						System.out.println("invalido, estado repetido");
						System.out.println("escreva nome do estado");
						scan = myObj.nextLine();
						nomederegiao[i] = scan;
						System.out.println("escreva o número de casos de " + nomederegiao[i]);
						scan = myObj.nextLine();
						numdecasos[i] = Integer.parseInt(scan);
						j=-1;
					}

				}
				foipassado = true;

			}
			i++;
			foipassado = false;
			System.out.println("regioes registradas: " + i);

		}
		return 0;
	}
	
	public static int retornanumdecasos() {
		int i = 0;
		int resultado = 0;
		while(i <= 26) {
			resultado = + resultado + numdecasos[i];
			i++;
		}
		
		return brasil;
	}
	
	public static void imprime(int totalcasos) {
		int i =0;
		while(i <= 26) {
			System.out.println("--------------");
			System.out.println("estado: " + nomederegiao[i]);
			System.out.println("total de casos: " + numdecasos[i]);
			System.out.println("porcentagem em relacao ao Brasil: " + ((numdecasos[i]/totalcasos)*100));
			i++;
		}
	}
	
	public static void  main(String[] args){
		nomederegiao[0] = "teste";
		entrada();
		brasil = retornanumdecasos();
		imprime(brasil);
	}
	

}
