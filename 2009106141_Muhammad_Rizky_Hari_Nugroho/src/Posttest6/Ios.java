package Posttest6;

import java.util.Formatter;  
public final class Ios extends Handphone{
    private String Os;

    public Ios(String P_Os, int id, String nm, String mrk, int st, int hg) {
        super(id, nm, mrk, st, hg);
        this.Os = P_Os;
    }

    public Ios(String P_Os) {
        this.Os = P_Os;
    }
    public Ios() {
        this.Os = "";
    }

   
    public String getOs() {
        return Os;
    }

    public void setOs(String Os) {
        this.Os = Os;
    }

    final void barangbeli(){
        System.out.println("Data Handphone Ios Telah Tertambah");
    }
    final void barangubah(){
        System.out.println("Data Handphone Ios Telah DiUbah");
    }
    final void barangberhasil(){
        System.out.println("Data Handphone Ios Telah DiHapus");
    }
    
    public void _5G(){
        System.out.println("Handphone Ini Telah di Bekali Teknologi 5G");
    }
    public void fast_charging(){
        System.out.println("Handphone Ini Telah di Bekali Teknologi Fast Charging 25 Watt\n");
    }
}
