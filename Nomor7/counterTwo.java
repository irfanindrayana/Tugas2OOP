package Nomor7;

public class counterTwo {
	int MAX_COUNT = 9;
	
	
	public void  displayCount() {
		int jumlah = 0;
		for(int a = 1 ; a <= MAX_COUNT ; a++) {
			jumlah += a;
			
		}
	 System.out.println("Penjumlahan dari 1 sampai " + MAX_COUNT + " adalah: " + jumlah);
	}		
}
