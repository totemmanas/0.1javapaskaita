import java.util.Scanner;

public class ketvirtasuzdavinys {

    //4.      Parašyti programą, kuri paprašytų įvesti 5 skaičius.
    // Baigus skaičių įvedimą, turi būti atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai.

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("iveskite penkis skaicius");
        int mas[]=new int[5];
        for (int i = 0; i <5; i++){
            System.out.println("iveskite " +i+" skaiciu");
            mas[i]=sk.nextInt();
        }
        int sum=0;
        for (int i =0;i<mas.length;i++){
            sum+=mas[i];
            System.out.println(mas[i]);
        }

        System.out.println(sum);



    }
}
