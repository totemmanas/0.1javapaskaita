import java.util.Scanner;

public class treciapaskaitasavarankiskasdarbas {

    //*Parašyti programą kuri paprašytų vartotojo įvesti žodį
    // ir jį iš karto atvaizduotų, tada vėl paprašytų įvesti kitą žodį, jį atvaizduotų,
    // ir procesą kartotų tol, kol nebus įvestas žodis „pabaiga“.
    //Patikrinkite ar įvestas žodžio ilgis yra lyginis ar ne tam panaudokite % operatoriu.
    // Jei žodis yra lyginis atspausdinkite “Įvestas žodis  {įvestas_žodis} yra lyginis” ir šalia kokio ilgio yra žodis.
    // Jei nelyginis “Įvestas žodis {įvestas_žodis} nelyginis” šalia jo ilgį. Taip suskaičiuokite kiek tame žodyje yra “a” raidžių.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("iveskite zody jei norite baigti iveskite PABAIGA");
            String word = sc.nextLine();

            if (word.toLowerCase().equals("pabaiga")) {

                break;
            }
            if (word.length() % 2 == 0) {
                System.out.println("ivestas zodis" + word + "zodis yra lyginis" + word.length());
            } else {
                System.out.println("zodis" + word + "yra nelyginis jo ilgis" + word.length());
            }
        }
    }

    private static int countHowLetterHaveWord(String word, char letter) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;


    }
}
