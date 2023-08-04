import java.util.*;
import java.io.*;
class ATM
{
    double sum;
    ATM()
    {
        sum=0.0;
    }
    void atm()
    {
        Scanner sc=new Scanner(System.in);
        String name,phno;
        double f1,a2,bal;
        double amount=0.0;
        double sum2=0.0;
        double sum1=0;
        f1=a2=bal=0.0;
        System.out.println("Enter your good name:");
        name=sc.nextLine();
        Details.Personal p=new Details.Personal();
        String a=p.details();
        System.out.println("*** Hello "+name+" Welcome to SBI ***");
        System.out.println(" 1--> Deposit");
        System.out.println(" 2--> Withdraw");
        System.out.println(" 3--> View Balance");
        System.out.println(" 4--> Transfer Money");
        System.out.println(" 5--> View Details");
        System.out.println(" 6->  mini statement");
        int choice;
        System.out.println("enter the choice:");
        choice=sc.nextInt();
        while(choice!=6)
        {
            switch(choice)
            {
                case 1:
                {

                    Deposit.Deposition d=new Deposit.Deposition();

                    a2=d.deposit();
                    sum=sum+a2;
                    amount=sum;
                    break;
                }
                case 2:
                {
                    Withdraw.WithdrawMoney m=new Withdraw.WithdrawMoney();
                    f1=m.withdraw();
                    if(sum==0.0)
                    {
                        System.out.println("No balance in the Account");
                    }
                    else if(f1>sum)
                    {
                        System.out.println("No sufficient balance..");
                    }
                    else if(f1==amount)
                    {
                        System.out.println("Please maintain balance");
                    }
                    else
                    {
                        sum1=sum1+f1;
                        sum=sum-f1;
                    }
                    break;
                }
                case 3:
                {
                    if(sum<=0)
                    {
                    System.out.println("No Balance");
                    }
                    else
                    {
                    System.out.println("Your Balance is Rs"+sum+"/-");
                    }
                    break;
                }
                case 4:
                {
                    if(sum>0.0)
                    {
                        int number;
                        Bank []c1=new Bank[10];
                        System.out.println("Enter number:");
                        Scanner st=new Scanner(System.in);
                        number=st.nextInt();
                        Details.Personal v=new Details.Personal();
                        String x=v.details();
                        System.out.println("enter the amount you want to transfer:");
                        bal=st.nextDouble();
                        if(bal<sum)
                        {
                            for(int j=0;j<10;j++)
                            {
                                if(j==number)
                                {
                                    c1[j]=new Bank();
                                    c1[j].sum=bal;
                                }
                            }
                            sum=sum-bal;
                        }
                        else
                        {
                            System.out.println("You dont have enough Amount...!!");
                        }
                    }
                    else
                    {

                    System.out.println("You dont have money to transfer");
                    }
                    break;
                }
                case 5:
                {

                    System.out.println(" **Your Details**");
                    System.out.println("NAME: "+name);
                    System.out.println("ATMNO: "+a);
                    break;
                }
                default:
                {
                System.out.println("Please enter b/w 1-5 only..!!");
                }
            }
            System.out.println("enter the choice:");
            choice=sc.nextInt();
        }
        System.out.println(" ***********BILL************");
        System.out.println("Deposited Money:\t\tRs"+amount+"/-");
        System.out.println("Withdrawed Money:\t\tRs"+sum1+"/-");
        if(bal<amount)
        {
            System.out.println("Transfered Money:\t\tRs"+bal+"/-");
        }
        else
        {
            System.out.println("Transfered Money:\t\tRs 0.0/-");
        }
        System.out.println("Your Balance is:\t\tRs"+sum+"/-");
        System.out.println("\t VISIT AGAIN");
        System.out.println("\t THANKYOU");
    }
}
class Customers extends ATM
{
    void method()
    {
        new ATM();
        atm();
    }
}
class Customer
{
    public static void main(String args[])
    {
        Customerdummy g=new Customerdummy();
        g.method();
    }
}