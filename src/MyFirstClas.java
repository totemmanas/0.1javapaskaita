import com.sun.org.apache.xpath.internal.SourceTree;

public class MyFirstClas {

    //psvm yra klases kurimo trumpinys
    public static void main(String[] args){
        //sout trumpinys texto isspausdinimui
        System.out.print("Hello World ");

        int a=10;
//sukurtas objektas
        MyFirstClas myFirstClas=new MyFirstClas();
//ne statinis kvietimas statineme per klases objekta
        myFirstClas.myNoStatikMethod(a);
        //tiesiog per varda toje pacioije klaseje
        myStaticMethod();

        float b=4.6f;
        double c=2.4;
        boolean d= true;//false

        char e ='A';
        String f = "This is String!!!";//javoje nera kito budo dirbti su tekstu kaip tik vartoti klase





    }


    private void myNoStatikMethod(int numb) {
        System.out.print("Jusu skaicius "+ numb);

    }


    private static void myStaticMethod(){

    }
}
