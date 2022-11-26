package Problems;
import java.util.*;
public class BubbleSort {

    public static Scanner input = new Scanner(System.in);

    public static void BubbleSort(int array[]){
        for(int i=0;i<array.length;i++)
            for(int j=0;j<array.length;j++)
                if(array[i]<array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
        System.out.println("Sorted Array: "+Arrays.toString(array));
    }

    public static void main(String[] args) {
        System.out.print("Enter size of an Array: ");
        int size = input.nextInt();

        int array[] = new int[size];

        for(int i=0;i<array.length;i++){
            System.out.println("Enter "+(i+1)+". element: ");
            array[i]=input.nextInt();
        }

        System.out.println("Array: "+Arrays.toString(array));

        BubbleSort(array);
    }
}
