import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String answer = scan.next();

        String yourChoice = "";

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("\nGreat! /n rock - paper - scissors, shoot!");
            yourChoice = scan.next();
            String computerChoice = computerChoice();
            
            String results = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, results);

        } else {
            System.out.println("Darn, some other time...!");
        }          
        scan.close();
    }//main
    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */

    public static String computerChoice() {
        int number = (int)(Math.random() * 3);
        String compChoice = "";
        switch(number) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return ""; //impossible
        }
    }
    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. Otherwise, the result is "You lose!":
     * 
     * 
     *   4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */
    public static String result(String yourChoice, String computerChoice) {
        String result = "";
            if ((yourChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) || 
                (yourChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) ||
                (yourChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper"))) {
                
                System.out.println("You win!");

            } else if ((computerChoice.equalsIgnoreCase("rock") && yourChoice.equalsIgnoreCase("scissors") ) ||
                        (computerChoice.equalsIgnoreCase("paper") && yourChoice.equalsIgnoreCase("rock")) ||
                        (computerChoice.equalsIgnoreCase("scissors") && yourChoice.equalsIgnoreCase("paper"))) {
                
                System.out.println("You lose");
            } else if (!yourChoice.equalsIgnoreCase("rock") && !yourChoice.equalsIgnoreCase("paper") && !yourChoice.equalsIgnoreCase("scissors")) {
                System.out.println("INVALID CHOICE");
                System.exit(0);
            } else {
                System.out.println("You lose!!");
            }
        return result;
      }//result
    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose :" + yourChoice);
        System.out.println("The computer chose :" + computerChoice);
        System.out.println(result);
    }

}//class RockPaperScissors
