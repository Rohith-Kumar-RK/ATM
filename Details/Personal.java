package Details;
import java.util.*;
interface DetailsPersonal
{
    public String details();
}
public class Personal implements DetailsPersonal
{
    public String details()
    {
        Scanner sc=new Scanner(System.in);
        String cardno;
        boolean a=false;
        boolean c=false;
        while(true)
        {
            System.out.println("enter the card number:");
            cardno=sc.nextLine();
            if(cardno.length()==16)
            {
                a=true;
                for(int i=0;i<cardno.length();i++)
                {
                char s=cardno.charAt(i);
                if(s>='0' && s<='9')
                {
                    c=true;

                }
                }
                if(a && c)
                {
                    return cardno;
                }
                else
                {
                    System.out.println("Wrong number! please retry!!");
                    return "0";
                }
            }
        }
    }
}