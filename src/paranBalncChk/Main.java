package paranBalncChk;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        String s;

        Scanner in = new Scanner(System.in);
        s = in.nextLine();

        ParanthesisBalance x = new ParanthesisBalance(s);

        boolean b = x.isBalanced() ? true : false;

        System.out.println(b ? "balanced" : "imbalanced");


        in.close();

    }
}