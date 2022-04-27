import java.util.*;
//nick white
public class HouseRobber {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //number of houses
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        int dp[] = new int[n + 1]; //dp array ith value is maximum amount that can be robbed till i-1
        dp[0] = 0; //0 1 
        dp[1] = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            dp[i+1] = Math.max(dp[i], arr[i]+dp[i-1]);
            //System.out.print(dp[i]+" ");
        }
       
        System.out.print(dp[arr.length]);
        in.close();

    }
}
