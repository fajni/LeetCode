package Problems;
import java.util.*;
public class Check_If_N_And_Its_Double_Exist {

    public static boolean checkIfExist(int arr[]){

        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr.length;j++){
                if(arr[i]==2*arr[j] && i!=j){
                    System.out.println("arr[i]: "+i);
                    System.out.println("arr[j]: "+j);
                    return true;
                }
            }

        return false;
    }


    public static void main(String[] args) {

        int arr[] = {-2,0,10,-19,4,6,-8};
        int arr2[]={10,2,5,3};
        int arr3[]={3,1,7,11};
        System.out.println(Arrays.toString(arr)+"\n\n");

        System.out.println(checkIfExist(arr));

    }
}
