import java.util.Scanner;

public class bankdomain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        serviceTransaksi serviceTransaksi = new serviceTransaksi(5) ;

        bank trs1 =new bank("16030927 3084", "Wallace", "Mei Mei", "082-458-264-3263", "wallace@gmail.com");
        bank trs2 =new bank("16100617 0573", "Darius", "Susanti", "081-357-843-0547", "darius@pt.org");
        bank trs3 =new bank("16240401 2243", "Fuller", "Rosalia", "085-556-712-7062", "fuller@mail.com");
        bank trs4 =new bank("16270525 0112", "Maria", "Krabela", "082-267-223-0234", "mari@gmail.com");
        bank trs5 =new bank("16101617 2416", "Gery", "Fatimah", "083-683-416-8323", "gery@gery.com");
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
}
