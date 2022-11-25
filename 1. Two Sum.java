package Problems;
import java.util.*;
public class two_Sum {

    public static Scanner input = new Scanner(System.in);

    public static int[] twoSum(int[] nums, int target){
        int temp[] = new int[2];

        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++) //for(int j<0;j<i;j++)
                if(target==nums[i]+nums[j]){
                    System.out.println("["+nums[i]+" "+nums[j]+"]");
                    temp[0]=j;
                    temp[1]=i;
                }
        System.out.println("Index: "+Arrays.toString(temp));

        return temp;

    }

    public static void main(String[] args) {

        System.out.println("Enter target: ");
        int target = input.nextInt();

        System.out.println("Enter size of array: ");
        int n = input.nextInt();

        int array[] = new int[n];

        for(int i=0;i< array.length;i++){
            System.out.println("Enter "+(i+1)+". element: ");
            array[i]=input.nextInt();
        }

        System.out.println("Array: "+ Arrays.toString(array));

        System.out.println(twoSum(array,target));

    }
}
