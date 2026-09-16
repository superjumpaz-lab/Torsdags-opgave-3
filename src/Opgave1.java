import java.util.Scanner;

public class Opgave1 {
    Scanner scanner = new Scanner(System.in);

   double balance;
   String accountName;

   /*double deposit100(){
       //int deposit = 100;
       return balance += 100;
   }

    */
    void menu(){
        System.out.println("Press 1 to deposit\nPress 2 to withdraw");
        if (userInput() == 1){
            System.out.println("Insert amount to deposit: ");
            deposit();
        } else if (userInput() == 2){
            System.out.println("Insert amount to withdraw");
            withdraw();
        } else {
            System.out.println("ERROR");
        }
    }



    double deposit(){
        return balance += userInput();
    }

   /*double withdraw50(){
       return balance -= 50;
   }

    */

    double withdraw(){
        return balance -= userInput();
    }



   void printBalance(){
       System.out.println("Your balance is : " + balance + " coins");
   }

   int userInput(){
        return scanner.nextInt();
   }




    void main(){
       accountName = "Simon";
       //deposit100();
       //deposit100();
        menu();


       printBalance();

    }

}
