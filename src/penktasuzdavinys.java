import java.util.Arrays;
import java.util.Scanner;

public class penktasuzdavinys {
    //*Parašyti programą kuri paprašytų vartotojo įvesti  5 žodžius.
    // *Po to kai bus įvesti visi žodžiai, jie turi būti atvaizduojami.
    public static void main(String[] args) {
        Scanner zod = new Scanner(System.in);
        System.out.println("iveskite penkis zodzius");
        String mas[] = new String[5];
        for (int i=0;i<5;i++){
            System.out.println("iveskite "+i+" sekanti zodi");
            mas [i]=zod.nextLine();
        }
        System.out.println(Arrays.toString(mas));

    }

}
