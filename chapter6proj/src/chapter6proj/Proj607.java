package chapter6proj;

public class Proj607 {
	public static void main(String[] args) {
		Grade[] grades = {new Grade("A", 89.5), new Grade("B", 79.5), new Grade("C", 69.5), new Grade("D", 59.5), new Grade("F", 0.0)};
		for(int i = 0; i < grades.length; i++) {
			System.out.println(grades[i].getLetter() + "\t" + grades[i].getCutoff() + "%");
		}
	}
}
