import java.util.Scanner;

public class item {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        float pencial = Sc.nextFloat();
        float pen = Sc.nextFloat();
        float eraser = Sc.nextFloat();
        float total = pencial + pen + eraser;
        System.out.println("Bill is : " + total);

        //Add on - with 18% tax
        
        float newTotal = total + (0.18f * total);

        System.out.println("Bill with 18% tax : " + newTotal);
    }
}
