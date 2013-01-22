package test;

public class Play {
	private Bao b;
	private Object play;
	
	public Play() {

		System.out.println("let's DANCE! whogogigigi bogiei");
	}
	
	public void setBao(Bao b){
		this.b=b;
		play = this;
	}
	
	public boolean unplay() {

		System.out.println("Bao");
		return false;

	}

}
