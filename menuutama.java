import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class menuutama {
	public static void main (String [] args ) {
		Scanner input = new Scanner (System.in);
		BufferedReader input2 = new BufferedReader(new InputStreamReader (System.in));
		int i = 0;
		int hargatotal =0;
		int penampung = 0;
		String menu[] = new String [100];
		int harga [] = new int [100];
		String keputusan = "y";
	
		System.out.println("Daftar Menu Makanan");
		System.out.println("-----------------------------------");
		System.out.println("1. Soto ayam 	=Rp 10000");
		System.out.println("2. Nasi Rawon	=Rp 10000");
		System.out.println("3. Bakso Sapi	=Rp 10000");
		System.out.println("4. Ayam Goreng	=Rp 10000");
		System.out.println("5. Sate Ayam	=Rp 10000");

		while (keputusan.equals ("y") || keputusan.equals("y"))
		{
		System.out.print("Pilihan Menu Anda");
		int pil = input.nextInt ();
		if (pil==1){
			menu [i] = "Soto Ayam";
			harga[i] = 10000;
		} else if (pil==2) {
			menu [i] = "Nasi Rawon";
			harga[i] = 10000;
		} else if (pil==3) {
			menu [i] = "Bakso";
			harga[i] = 10000;
		} else if (pil==4) {
			menu [i] = "Ayam Goreng";
			harga[i] = 10000;
		} else if (pil==5) {
			menu [i] = "Sate Ayam";
			harga[i] = 10000;

		} else {
			System.out.println ("Maaf pilihan makanan anda tidak ada");
			menu[i] ="tidak ada";
		}
			System.out.println("Menu yang andapesan adalah		: "+menu[i]);
			System.out.println("Harga yang harus dibayar		:"+harga[i]);
			System.out.println("Apakah anda ingin memesan lagi ? Y/T :");
			try{
				keputusan = input2.readLine();
			} catch (IOException e) {
				System.out.println("Gagal membaca keyboard");
			i++;
		System.out.println("");
		System.out.println("Menu yang anda pesan adalah 	:"+i);
		for (int a = 0; a<i ; a++){
			System.out.print (menu[a]+", ");
		}
		System.out.println("");
		for (int b = 0 ; b<i ;b++) {
			hargatotal = hargatotal + harga[b];
		}
		System.out.println("total yang harus anda bayar adalah : Rp."+hargatotal);
	}
		
}			
}
}
