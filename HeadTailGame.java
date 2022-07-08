import java.util.Random;

public class HeadTailGame{
    public static void main(String args[]){
	int Heads=0, Tails=0;
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
