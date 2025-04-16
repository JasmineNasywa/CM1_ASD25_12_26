public class bank {
    String noRekening;
    String nama;  
    String namaIbu; 
    String noHp; 
    String email;
    
    public bank(String nk, String name, String ibu, String notlp, String email) {
        this.noRekening = nk;
        this.nama = name;
        this.namaIbu = ibu;
        this.noHp = notlp;
        this.email =email;
    }
    public void tampil() {
        System.out.println("NoRekening " + "\t" + noRekening + "Nama: " + "\t" + nama + "Nama Ibu: " + "\t" + namaIbu + "NoHP: " + 
        "\t" + noHp + "email" + "/t" + email);
        System.out.println("---------------------");
    }

}
