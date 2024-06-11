package com.BankGame;
import java.util.Scanner;

public class Main {
    //Main void
    public static void main(String[] args) {
        System.out.print("Hello! Welcome to BankGame!\nEnter your Username  ");
        Scanner scan = new Scanner(System.in);
        User user = new User();
        user.name = scan.nextLine();
        user.Actions();
    }
    //Class "User"
    public static class User {
        int Money;
        String name;

        //Void GetInfo
        public void GetInfo() {
            System.out.printf("\nName = %s \nMoney = %d\n\n" , this.name,this.Money);
        }
        //Void Actions(ShowMenu)
        public void Actions(){
            System.out.print("Menu: \n1.GetInfo\n2.Shop\n3.GiveMoney\n");
            Scanner Action = new Scanner(System.in);
            int UserAction;
            UserAction = Action.nextInt();
            if(UserAction == 1){
                this.GetInfo();
                this.Actions();
            } else if (UserAction == 2) {
                System.out.println("Items: \n1.Burger - 49Dollars \n2.Rare Rock - 129Dollars\n3.Penis - 399Dollars\n4.PlayStation 5 - 699Dollars\n5.Small House - 8799Dollars\n6.Yacht - 14999Dollars\n7.Big House - 23999\n8.Plane - 28999Dollars\n9.Big Plane - 37999Dollars\n10.Cruiser - 467999Dollars");
                Scanner Shop_Choice = new Scanner(System.in);
                int Choice = Shop_Choice.nextInt();
                if(Choice == 1){
                    this.Money -= 49;
                    System.out.println("You buy a One Burger Balance = " + this.Money);
                }
                else if(Choice == 2){
                    this.Money -= 129;
                    System.out.println("You buy a Rare Rock!Balance = " + this.Money);
                }
                else if(Choice == 3){
                    this.Money -= 399;
                    System.out.println("You buy a Di## !Balance = " + this.Money);
                }
                else if(Choice == 4){
                    this.Money -= 699;
                    System.out.println("You buy a PlayStation 5 !Balance = " + this.Money);
                }
                else if(Choice == 5){
                    this.Money -= 8799;
                    System.out.println("You buy a Small House! !Balance = " + this.Money);
                }
                else if(Choice == 6){
                    this.Money -= 14999;
                    System.out.println("You buy a Yacht! !Balance = " + this.Money);
                }
                else if(Choice == 7){
                    this.Money -= 23999;
                    System.out.println("You buy Big House! !Balance = " + this.Money);
                }
                else if(Choice == 8){
                    this.Money -= 28999;
                    System.out.println("You buy a Plane Balance = " + this.Money);
                }
                else if(Choice == 9){
                    this.Money -= 37999;
                    System.out.println("You buy a Big Plane! Balance = " + this.Money);
                }
                else if(Choice == 10){
                    this.Money -= 467999;
                    System.out.println("You buy a Cruiser! Balance = " + this.Money);
                }else {
                    System.out.println("Incorrect Choice!");
                    this.Actions();
                }
                this.Actions();
            }else if(UserAction == 3) {
                System.out.print("Enter the amount of money received: ");
                Scanner give_Money = new Scanner(System.in);
                int Give_Money_from_Scanner = give_Money.nextInt();
                this.Money += Give_Money_from_Scanner;
                System.out.printf("You received %d Dollars\n", this.Money);
                this.Actions();
            }else{
                System.out.println("!!!Incorrect Choice!!!\n");
                this.Actions();
            }
        }
    }
}