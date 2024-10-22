import java.util.Scanner;

public class five_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 5 integer Numbers :");
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = in.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }


        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("All Are same numbers");
        } else{
            System.out.println(secondLargest);
        }
    }
}

