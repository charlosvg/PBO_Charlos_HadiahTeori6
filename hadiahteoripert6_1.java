import java.util.Scanner;

class lingkaran{
	
	final double PI = 3.14;
	int jari2;


		void cetak()
		{
			
			System.out.println("Nilai luas lingkaran adalah :"+(PI * jari2 *jari2));
			
		}
}
class kubus{
		int sisi;
		
		void cetak(){
			System.out.println("Nilai volume kubus adalah : " 
			+(sisi*sisi*sisi));
			
		}
	
}
	
public class hadiahteoripert6_1{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		lingkaran l = new lingkaran();
		kubus k = new kubus();
		
		System.out.print("masukkan nilai jari2 : ");
		l.jari2 = input.nextInt();
		System.out.print("masukkan nilai sisi : ");
		k.sisi = input.nextInt();
		
		l.cetak();
		System.out.println("=======================");
		k.cetak();
	
		
	
	}
	
}