import java.util.Scanner;
/*
public class pyramid {
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of Row :");
        int rows=in.nextInt();
        int space=rows;
        int astric=1;
        for(int i=1;i<=rows;i++){
            for(int k=1;k<space;k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=astric;j++) {
                    System.out.print("*");
            }
            System.out.println();
            astric+=2;
            space--;
        }
    }
}
*/

public class pyramid{
    public static void main(String[] args){
        System.out.print("Enter the number of Row :");
        Scanner in=new Scanner(System.in);
        int rows=in.nextInt();
        in.close();
        int space=rows-1;
        int astric=1;
        StringBuilder pyramid=new StringBuilder();
        for (int i=1;i<=rows;i++){
            pyramid.append(" ".repeat(space)).append("*".repeat(astric)).append("\n");
            space--;
            astric+=2;
        }
        System.out.print(pyramid);
    }
}