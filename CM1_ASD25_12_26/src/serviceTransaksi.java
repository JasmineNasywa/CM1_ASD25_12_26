public class serviceTransaksi {
 transaksi [] Transaksi;
 int idx;
    
    

    public serviceTransaksi(int kapasitas) {
        Transaksi = new transaksi[kapasitas];
    }
    
    public void displayData() {
        for (transaksi transaksi : Transaksi) {
                if (transaksi != null) {
                    transaksi.tampilTransaksi();
            }
        }
    }
    public void searchByNoRekening(String noRekening) {
        for (transaksi transaksi : Transaksi) {
            if (Transaksi != null) {
                for (bank bank : transaksi.bankAcc) {
                    if (bank.noRekening.equals(noRekening)) {
                        transaksi.tampilTransaksi();
                    }
                }
            }
        }
    }
    public double findMaxSaldo() {
        double maxSaldo = Double.MIN_VALUE;
        for (transaksi transaksi : Transaksi) {
            if (transaksi != null && transaksi.finalSaldo > maxSaldo) {
                maxSaldo = transaksi.finalSaldo;
            }
        }
        return maxSaldo;
    }
    public void sorting() { 
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (Transaksi[j].inOutSaldo > Transaksi[j + 1].inOutSaldo) {
                    transaksi temp = Transaksi[j];
                    Transaksi[j] = Transaksi[j + 1];
                    Transaksi[j + 1] = temp;
                }
            }
        }
    }
}
