import java.util.*;

public class Anagramgrouping {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str[] = new String[n];
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            str[i] = in.next();
            for(int j=0;j<str[i].length();j++)
            {
                arr[i]=arr[i]+str[i].charAt(j);
            }
           // System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(str[i]+" ");
        }

        

        in.close();
    }
}
