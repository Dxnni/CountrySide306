import java.util.*;

public class smashPlayer{
	
	private String name;
	private ArrayList<smashChar> chars;
	private int numOfPlyrs = 0;


	public smashPlayer(){
		
		numOfPlyrs++;
		name = "Player " + numOfPlyrs;
		chars = new ArrayList<smashChar>();

	}

	public smashPlayer(String name){

		numOfPlyrs++;
		this.name = name;
		chars = new ArrayList<smashChar>();

	}

	public void addChar(String character){
				
		chars.add(new smashChar(character));

	}

	public void charStats(){

		System.out.println();

		for(int i=0; i < chars.size(); i++ ){

			System.out.println((i+1) + ". " + chars.get(i).getName());

		}

		System.out.println("Choose which character(1-" + chars.size() + "): ");
		Scanner input = new Scanner(System.in);

		int selection = input.nextInt();

		if(chars.get(selection-1).getPlays() != 0){

			System.out.println("\n" + chars.get(selection-1).getName() + "'s Stats");
			System.out.println("Wins: " + chars.get(selection-1).getWins());
			System.out.println("Losses: " + chars.get(selection-1).getLosses());
			System.out.println("Win %: " + chars.get(selection-1).Wpercent() + " %");
			System.out.println("Kills: " + chars.get(selection-1).getKills());
			System.out.println("Deaths: " + chars.get(selection-1).getDeaths());
			if(chars.get(selection-1).getDeaths() == 0){
				System.out.println("KD Ratio: " + chars.get(selection-1).getKills());
			}
			else{
				System.out.println("KD Ratio: " + chars.get(selection-1).KDratio());
			}
		}
		else{
			System.out.println("No games played yet.");
		}

	}

	public void getStats(){

		int wins=0, losses=0, kills=0, deaths=0, plays=0;
		for(int i = 0; i < chars.size(); i++){

			wins += chars.get(i).getWins();
			losses += chars.get(i).getLosses();
			kills += chars.get(i).getKills();
			deaths += chars.get(i).getDeaths();
			plays += chars.get(i).getPlays();

		}

		if(plays != 0){

			System.out.println("\n" + name + "'s Stats");
			System.out.println("Wins: " + wins);
			System.out.println("Losses: " + losses);
			System.out.println("Win %: " + ((double)(wins))/((double)(plays))*100 + " %");
			System.out.println("Kills: " + kills);
			System.out.println("Deaths: " + deaths);
			if(deaths == 0){
				System.out.println("KD Ratio: " + kills);
			}
			else{
				System.out.println("KD Ratio: " + ((double)(kills))/((double)(deaths)));
			}

		}
		else{

			System.out.println("No games played yet.");

		}

	}

	public void newGame(){

		System.out.println();

		for(int i=0; i < chars.size(); i++ ){

			System.out.println((i+1) + ". " + chars.get(i).getName());

		}

		System.out.println((chars.size()+1) + ". Add new character");

		System.out.println("Choose which character(1-" + (chars.size()+1) + "): ");
		Scanner input = new Scanner(System.in);

		int selection = input.nextInt();

		if(selection == chars.size()+1){

			System.out.println("Name of character?: ");
			addChar(input.next());

		}
		
		System.out.println("\n1. Win \n2. Loss");
		int win_loss = input.nextInt();
		if(win_loss == 1){
			chars.get(selection-1).addWins();
		}
		else if(win_loss == 2){
			chars.get(selection-1).addLosses();
		}

		System.out.println("\nPress 1 and Enter for every kill(any other # to stop): ");
		int button = 1;
		while(button == 1){

			button = input.nextInt();
			if(button == 1){
				chars.get(selection-1).addKills();
			}
		}

		System.out.println("\nPress 1 and Enter for every death(any other # to stop): ");
		button = 1;
		while(button == 1){

			button = input.nextInt();
			if(button == 1){
				chars.get(selection-1).addDeaths();
			}
		}

	}







	/*Methods:
	list characters with wins
	add char
	list chars (with kills)
	1 players full stats (Total: wins, losses, ratio%, kills, deaths, ratio%, eachChar: wins, losses, ratio%, kills, deaths, ratio%)
	Everyones stats (1 player full stats x numOfPlyrs)
	*/


}