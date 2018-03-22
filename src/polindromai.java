import java.util.Scanner;

public class polindromai {
    public static void main(String[] args) {
        System.out.println("jonukai ivesk polindroma");
        Scanner pol =new Scanner(System.in);
        String a = pol.nextLine();
        a=a.replaceAll(" ","");
        boolean p = true;
        for (int i = 0;i<a.length();i++){
            char pradzia = a.charAt(i);
            char galas = a.charAt(a.length()-1-i);

            if (pradzia!=galas){
                System.out.println("ne polindromas");
                p=false;
                break;
            }

        }

        if (p){
            System.out.println("sis zodis yra polindromas");
        }
    }
}
