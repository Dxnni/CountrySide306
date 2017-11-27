public class smashChar{

	private String name;
	private int wins, losses, kills, deaths, plays;

	public smashChar(String name){

		this.name = name;
		wins = 0;
		losses = 0;
		kills = 0;
		deaths = 0;
		plays = 0;
		
	}
	
	public String getName(){
		
		return name;

	}
	
	public void addWins(){

		++wins;
		++plays;
	
	}

	public int getWins(){
	
		return wins;
	
	}

	public void addLosses(){
	
		++losses;
		++plays;
	
	}

	public int getLosses(){
	
		return losses;
	
	}

	public void addKills(){
		
		kills++;
	
	}

	public int getKills(){
	
		return kills;
	
	}	

	public void addDeaths(){
		
		deaths++;
	
	}

	public int getDeaths(){
		
		return deaths;

	}

	public int getPlays(){

		return plays;

	}

	public double KDratio(){
	
		return ((double)(kills))/((double)(deaths));
	
	}

	public double Wpercent(){
	
		return ((double)(wins))/((double)(plays))*100;
	
	}

	public void reset(){
	
		wins = 0;
		losses = 0;
		kills = 0;
		deaths = 0;
		plays = 0;

	}

}