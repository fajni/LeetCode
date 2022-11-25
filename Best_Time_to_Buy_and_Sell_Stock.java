package Problems;
import java.util.*;
public class Best_Time_to_Buy_and_Sell_Stock {
    public static Scanner input = new Scanner(System.in);

    //NOT ACCEPTED!
    
    public static int maxProfit(int[] prices){
        int buy = prices[0]; //moras da kupis zato ide prices[0]
        //int sel = 0;//biggest price
        int counterBuy=0, counterSel=0;

        //LOWEST
        for(int i=0;i<prices.length;i++)
            if(buy>prices[i]){
                buy=prices[i];
                counterBuy=i;
            }

        int sel = prices[counterBuy]; //ne mozes da prodas pre nego sto kupis
        //BIGGEST
        for(int i=counterBuy;i<prices.length-1;i++)
            if(sel<prices[i]){
                sel=prices[i];
                counterSel=i;
            }

        if(counterBuy==counterSel)
            return 0;

        System.out.println("Buy: "+buy);
        System.out.println("Sell: "+sel);

        return sel-buy;
    }

    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        int array[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+". element: ");
            array[i]=input.nextInt();
        }

        int array2[] = {2,4,1};

        System.out.println("Array: "+Arrays.toString(array));

        System.out.println(maxProfit(array));
    }
}
