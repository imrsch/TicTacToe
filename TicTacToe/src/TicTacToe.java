
//Michael Schulz
//PR1 30.10.2018
import java.util.*;

public class TicTacToe {

	public static void main(String[] args) {

		// Scanner
		Scanner objScanner;
		objScanner = new Scanner(System.in);

		// Declaration of the variables
		String field[] = new String[9];
		String str_input;
		int eingabe;
		int computereingabe;
		boolean w = false;
		boolean rundenende = false;
		boolean bol_why =true;
		boolean stupidplayer = false;
		
		//Do-while until an accepted input is made
		do
		{
		//Game start Yes/No
		System.out.println("Do you want to start the game? J/N ");
		str_input = objScanner.next();
		//If J/j -> leave do-while
		if(str_input.equals("J") || str_input.equals ("j"))
		{
			bol_why = true;
		}
		else
		{
			//If N/n -> Exit Game
			if(str_input.equals("N") || str_input.equals ("n"))
			{
			    System.out.println("Exit.");
			    System.exit(0);
			}
			//If not N/n or J/j repeat the question for the player again
			else
			{
				System.out.println("Wrong Input!");
			    bol_why = false;
			}
		}
		}
		while(bol_why == false);
		
		//Fill Array 
		for (int i = 0; i <= 8; i++) {
			if (i <= 8) {
				field[i] = "( )";
			}	
			//Create a numbered field
			if (i == 2 || i == 5) {
				System.out.println("("+ (i+1) +")");
			} else {
				System.out.print("("+ (i+1) +")");
			}
		}
        //Do-while until someone wins
		do {
			//Do-while until player choose a empty field
            do
            {
			//Player can choose a field
			System.out.println(" ");
			System.out.print("Bitte Feld eingeben: ");
			eingabe = objScanner.nextInt();
			//Not on a field with (X) again
			if(field[0] == "(X)"&&eingabe==1||field[1] == "(X)"&&eingabe==2||field[2] == "(X)"&&eingabe==3||
					field[3] == "(X)"&&eingabe==4||field[4] == "(X)"&&eingabe==5||field[5] == "(X)"&&eingabe==6||
					field[6] == "(X)"&&eingabe==7||field[7] == "(X)"&&eingabe==8||field[8] == "(X)"&&eingabe==9)
			{
				stupidplayer = true;
				System.out.println("Bitte ein freies Feld auswählen!");
			}
			//Not on a field with (O)
			else if (field[0] == "(O)"&&eingabe==1||field[1] == "(O)"&&eingabe==2||field[2] == "(O)"&&eingabe==3||
				field[3] == "(O)"&&eingabe==4||field[4] == "(O)"&&eingabe==5||field[5] == "(O)"&&eingabe==6||
				field[6] == "(O)"&&eingabe==7||field[7] == "(O)"&&eingabe==8||field[8] == "(O)"&&eingabe==9)
			{
				stupidplayer = true;
				System.out.println("Bitte ein freies Feld auswählen!");
			}
			else
			{
				stupidplayer = false;
			}
            }while(stupidplayer == true);
            //Chosen field is filled with an X
			field[eingabe - 1] = "(X)";
    	    
			//Integrate method unentschieden
			Gewinnueberpruefung g1 = new Gewinnueberpruefung();
			g1.unentschieden(field);
    	    
			//Do while to avoid wrong Inputs of the computer
            do
            {
            	//Generate random Integer 0-9
				computereingabe = (int) ((Math.random() * 9 + 1)) - 1;
				//Not on a field with (X)
				if(field[0] == "(X)"&&computereingabe==0||field[1] == "(X)"&&computereingabe==1||field[2] == "(X)"&&computereingabe==2||
						field[3] == "(X)"&&computereingabe==3||field[4] == "(X)"&&computereingabe==4||field[5] == "(X)"&&computereingabe==5||
						field[6] == "(X)"&&computereingabe==6||field[7] == "(X)"&&computereingabe==7||field[8] == "(X)"&&computereingabe==8)
				{
					w = true;
				}
				//Not on a field with (O) again
				else if (field[0] == "(O)"&&computereingabe==0||field[1] == "(O)"&&computereingabe==1||field[2] == "(O)"&&computereingabe==2||
					field[3] == "(O)"&&computereingabe==3||field[4] == "(O)"&&computereingabe==4||field[5] == "(O)"&&computereingabe==5||
					field[6] == "(O)"&&computereingabe==6||field[7] == "(O)"&&computereingabe==7||field[8] == "(O)"&&computereingabe==8)
				{
					w = true;
				}
				else
				{
				w = false;
                }
            }
            while(w == true);
            
			//Chosen field of the computer is filled with an O
            field[computereingabe] = "(O)";
    		//Integrate method pruefGewinn
    	    Gewinnueberpruefung g2 = new Gewinnueberpruefung();
    	    rundenende = g2.pruefGewinn(field, rundenende);
            //Update of the field
			for (int k = 0; k <= 8; k++) {
				if (k == 2 || k == 5) {
					System.out.println(field[k]);
				} else {
					System.out.print(field[k]);
				}
			}
		
		} while (rundenende == false);
		//End
		System.out.println(" ");
	    System.out.println("Game over.");
   
	}

}
