
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
		int eingabe;
		int computereingabe;
		int identisch = -1;
		boolean rundenende;
		boolean w=false;

		// Field
		for (int i = 0; i <= 8; i++) {
			if (i <= 8) {
				field[i] = "( )";
			}

			if (i == 2 || i == 5) {
				System.out.println("( )");
			} else {
				System.out.print("( )");
			}

		}
		do {
			System.out.println(" ");
			System.out.println("Bitte Feld eingeben: ");
			eingabe = objScanner.nextInt();

			field[eingabe - 1] = "(X)";
            do
            {
				computereingabe = ((int) (Math.random() * 9 + 1)) - 1;
				if(computereingabe!=eingabe)
				{
					w = true;
				}
				else if(computereingabe==identisch)
				{
					w = true;
				}
				identisch = computereingabe;
            }
            while(w = false);

			field[computereingabe] = "(O)";

			for (int k = 0; k <= 8; k++) {
				if (k == 2 || k == 5) {
					System.out.println(field[k]);
				} else {
					System.out.print(field[k]);
				}
			}

		} while (rundenende = true);

	}

	public boolean pruefGewinn(String field[], boolean rundenende)
	{
		if(     
				//horizontal
				field[0] == "(X)" && field[1] == "(X)" && field[2] == "(X)" ||
				field[3] == "(X)" && field[4] == "(X)" && field[5] == "(X)" ||
				field[6] == "(X)" && field[7] == "(X)" && field[8] == "(X)" ||
				//vertical
				field[0] == "(X)" && field[3] == "(X)" && field[6] == "(X)" ||
				field[1] == "(X)" && field[4] == "(X)" && field[7] == "(X)" ||
				field[0] == "(X)" && field[1] == "(X)" && field[2] == "(X)" ||
				
				field[0] == "(X)" && field[4] == "(X)" && field[8] == "(X)" ||
				field[2] == "(X)" && field[4] == "(X)" && field[6] == "(X)" 
		  )
		{
			System.out.println("Spieler gewinnt");
		}
		else
		if(
				//horizontal
			    field[0] == "(O)" && field[1] == "(O)" && field[2] == "(O)" ||
			    field[3] == "(O)" && field[4] == "(O)" && field[5] == "(O)" ||
			    field[6] == "(O)" && field[7] == "(O)" && field[8] == "(O)" ||
			    //vertical
			    field[0] == "(O)" && field[3] == "(O)" && field[6] == "(O)" ||
			    field[1] == "(O)" && field[4] == "(O)" && field[7] == "(O)" ||
			    field[0] == "(O)" && field[1] == "(O)" && field[2] == "(O)" ||
			
			    field[0] == "(O)" && field[4] == "(O)" && field[8] == "(O)" ||
			    field[2] == "(O)" && field[4] == "(O)" && field[6] == "(O)" 
		)
		{	
			System.out.println("Computer gewinnt");
		}

		return rundenende;
	}
}
