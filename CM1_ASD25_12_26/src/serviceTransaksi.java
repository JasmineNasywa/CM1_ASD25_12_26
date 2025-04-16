public class serviceTransaksi {
 transaksi [] Transaksi;
 int idx;
 bank trs1 =new bank("16030927 3084", "Wallace", "Mei Mei", "082-458-264-3263", "wallace@gmail.com");
 bank trs2 =new bank("16100617 0573", "Darius", "Susanti", "081-357-843-0547", "darius@pt.org");
 bank trs3 =new bank("16240401 2243", "Fuller", "Rosalia", "085-556-712-7062", "fuller@mail.com");
 bank trs4 =new bank("16270525 0112", "Maria", "Krabela", "082-267-223-0234", "mari@gmail.com");
 bank trs5 =new bank("16101617 2416", "Gery", "Fatimah", "083-683-416-8323", "gery@gery.com");

 transaksi t1 = new transaksi("Tr001", 200000, 50000, 250000, "21-04-2024", "Kredit", new bank[]{trs1});
        transaksi t2 = new transaksi("Tr002", 300000, 100000, 400000, "22-04-2024", "Kredit", new bank[]{trs2});
        transaksi t3 = new transaksi("Tr003", 400000, 50000, 350000, "23-04-2024", "Debet", new bank[]{trs3});
        transaksi t4 = new transaksi("Tr004", 150000, 30000, 180000, "23-04-2024", "Kredit", new bank[]{trs4});
        transaksi t5 = new transaksi("Tr005", 500000, 200000, 700000, "23-04-2024", "Kredit", new bank[]{trs5}); // sesuai gambar

       

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
    public void findMaxSaldo() {
        if (Transaksi == null || Transaksi.length == 0) {
            System.out.println("Data transaksi kosong.");
            return;
        }
    
        transaksi maxTransaksi = null;
    
        for (transaksi tr : Transaksi) {
            if (tr != null) {
                if (maxTransaksi == null || tr.finalSaldo > maxTransaksi.finalSaldo) {
                    maxTransaksi = tr;
                }
            }
        }
    
        if (maxTransaksi != null) {
            System.out.println("Menampilkan Transaksi dengan Saldo Maksimum");
            System.out.println("======================================================================================");
            System.out.printf("| %-10s | %-15s | %-15s | %-15s | %-10s |\n", 
                              "Kode", "Nama", "No Rekening", "Final Saldo", "Tanggal");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.printf("| %-10s | %-15s | %-15s | %-15.2f | %-10s |\n", 
                              maxTransaksi.kodeTransaksi, 
                              maxTransaksi.bankAcc[0].nama, 
                              maxTransaksi.bankAcc[0].noRekening, 
                              maxTransaksi.finalSaldo, 
                              maxTransaksi.tanggalTransaksi);
            System.out.println("======================================================================================");
        } else {
            System.out.println("Tidak ada transaksi yang ditemukan.");
        }
    }
    
    public void sortingBydebitkredit() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (Transaksi[j].inOutSaldo > Transaksi[j + 1].inOutSaldo) {
                    transaksi temp = Transaksi[j];
                    Transaksi[j] = Transaksi[j + 1];
                    Transaksi[j + 1] = temp;
                }
            }
        }

        
        System.out.println("Menampilkan Data Transaksi setelah Sorting (berdasarkan No Rekening):");
    System.out.println("==================================================================================");
    System.out.printf("| %-10s | %-15s | %-15s | %-15s |\n", 
                      "Kode", "Nama", "Debit/Kredit", "Tanggal");
    System.out.println("----------------------------------------------------------------------------------");
        for (transaksi tr : Transaksi) {
            if (tr != null) {
                System.out.printf("| %-15s | %-15s | %-15.2f | %-15s |\n",
                                  tr.bankAcc[0].noRekening, tr.bankAcc[0].nama, tr.inOutSaldo, tr.tanggalTransaksi);
            }
        }
        System.out.println("==================================================================================");
    }
}
