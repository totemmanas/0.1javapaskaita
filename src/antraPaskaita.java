import java.util.Scanner;

public class antraPaskaita {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Iveskite skaiciu");

        int numb = sc.nextInt();

        if (numb%2==0){
            System.out.println(numb + "yra lygins");
        }
        else{
            System.out.println(numb + " yra nelyginis");
        }
    }
}
