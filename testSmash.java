public class testSmash{
	
	public static void main(String args[]){

		smashPlayer Nathan = new smashPlayer();
		smashPlayer Daniel = new smashPlayer();

		Nathan.addChar("Ness");
		Daniel.addChar("Link");
		Nathan.addChar("Megaman");
		Daniel.addChar("Lucina");

		Nathan.newGame();

		Nathan.charStats();
		
		Nathan.newGame();

		Nathan.charStats();

		Nathan.getStats();

	}
}