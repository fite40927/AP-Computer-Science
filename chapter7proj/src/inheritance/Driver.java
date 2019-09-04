package inheritance;

import java.util.*;

public class Driver {
	public static String wielder;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Wielder name:\t");
		wielder = scan.next(); System.out.println();
		
		AtomicBomb fatboy = new AtomicBomb();
		RubberBand staples = new RubberBand();
		ShaolinMonk shifu = new ShaolinMonk("Wuxing", 8, 70);
		Spoon spoon = new Spoon("Spoon", 9001, 4);
		ThorsHammer mjolnir = new ThorsHammer("Mjolnir", 9, 10000);
		
		//		
		
		fatboy.changeChargeCap(1);
		
		if(fatboy.fire()) System.out.println(fatboy.toString() + "\thas fired");
		
		if(fatboy.fire()) System.out.println("Error");
		else System.out.println("Please reload\t\t" + fatboy.toString());
		if(fatboy.reload()) System.out.println(fatboy.toString() + "\thas reloaded");
		
		if(fatboy.fire()) System.out.println(fatboy.toString() + "\thas fired");
		
		//
		System.out.println();
		//
		
		if(mjolnir.fire()) System.out.println(mjolnir.toString() + "\thas fired");
		else System.out.println("You are not worthy of wielding Mjolnir.");
		
		//
		System.out.println();
		//
		
		double count = 0.0;
		double trials = 10.0;
		for(int i = 0; i < trials; i++) {
		if(staples.fire()) { System.out.println(staples.toString() + "\thas hit its mark"); count++;}
		else System.out.println(staples.toString() + "\thas missed");}
		
		System.out.println(staples.toString() + "\thit its mark " + ((count/trials)*100) + "% of the time");
		
		//
	}
}