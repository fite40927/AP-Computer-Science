package playlist;

public class Song implements Sg {
	public String title, artist, genre;
	public Song(String t, String a, String g) {
		title = t;
		artist = a;
		genre = g;
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getGenre() {
		return genre;
	}
	public String toString() {
		return title + "\t" + artist + "\t" + genre;
	}
}
