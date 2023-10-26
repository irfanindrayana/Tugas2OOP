package Nomor7;

public class counterThree {

		int MAX_COUNT = 7;



	public void  displayCount() {
		int jumlah = 0;
		int a = 1;
		do {
				jumlah += a;
				a++;
		}while(a <= MAX_COUNT);
		 System.out.println("Penjumlahan dari 1 sampai " + MAX_COUNT + " adalah: " + jumlah);
		}	
	}
