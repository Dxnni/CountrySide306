import java.util.*;


//testing to now see if Nate can push to repo

public class testSmash{
	
	public static void main(String args[]){

		ArrayList<smashPlayer> players = new ArrayList<smashPlayer>();

		int selection = 0;
		while(selection!=8){
			System.out.println(
			"\nMain Menu: "
				+"\n1. Enter Stats"
				+"\n2. Add Player"
				+"\n3. Add Character" 
				+"\n4. Player Stats"
				+"\n5. Character Stats"
				+"\n6. All Players Stats"
				+"\n7. All Characters Stats for a Player"
				+"\n8. Exit");
	
			Scanner input = new Scanner(System.in);
		
			switch(input.nextInt()){
	
				case 1: {
	
					System.out.println("\nWhich Player? ");
					for(int i=0; i<players.size(); i++){
	
						System.out.println((i+1) + ". " + players.get(i).getName());
	
					}
	
					players.get(input.nextInt()-1).newGame();
					break;
	
				}
	
				case 2:	{
	
					System.out.println("\nEnter Player's Name: ");
					players.add(new smashPlayer(input.next()));
					break;
	
				}
	
				case 3:	{
	
					System.out.println("\nWhich Player? ");
					for(int i=0; i<players.size(); i++){
	
						System.out.println((i+1) + ". " + players.get(i).getName());
	
					}
					int choice = input.nextInt()-1;

					System.out.println("\nName of new character: ");
					
					players.get(choice).addChar(input.next());
					break;
	
				}
	
				case 4:	{
	
					System.out.println("\nWhich Player? ");
					for(int i=0; i<players.size(); i++){
	
						System.out.println((i+1) + ". " + players.get(i).getName());
	
					}

					players.get(input.nextInt()-1).getStats();	
					break;
				
				}
	
				case 5:	{
	
					System.out.println("\nWhich Player? ");
					for(int i=0; i<players.size(); i++){
	
						System.out.println((i+1) + ". " + players.get(i).getName());
	
					}

					players.get(input.nextInt()-1).charStats();	
					break;
				
				}
	
				case 6:	{
	
					//listStats(players);
					break;
				}

				case 7:	{

					System.out.println("\nWhich Player? ");
					for(int i=0; i<players.size(); i++){
	
						System.out.println((i+1) + ". " + players.get(i).getName());
	
					}

					players.get(input.nextInt()-1).listStats();	
					break;
				}

				case 8:	{

					System.out.println("Good Games.");
					System.exit(0);
				}
	
				default: {

					System.out.println("\nInvalid Input. Try Again ");
					//selection = input.nextInt();
					break;

				}
			} 
		}	

		System.out.println("Good Games.");
	}

	/*
	pretty tough to do. Not done.
	Potentially need getter methods for each stat for each smashPlayer.
	public void listStats(ArrayList<smashPlayer> players){

		System.out.println();

		for(int i=0; i < players.size(); i++ ){


			System.out.println("\n" + (i+1) + ". " + players.get(i).getName() + "'s Stats");

			if(players.get(i).getPlays() != 0){

				System.out.println("Wins: " + players.get(i).getWins());
				//System.out.println("Losses: " + players.get(i).getLosses());
				System.out.println("Win %: " + players.get(i).Wpercent() + " %");
				System.out.println("Kills: " + players.get(i).getKills());
				//System.out.println("Deaths: " + players.get(i).getDeaths());

				if(chars.get(i).getDeaths() == 0){
					System.out.println("KD Ratio: " + players.get(i).getKills());
				}
				else{
					System.out.println("KD Ratio: " + players.get(i).KDratio());
				}
			}
			else{
				System.out.println("No games played yet.");
			}
		}

	}
	*/
}	