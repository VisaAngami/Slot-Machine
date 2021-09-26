import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter Money: ");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int startingMoney = 100;
        String choice = "y";

        do{
            int betMoney = scanner.nextInt();
            if(betMoney <= startingMoney)
                startingMoney -= betMoney;
            else
                System.exit(0);

            int r = random.nextInt(6);
            if(r==3){
                startingMoney = betMoney * 10;
                System.out.println("You Won! Money Left:" + startingMoney);
            }
            else{
                System.out.println("You Lost! Money Left:" + startingMoney);
            }

            System.out.println("Again?");
            System.out.println(" Press y for yes and n for NO");
            scanner.nextLine();
            if(scanner.hasNextLine())
                System.out.println(" Enter Money: ");
                choice = scanner.nextLine();
        }
        while(startingMoney > 0 && choice.equals("y"));
        System.out.println("You don't have money left or you didn't say y :( Bye");

    }
}
