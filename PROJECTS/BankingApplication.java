package jAVA.PROJECTS;

import java.util.PropertyResourceBundle;
import java.util.Scanner;

public class BankingApplication {
    public  static void main(String[] args){
        BankAccount obj1 = new BankAccount("scbdsic","wnedfw");
        obj1.ShowMenu();
    }
}

class BankAccount
{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname,String cid){
        customerName=cname;
        customerId=cid;

    }
    void deposite(int amount){
        if (amount!=0){
            balance=balance+amount;
            previousTransaction=amount;
        }

    }
    void Withdraw(int amount){
        {
            if (amount !=0){
                balance=balance-amount;
                previousTransaction=-amount;
            }
        }
    }
    void getPreviousTransaction(){
        if(previousTransaction>0){
            System.out.println("Deposited"+previousTransaction);
        }
        else if(previousTransaction<0){

            System.out.println("Withdrawn"+Math.abs(previousTransaction));

        }
        else
            System.out.println("no transaction occured");
    }

    void ShowMenu(){
        char options='\0';
        Scanner scanner= new Scanner(System.in);

        System.out.println("Welcome"+customerName);
        System.out.println("Your id"+customerId);
        System.out.println();
        System.out.println("A:Check balance");
        System.out.println("B:deposit ");
        System.out.println("C:Withdraw");
        System.out.println("D:Previous Transaction");
        System.out.println("E:Exit");


        do {
            System.out.println("************************************************************************");
            System.out.println("enter a option");
            options=scanner.next().charAt(0);
            System.out.println("************************************************************************");
            System.out.println();

            switch (options){
                case 'A':
                    System.out.println("********************************");
                    System.out.println("balance="+balance);
                    System.out.println("********************************");
                    System.out.println("");
                    break;
                case 'B':
                    System.out.println("********************************");
                    System.out.println("Enter the amount to deposite");
                    System.out.println("********************************");
                    int amount=scanner.nextInt();
                    deposite(amount);
                    System.out.println("");
                    break;

                case 'C':
                    System.out.println("********************************");
                    System.out.println("Enter the amount to Withdraw");
                    System.out.println("********************************");
                    int amounts=scanner.nextInt();
                    Withdraw(amounts);
                    System.out.println("");
                    break;

                case 'D':
                    System.out.println("********************************");
                    getPreviousTransaction();
                    System.out.println("********************************");
                    System.out.println("");
                    break;
                default:
                    System.out.println("invalid option please enter again");
                    break;
            }
        }while(options!='E' );
    }
}
