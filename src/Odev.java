import java.util.Scanner;
public class Odev {
    public static void main(String[] args) {
        int sayac=0,sayi=0,toplam=0,averange;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı  : ");
        sayi=input.nextInt();
        while(sayi>0){

          if(sayi%3==0 && sayi%4==0){
              toplam+=sayi;
              sayac++;
          }
            sayi--;

        } averange=toplam/sayac;
        System.out.print("Ortalama : "+averange);
    }
}
