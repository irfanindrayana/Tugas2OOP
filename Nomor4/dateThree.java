package Nomor4;

public class dateThree {
    private int jumlahHari;

    public dateThree(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    public void displayDay() {
        String hari;
        switch (jumlahHari) {
            case 1:
            	hari = "Senin";
                break;
            case 2:
            	hari = "Selasa";
                break;
            case 3:
            	hari = "Rabu";
                break;
            case 4:
            	hari = "Kamis";
                break;
            case 5:
            	hari = "Jumat";
                break;
            case 6:
            	hari = "Sabtu";
                break;
            case 7:
            	hari = "Minggu";
                break;
            default:
            	hari = "Hari tidak valid";
        }
           System.out.println("Nomor " + jumlahHari + " adalah hari " + hari);
        
    }
}
