import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
    System.out.print("1. Sayıyı giriniz:");
    int n1= scan.nextInt();
    System.out.print("2. Sayıyı giriniz:");
    int n2= scan.nextInt();
    System.out.print( "1)TOPLAMA \n 2)ÇIKARMA \n 3)ÇARPMA \n 4)BÖLME \nİşleminizi seçiniz:\n");
    byte secim= scan.nextByte();
    switch (secim){
        case 1 :
            System.out.print("Sonuç: "+(n1+n2));
            break;
        case 2 :
            System.out.print("Sonuç: "+(n1-n2));
            break;
        case 3 :
            System.out.print("Sonuç: "+(n1*n2));
            break;
        case 4 :
            if(n2==0){
                System.out.print("Sıfıra bölünemez");
            }
            else{
                System.out.print("Sonuç: "+ (n1/n2));
            }
            break;
        default:
            System.out.print("HATALI SEÇİM");
    }
    }
}
