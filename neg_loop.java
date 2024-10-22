import java.util.Scanner;
import java.lang.Math;

public class neg_loop {
    public static void main(String[] args) {
        /*-------------mtd 1--------------------
        Scanner in = new Scanner(System.in);
        int num,digit,y;
        do{
            System.out.println("Enter the a integer : ");
            num= in.nextInt();
            y = num;
            digit=0;
            while (y!=0){
                y/=10;
                digit++;
            }
            System.out.println(num+" Has Digits :"+digit);
        }while(num>0);
        System.out.println("Finished");
*/

        Scanner in = new Scanner(System.in);
        int num, digi;
        do {
            System.out.println("Enter the a integer : ");
            num = in.nextInt();
            digi= countDigit(num);
            System.out.println(num+" Has Digits :"+digi);
        } while (num >0);
        System.out.println("Finished");
        in.close();
    }

    public static int countDigit(int number) {
        int digit = 0;
        int numb=Math.abs(number);
        if (numb==0){
            return 1;
        }
        while (numb > 0) {
            numb /= 10;
            digit++;
        }
        return digit;
    }
}




