import java.util.InputMismatchException;
import java.util.Scanner;

public class darMatiechos {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        //* Parašykite programą kuri padėtu moksleiviui atlikti matematikos darbus.
        // Jam reikia apskaičiuoti figūrų plotus. Visi plotai skaičiuojami atskiruose metoduose.
        // Moksleivis įveda rodmenys naudodamas konsolę (Scanner sc = new Scanner(System.in)).
        // Moksleivis gali pasirinkti kokios figūros plotą skaičiuos. Po to sistema paprašo įvesti matmenys reikalingus tos figūros ploto skaičiavimui.
        //a.       Apskaičiuotu stačiojo trikampio plotą. Formulė rezultatas = (a*b)/2;
        //b.      Stačiakampio plotas, formulė rezultatas =a*b.
        //c.       Kvadrato plotas, rezultatas = a^2
        //d.      Apskritimo plotas, Formulė rezultatas = pi*(a^2). Pi = 3.1415


        meniu();
        String selecion = s.nextLine();
        switch (selecion){
            case "a":
                //staciojo trikampio plotas
                staciojotrikampioplotas();
                break;
            case "b":
                //staciakampio plotas
                staciakampioplotas();
                break;
            case "c":
                //kvadrato plotas
                kvadratoplotats();
                break;
            case "d":
                //apskritimo plotas
                apskritimoplotas();
                break;
                default:
                    System.out.println("baka tu");
                    break;
        }
    }

    private static void meniu(){
        System.out.println("pasirinkite ka norite daryti\na. staciojo trikampio plotas\nb. staciakampio plotas\nc.kvadratoplotas\nd. apskritimo plotas");

    }
    private static void staciojotrikampioplotas(){
        System.out.println("iveskit a statini");
        double a = s.nextDouble();
        System.out.println("iveskite b statini");
        double b = s.nextDouble();

        double p = (a*b)/2;
        System.out.println("staciojo trikampio plotas yra: "+p);
    }
    private static void staciakampioplotas (){
        System.out.println("iveskite krastine a");
        double a = s.nextDouble();
        System.out.println("iveskite krastine b");
        double b = s.nextDouble();

        double kp = (a*b);
        System.out.println("staciakampio plotas: "+kp);
    }
    private static void kvadratoplotats (){
        System.out.println("iveskite krastine a");
        double a = s.nextDouble();

        double kub = a*a;
        System.out.println("kavadrato plotas yra: "+kub);
    }
    private static void apskritimoplotas(){
        System.out.println("iveskite spinduly");
        double a = s.nextDouble();

        double appl =3.1415 *  Math.pow(a, 2);
        System.out.println("apskritimo plotas yra: "+appl);
    }
    private static double getCorrecktNumber(){
        double result = 0.0;
        while (true){
            try {
                result = s.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("Baka iveskt gera skaiciu SKAICIU!!!");
                s.nextInt();
            }
        }return result;
    }
}
