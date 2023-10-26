package Nomor1;

public class customer {
	String nama, alamat, nomorTelepon, alamatEmail;
	char status;
	double totalPenjualan;
	int customerID;
	

public customer(int customerID, String nama, String alamat, String nomorTelepon, String alamatEmail, char status, double totalPenjualan) {
    this.customerID = customerID;
    this.nama = nama;
    this.alamat = alamat;
    this.nomorTelepon = nomorTelepon;
    this.alamatEmail = alamatEmail;
    this.status = status;
    this.totalPenjualan = totalPenjualan;
}


public void displayCustomerInfo() {
	System.out.println("ID Costumer	: " + customerID );
    System.out.println("Nama		: " + nama);
    System.out.println("Alamat		: " + alamat);
    System.out.println("Nomor Telepon	: " + nomorTelepon);
    System.out.println("Alamat Email	: " + alamatEmail);
    System.out.println("Status		: " + status);
    System.out.println("Total Penjualan	: " + totalPenjualan);
	}
}