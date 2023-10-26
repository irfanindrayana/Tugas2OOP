package Nomor5;

public class Counter {
	int MAX_COUNT = 5;



public void  displayCount() {
	int jumlah = 0;
	int a = 1;
	while(a <= MAX_COUNT){
			jumlah += a;
			a++;
	}
	 System.out.println("Penjumlahan dari 1 sampai " + MAX_COUNT + " adalah: " + jumlah);
}	
}
