import java.util.Scanner;

public class bankdomain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        serviceTransaksi bank = serviceTransaksi(5);

        while (true) {
            System.out.println("==================POLINEMA BANK==================");
            System.out.println("\nBankMenu:");
            System.out.println("1. Data Norek");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Search Data");
            System.out.println("4. Display Min/Max Saldo ");
            System.out.println("5. Sort Data");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = sc.nextInt();
            sc.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    
                    break;
                    
                    case 2:
                    
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    
                    break;
                    
                    
                case 6:
                    System.out.println("Program selesai.");
                    sc.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static serviceTransaksi serviceTransaksi(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'serviceTransaksi'");
    }
}
