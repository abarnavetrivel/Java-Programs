import java.util.*;

public class CharacterAndFrequency
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Character letter=' ';
        String number = "";
        for(int i=0;i<str.length();i++)
        {
            if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9'))   //if alphabet
            {
                if(!number.equals(""))
                {
                int n = Integer.parseInt(number);
                for(int j=0;j<n;j++)
                {
                    System.out.print(letter);
                }}
                letter = str.charAt(i);
                number = "";
            }
            else{           //if number
                number = number + (str.charAt(i) + "");
            }
        }
        int n = Integer.parseInt(number);
                for(int j=0;j<n;j++)
                {
                    System.out.print(letter);
                }


        in.close();
    }
}