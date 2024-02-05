package PratikBolunme;
import java.util.Scanner;
public class PratikBolunme {
	public static void main(String[] args) {
		int k;
		double ort;
		int sayac=0;
		int total=0;
		 Scanner inp = new Scanner(System.in);
		 System.out.print("sayı giriniz:");
		 k = inp.nextInt();
		 for(int i=1; i <= k; i++) {
			 if((i%3==0)&&(i%4==0)){
				 total= total +i;
				 sayac=sayac+1;
			 }
		 }

		 if (sayac > 0) {
	            ort = total / sayac;
	            System.out.println("Ortalama: " + ort);
	        } else {
	            System.out.println("3 ve 4'e tam bölünen sayı bulunmamaktadır.");
	        }}
}


			 
		 
	
