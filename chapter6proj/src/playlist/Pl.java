package playlist;

public interface Pl {
	public void addSong(Song addThis);
	public Song removeSong(Song removeThis);
	public Song next();
	public Song getRandom();
	public String toString();
}

interface Sg {
	public String getTitle();
	public String getArtist();
	public String getGenre();
	public String toString();
}