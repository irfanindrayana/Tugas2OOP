package Nomor3;

public class dateTwo {
    private int jumlahHari;

    public dateTwo(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    public void displayDay() {
        if (jumlahHari >= 1 && jumlahHari <= 7) {
            String hari;
            	if (jumlahHari == 1){
                	hari = "Senin";
            	}
            	else if (jumlahHari == 2) {
                    hari = "Selasa";
            	}
            	else if (jumlahHari == 2) {
                	hari = "Rabu";
            	}
                else if (jumlahHari == 2) {
                	hari = "Kamis";
                }
                else if (jumlahHari == 2) {
                	hari = "Jumat";
                }
                else if (jumlahHari == 2) {
                	hari = "Sabtu";
                }
                else if (jumlahHari == 2) {
                	hari = "Minggu";
                }
                else {
                    hari = "Hari tidak valid";
                }
            System.out.println("Nomor " + jumlahHari + " adalah hari " + hari);
        } else {
            System.out.println("Nomor hari tidak valid. Harus dalam rentang 1-7.");
        }
    }
}
