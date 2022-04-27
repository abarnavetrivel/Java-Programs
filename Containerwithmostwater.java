import java.util.*;
//import java.lang.*;

public class Containerwithmostwater
{
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int height[] = new int[n];

        for(int i=0;i<n;i++)
        {
            height[i] = in.nextInt();
        }

        int minIndex = 0;
        int maxIndex = n-1;
        int maxArea = 0;
        //System.out.println(height[minIndex]+" "+height[maxIndex]);
        //System.out.println(minIndex+" "+maxIndex);
        
        while(maxIndex != minIndex)
        {
            if(height[minIndex] > height[maxIndex] ){
                int t = minIndex;
                minIndex = maxIndex;
                maxIndex = t;
            }
            int newArea = height[minIndex] * Math.abs(minIndex - maxIndex);
            if(newArea > maxArea)
            {
                maxArea = newArea;
            }
            if(minIndex < maxIndex)
            {
                minIndex++;
            }
            else
            {
                minIndex--;
            }
        }
        System.out.print(maxArea);
        

        
        //System.out.print(minIndex+" "+maxIndex);
        in.close();
    }
}