import java.util.*;

class Game{
public static void main(String[] args) {
    System.out.println("Lets play Rock Paper and Scissor");
    System.out.println("0-> Rock");
    System.out.println("1-> Scissor");
    System.out.println("2-> Paper");
    Scanner sc = new Scanner(System.in);
    int value = sc.nextInt();

    Random rand = new Random();
    int r = rand.nextInt(3);
  
    if((value==0 && r==0) || (value==1 && r==1) || (value==2 && r==2)){
        System.out.println("Draw!");
    }
    else if((value==0 && r==1) || (value==1 && r==2) || (value==2 && r==0)){
        System.out.println("Win!");
    }
    else{
        System.out.println("You Lose!");
    }

    System.out.println("Computer Choice: "+r);

    sc.close();
    }
}
