import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Choose a category:");
        System.out.println("1. Science");
        System.out.println("2. History");
        System.out.println("3. Sports");

        int category = reader.nextInt();

        switch (category) {
            case 1:
                System.out.println("What is the first element on the period table?");
                String firstElement = reader.next();
                if(firstElement.equals("Hydrogen")){
                    System.out.println("Correct! You earned one point!");
                }
                else{
                    System.out.println("Incorrect. The correct answer is hydrogen");

                }
                break;

            case 2:
                System.out.println("When did World War I start?");
                int year = reader.nextInt();
                if(year == 1914){
                    System.out.println("Correct! You earned one point!");
                }
                else{
                    System.out.println("Incorrect. The correct answer is 1914");
                }
                break;

            case 3:
                System.out.println("What sport is played in teams of 6, a ball and a net?");
                String sport = reader.next();
                if(sport.equals("Volleyball")){
                    System.out.println("Correct! You earned one point!");
                }
                else{
                    System.out.println("Incorrect. The correct answer is volleyball");
                }
                break;

            default:
                System.out.println("Incorrect category. Try again.");
        }

    }
}




