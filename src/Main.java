import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sayac=0,sayac2=0;
        int ebob=0;
        int karar;
        System.out.print("LÜTFEN İŞLEMİNİZİ SEÇİNİZ \n1-EBOB BUL\n2-EKOK BUL\nİŞLEMİNİZ: ");
        karar=inp.nextInt();
        if(karar==1) {
            System.out.println("EBOB");
            System.out.print("Küçük sayıyı giriniz: ");
            int n1 = inp.nextInt();
            System.out.print("Büyük sayıyı giriniz: ");
            int n2 = inp.nextInt();

            while (sayac <= n1) {
                sayac++;
                if (n1 % sayac == 0 && n2 % sayac == 0) {
                    ebob = sayac;
                }
            }
            System.out.println(ebob);
        } else if (karar==2) {
            System.out.println("EKOK");
            System.out.print("Küçük sayıyı giriniz: ");
            int k1 = inp.nextInt();
            System.out.print("Büyük sayıyı giriniz: ");
            int k2 = inp.nextInt();
            while (sayac2<=(k1*k2)){
                sayac2++;
                if (sayac2%k1==0 && sayac2%k2==0){
                    System.out.println(sayac2);
                    break;
                }
            }
        }
    }
}