package Problems;
import java.util.*;
public class Largest_Perimeter_Triangle {
    public static Scanner input = new Scanner(System.in);

    public static int largestPerimeter(int[] nums){


        //SELECTION SOT
        int temp;
        for(int i=0;i<nums.length;i++)
            for(int j=i;j<nums.length;j++)
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }

        System.out.print("Sorted Array: "+Arrays.toString(nums));

        for(int i=nums.length-1;i>1;i--){ //i>1 ide jer imas nums[i-2]. ako stavim i>0 index ne moze da ode do -1
            if(nums[i]<nums[i-1]+nums[i-2])
                return nums[i]+nums[i-1]+nums[i-2];
        }


        return 0;
    }

    public static int largest(int[] nums){
        Arrays.sort(nums);

        for (int i = nums.length - 3; i >= 0; --i) {
            if (nums[i] + nums[i + 1] > nums[i + 2])
                return nums[i] + nums[i + 1] + nums[i + 2];
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+". element: ");
            array[i]=input.nextInt();
        }

        System.out.println("Array: "+Arrays.toString(array));
        System.out.println(largest(array));
    }
}
