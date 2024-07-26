//In a program, input the side of a square. You have to output the area of the
// square.

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int side = Sc.nextInt();
        int area =  side * side;
        System.out.println(area);

    }

}
