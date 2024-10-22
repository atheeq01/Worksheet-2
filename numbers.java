public class numbers {
    public static void main(String[] args){
        int x=10;
        while (x<50){
            System.out.print(x+" ");
            x++;
            if(x%10==0) {
                System.out.println();
            }
        }
    }
}
