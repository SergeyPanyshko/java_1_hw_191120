package hw1;

public class Main {
    public static void main(String[] args) {
        byte a = 8;
        short b = 16;
        int c = 32;
        long d = 64;
        float e = 12.01f;
        double q = 12.2323;
        char l = 'R';
        boolean s = true;

        System.out.println(sum()); // 3 ЗД

        System.out.println(isItTrue(4,5)); // 4 ЗД

        whatNumber(-100); // 5 ЗД

        System.out.println(whatNumber2(1000)); // 6 ЗД

        printName("Сергей"); // 7 ЗД
    }
    public static float sum(){
        float a=12,b=20,c=13,d=10;
        return a * (b + (c / d));
    }

    public static boolean isItTrue (int a, int b){
        return  a+b>=10 && a+b<=20;
    }

    public static void whatNumber(int a){
        if (a>=0) System.out.println("Число положительное!");
        else {
            System.out.println("Число отрицательно!");
        }
    }

    public static boolean whatNumber2(int a){
        return a < 0;
    }

    public static void printName(String name ){
        System.out.println("Привет,"+ name +"!");
    }
}


