import javax.swing.*;
public class belajar1 {
	public static void main (String [] args){
		String pilihan = JOptionPane.showInputDialog(" Anda Mau beli apa ? \n1. Soto\n2. Rawon\n3 Bakso\n4. Kebab\n5 ayam\n6");
		int pilih = Integer.parseInt(pilihan);

	switch(pilih){
		case 1:System.out.println("beli Soto");
		break;
		case 2:System.out.println("beli rawon");
		break;
		case 3:System.out.println("beli bakso");
		break;
		case 4:System.out.println("beli kebab");
		break;
		case 5:System.out.println("beli ayam");
		break;
}

}

}
