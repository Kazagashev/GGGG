import java.util.Scanner;

public class Calc {
    public static String calc (String input) {
        Scanner scr = new Scanner(System.in);
        String znam = scr.nextLine();
        String [] perevod = znam.split(" ");
        int a,b;
        a = Integer.parseInt(perevod[0]);
        String c = perevod[1];
        b = Integer.parseInt(perevod[2]);

        calcArabian(a,c,b);
        return input;

    }

    public static void calcArabian(int a, String b, int c){
        switch (b){
            case "+":
                System.out.println(a + b);
                break;
        }

    }
}
