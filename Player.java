import java.util.ArrayList;

public class Player {
	private String name; 
	private int chips; 
	private int bet; 
	private int total_value;
	boolean ace = false;
	private ArrayList<Card> oneRoundCard; 
	
	public Player(String name, int chips) {
		this.name=name;
		this.chips=chips;
		oneRoundCard=new ArrayList<Card>();
	}
	
	public String get_name() {
	return name; 
	}
	public int make_bet() {
		
	return bet;
}	
	public void setOneRoundCard(ArrayList<Card> cards) {
		for(Card c:cards){
	oneRoundCard.add(c); 
	}
	
	}
	public boolean hit_me() {
		if (getTotalValue()<=17){
		return true;}
		else
		return false;
	}
	public int getTotalValue() {
		for(Card c:oneRoundCard){
		int rankc=c.getRank();
		
		if (rankc==11||rankc==12||rankc==13){
			rankc=10;
		}
		else if(rankc==1){
			 ace=true;
			}
		total_value=total_value+rankc;
		}
		
	return total_value ;
	}
	public int get_current_chips() {
		return chips;
	}
	public void increase_chips (int diff) {
		chips= chips+diff;
	}
	public void say_hello() {
	System.out.println("Hello, I am " + name + "."); 
	System.out.println("I have " + chips + " chips."); 
	}

}
