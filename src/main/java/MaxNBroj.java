/*Напиши програма во која внесуваш колку броеви сакаш а потоа од внесените
броеви ќе го пронајдеш најголемиот број и ќе го отпечатиш на екран.*/

import java.util.Scanner;
public class MaxNBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vnes= new Scanner(System.in);
		System.out.println("Vnesi kolku broevi da se sporedat koj e najgolem/n");
		int n=vnes.nextInt(),x,max;
		System.out.println("Vnesi prv broj\n");
		x=vnes.nextInt();
		max=x;
		for(int i=2; i<=n; i++) {
			x=vnes.nextInt();
			if(x>max) {
				max=x;
				
			}
		}
		System.out.println("Najgolem broj e "+max);
	}

}
