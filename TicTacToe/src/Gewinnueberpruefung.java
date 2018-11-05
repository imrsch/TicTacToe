public class Gewinnueberpruefung {

	public boolean pruefGewinn(String field[], boolean rundenende) {
		if (
		// horizontal
		field[0] == "(X)" && field[1] == "(X)" && field[2] == "(X)"
				|| field[3] == "(X)" && field[4] == "(X)" && field[5] == "(X)"
				|| field[6] == "(X)" && field[7] == "(X)" && field[8] == "(X)" ||
				// vertical
				field[0] == "(X)" && field[3] == "(X)" && field[6] == "(X)"
				|| field[1] == "(X)" && field[4] == "(X)" && field[7] == "(X)"
				|| field[2] == "(X)" && field[5] == "(X)" && field[8] == "(X)" ||
				// crosswise
				field[0] == "(X)" && field[4] == "(X)" && field[8] == "(X)"
				|| field[2] == "(X)" && field[4] == "(X)" && field[6] == "(X)") {
			System.out.println(" ");
			System.out.println("Spieler gewinnt!");
			return rundenende = true;

		} else if (
		// horizontal
		field[0] == "(O)" && field[1] == "(O)" && field[2] == "(O)"
				|| field[3] == "(O)" && field[4] == "(O)" && field[5] == "(O)"
				|| field[6] == "(O)" && field[7] == "(O)" && field[8] == "(O)" ||
				// vertical
				field[0] == "(O)" && field[3] == "(O)" && field[6] == "(O)"
				|| field[1] == "(O)" && field[4] == "(O)" && field[7] == "(O)"
				|| field[2] == "(O)" && field[5] == "(O)" && field[8] == "(O)" ||
				// crosswise
				field[0] == "(O)" && field[4] == "(O)" && field[8] == "(O)"
				|| field[2] == "(O)" && field[4] == "(O)" && field[6] == "(O)") {
			System.out.println(" ");
			System.out.println("Computer gewinnt!");
			return rundenende = true;
		} else {
			return rundenende = false;
		}
	}

	public void unentschieden(String field[]) {
		//Special case (draw instead of win for player)
		if(field[0] == "(X)" && field[4] == "(X)" && field[8] == "(X)"
		|| field[2] == "(X)" && field[4] == "(X)" && field[6] == "(X)")
		{
		System.out.println(" ");
		//To generate also the last X OR O
		for (int k = 0; k <= 8; k++) {
			if (k == 2 || k == 5) {
				System.out.println(field[k]);
			} else {
				System.out.print(field[k]);
			}
		}
		System.out.println(" ");
		System.out.println("Spieler gewinnt!");
		System.out.println(" ");
	    System.out.println("Game over.");
		}
		//If all fields filled = draw
		else if ((field[0] == "(O)" || field[0] == "(X)") && (field[1] == "(O)" || field[1] == "(X)") && (field[2] == "(O)"
				|| field[2] == "(X)") && (field[3] == "(O)" || field[3] == "(X)") && (field[4] == "(O)"
				|| field[4] == "(X)") && (field[5] == "(O)" || field[5] == "(X)") && (field[6] == "(O)"
				|| field[6] == "(X)") && (field[7] == "(O)" || field[7] == "(X)") && (field[8] == "(O)"
				|| field[8] == "(X)")) {
			System.out.println(" ");
			//To generate also the last X OR O
			for (int k = 0; k <= 8; k++) {
				if (k == 2 || k == 5) {
					System.out.println(field[k]);
				} else {
					System.out.print(field[k]);
				}
			}
			System.out.println(" ");
			System.out.println("Unentschieden!");
			System.out.println(" ");
		    System.out.println("Game over.");
			
		}

	}
}
