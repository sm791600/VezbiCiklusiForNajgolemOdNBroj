/*Напиши програма во која внесуваш колку броеви сакаш а потоа од внесените
броеви ќе го пронајдеш најголемиот број и ќе го отпечатиш на екран.*/

import java.util.Scanner; //importiranje alatka za vnes na potatoci preku tastatura
public class MaxNBroj { 	//javna klasa so ime MaxNBroj

	public static void main(String[] args) {	//main metoda
		// TODO Auto-generated method stub
		Scanner vnes= new Scanner(System.in);	//promenliva vnes od tip Scanner
		System.out.println("Vnesi kolku broevi da se sporedat koj e najgolem/n");
		int n=vnes.nextInt(),x,max;	//deklariranje prv broj koj se vnesuva, i  x i max koj ne se vnesuvaat preku tastatura
		System.out.println("Vnesi prv broj\n");	
		x=vnes.nextInt();	//se vnesuva nareden broj
		max=x;		//max se stava da e prviot broj sto e vnesen
		for(int i=2; i<=n; i++) {		//for ciklus koj ide od 2 se do n brojot koj e vnesen od tastatura
			x=vnes.nextInt();		//se vnesuvvat naredniti
			if(x>max) {			//x se sporeduva so max
				max=x;			//ako e pogolem noviot max e vrednosta na x
				
			}
		}
		System.out.println("Najgolem broj e "+max);		//se pecati rezulatat na najgolem broj
	}

}
