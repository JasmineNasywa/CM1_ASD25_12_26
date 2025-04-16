public class transaksi {
    String kodeTransaksi;
    double saldo;
    double inOutSaldo;
    double finalSaldo;
    String tanggalTransaksi;
    String type;
    int idx;

    bank[] bankAcc;

    public transaksi(String kodeTransaksi, double saldo, double inOutSaldo, double finalSaldo, String tanggalTransaksi, String type, bank[] bankAcc){
        this.kodeTransaksi = kodeTransaksi;
        this.saldo = saldo;
        this.inOutSaldo = inOutSaldo;
        this.finalSaldo = finalSaldo;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
        this.bankAcc = bankAcc;
    }

    public void tampilTransaksi(){ //ini belum sebaris kesamping, masih kebawah
        System.out.println("Kode Transaksi: " + kodeTransaksi);
        System.out.println("Saldo: " + saldo);
        System.out.println("Debit/Kredit: " + inOutSaldo);
        System.out.println("Final Saldo: " + finalSaldo);
        System.out.println("Tanggal Transaksi: " + tanggalTransaksi);
        System.out.println("Type: " + type);
        System.out.println("Bank Accounts:");
        for (bank bank : bankAcc) {
            bank.tampil();
        }
        System.out.println("---------------------");
    }

    public transaksi(){

    }

}
