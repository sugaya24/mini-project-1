import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        City city = new City();
        System.out.println("Here's the question.");
        // System.out.println(city.toString("Vancouver"));
        System.out.println(city.getName().replaceAll(".", "_"));

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Guess a letter: ");
            String input = in.nextLine();
            System.out.println(city.toString(input));
            System.out.println("Wrong letters : " + city.remove());
            if (city.getCount() < 10) {
                System.out.println("Wrong count : " + city.count(input));
            } else {
                System.out.println("You lose!");
                System.out.println("The answer is " + city.getName());
                break;
            }
            if (city.isCorrectName(city.getWord())) {
                System.out.println("Correct answer!!");
                break;
            }
        }
    }
}
