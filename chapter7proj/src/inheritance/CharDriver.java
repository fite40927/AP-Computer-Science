package inheritance;

public class CharDriver {

	public static void main(String[] args) {
		Character protagonist = new Character("Kim Jong Un");
		Character antagonist = new Character("Donald Trump");
		
		AtomicBomb bomb = new AtomicBomb();
		RubberBand rb = new RubberBand();
		ShaolinMonk zhitao = new ShaolinMonk("Larry", 10, 70);
		
		protagonist.pickup(bomb);
		protagonist.pickup(rb);
		protagonist.pickup(zhitao);
		
		protagonist.fight(antagonist, rb);
		
		System.out.println(protagonist.getName() + " is panicking");
		protagonist.panic(antagonist);
	}
}