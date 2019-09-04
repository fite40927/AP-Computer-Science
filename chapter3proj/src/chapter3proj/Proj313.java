package chapter3proj;

import java.util.*;

public class Proj313 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int a=0, e=0, i=0, o=0, u=0, conso=0, space=0, punc=0, num=0;
		
		for(int b = 0; b < input.length(); b++) {
			if(Character.isLetter(input.charAt(b))) {
				if(input.charAt(b) == 'a')
					a++;
				else if(input.charAt(b) == 'e')
					e++;
				else if(input.charAt(b) == 'i')
					i++;
				else if(input.charAt(b) == 'o')
					o++;
				else if(input.charAt(b) == 'u')
					u++;
				else
					conso++;
			}
			else {
				if(input.charAt(b) == ' ')
					space++;
				else if(Character.isDigit(input.charAt(b)))
					num++;
				else
					punc++;
			}
			
		}
		
		System.out.println("a: " + a);
		System.out.println("e: " + e);
		System.out.println("i: " + i);
		System.out.println("o: " + o);
		System.out.println("u: " + u);
		System.out.println("Consonants: " + conso);
		System.out.println("Numbers: " + num);
		System.out.println("Spaces: " + space);
		System.out.println("Punctuation: " + punc);
	}
}
