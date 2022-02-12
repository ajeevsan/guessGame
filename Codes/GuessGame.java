public class GuessGame {
    //Instance variable
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1Is = false;
        boolean p2Is = false;
        boolean p3Is = false;

        int target = (int) (Math.random()*10);
        System.out.println("I'am thinking of a number between 0 - 9.");

        while(true){
            System.out.println("The number i guess is "+target);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("The player 1 guess "+guessp1);
            guessp2 = p2.number;
            System.out.println("THe player 2 guess "+guessp2);
            guessp3 = p3.number;
            System.out.println("The player 3 guess "+guessp3);

            if(guessp1 == target){
                p1Is = true;
            }

            if(guessp2 == target){
                p2Is = true;
            }

            if(guessp3 == target){
                p3Is = true;
            }

            if(p1Is || p2Is || p3Is){
                System.out.println("We have a winner.");
                System.out.println(("Player 1 got it right?"+p1Is));
                System.out.println("Player 2 got it right?"+p2Is);
                System.out.println("Player 3 get it right?"+p3Is);
                System.out.println("Game over.");
                break;
            }

            else{
                System.out.println("You have to guess again.");
            }

        }


    }
}
