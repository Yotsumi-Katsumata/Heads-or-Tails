import java.util.Random;
import java.util.Scanner;

public class HeadTailGame{
    public static void main(String args[]){
	int Heads=0, Tails=0;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Who are you?");
	System.out.print("> ");
	String name=sc.next();
	System.out.println("Hello, "+name+"!");
	
	System.out.println("Tossing a coin...");
	Random rand=new Random();

	for(int i=0;i<3;i++){
	    System.out.print("Round "+i+": ");
	    boolean coin=rand.nextBoolean();
	    if(coin==true){
		System.out.println("Heads");
		Heads++;
	    }
	    else{
		System.out.println("Tails");
		Tails++;
	    }
	}
	System.out.println("Heads: "+Heads+", Tails: "+Tails);
	if(Heads>Tails) System.out.println("You won");
	else System.out.println("You lost");
    }
} 
