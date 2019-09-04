package chapter6proj;

//607

public class Grade {
	public String letter;
	public double cutoff;
	public Grade(String grade, double percent) {
		letter = grade;
		cutoff = percent;
	}
	public String getLetter() {
		return letter;
	}
	public double getCutoff() {
		return cutoff;
	}
}
