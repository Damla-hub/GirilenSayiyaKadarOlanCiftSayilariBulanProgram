import java.util.Scanner;
public class GirilenSayiyaKadarOlanCiftSayilariBulanProgram {
    public static void main(String[] args) {
        int sayi=0;
        Scanner input=new Scanner(System.in);
        sayi=input.nextInt();
        while(sayi>=1){
            sayi--;
            if(sayi%2==1){
                continue;
            }
        System.out.println(sayi);
        }
    }
}
