import java.util.Scanner;

public class mini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
  
        do {
            System.out.println("Guess my number : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber) {
                System.out.println("wa beta moj kardi : ");
                break;
            }

            else if(userNumber > myNumber) {
                System.out.println("your number is too large ");
            }


            else {
                System.out.println("your number is smaller ");
            }
        }
            while (userNumber >= 0) ;
                System.out.println(" my number was : ");
                System.out.println(myNumber);
            
            }
          //sc.close;
        

    }

