import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class uzdavinys03 {

//Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0. Pabaigoje turi būti atvaizduojama įvestų skaičių suma.
// Skaičiavimas turi būti atliekamas kitame metode.
// Papildykite programą kuri neleistu įvesti ne skaičius, jei vartotojas įveda ne skaičių programa prašo pakartoti tol kol bus įvestas skaičius.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sk = 0;
        int kiek = 0;
        int[] mas = {};


        do{
            System.out.println("veskite tol kol bus yvestas nuli");
            try {
                sk = sc.nextInt();

            }catch (InputMismatchException e){
                System.out.println("blogai ivestaas skaicius,programa baigia darba");
                sc.nextLine();
            }
             sk = sc.nextInt();
             if (mas.length <= kiek){
               mas = Arrays.copyOf(mas,mas.length+1);
            }
            mas[kiek++]=sk;
        }while (sk !=0);

        System.out.println("suma yra :" + masSum(mas) );

    }
    private static int masSum(int[] mas){
        int sum = 0;
        for (Integer m : mas ){
            sum += m;
        }


        return sum;
    }
}
