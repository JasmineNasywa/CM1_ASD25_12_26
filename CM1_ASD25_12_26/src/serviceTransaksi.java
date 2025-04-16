public class serviceTransaksi {
    transaksi [] Transaksi;
        int idx;
    
        public void ServiceTransaksi(int kapasitas) {
            Transaksi = new transaksi[5];
            idx = 0;
        }
        public void tambah(transaksi trs) {
            if (idx < Transaksi.length) {
                Transaksi[idx] = trs;
                idx++;
            }
        }
}
