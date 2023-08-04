package Withdraw;
import java.util.*;
interface Withdrawal
{
    public double withdraw();
}
public class WithdrawMoney implements Withdrawal
{
    public double withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the withdrawal money..");
        double d=sc.nextDouble();
        if(d<=20000.0)
        {
            return d;
        }
        else
        {
            System.out.println("You can withdraw only 20000 perday");
            return 0.0;
        }
    }
}