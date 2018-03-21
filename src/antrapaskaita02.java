import java.util.Scanner;

public class antrapaskaita02 {
    private static final int MAX_NUMB =100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("yveskite kiek skaiciu noresite uzpildyti");
        int kiek = sc.nextInt();

        int[]mas = new int[kiek];

        for (int i = 0; i< kiek; i++){
            System.out.println("iveskite" + i + "skaicius");
            mas[i] = sc.nextInt();

        }
        printMas(mas);

    }
    private static void printMas(int[]skmas){
        for (Integer sk : skmas){
            if (sk >= MAX_NUMB){
                System.out.println(sk);
            }

        }

    }
}
