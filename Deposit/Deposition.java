
package Deposit;
import java.util.*;
interface DepositMoney
{
    public double deposit();
}
public class Deposition implements DepositMoney
{
    public double deposit()
    {
        double amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount for deposition:");
        amount=sc.nextDouble();
        System.out.println("Amount successfully deposited..");
        return amount;
    }
}