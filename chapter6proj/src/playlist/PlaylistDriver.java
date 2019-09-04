package playlist;

public class PlaylistDriver {
	public static void main(String[] args) {
		Song one = new Song("Bacardi", "Mark Johns", "Pop");
		Song two = new Song("Immigrant Song", "Led Zeppelin", "Rock");
		Song three = new Song("Feel It Still", "Portugal. The Man", "Indie");
		Song four = new Song("Sure Shot", "Beastie Boys", "Hip Hop");
		Song five = new Song("Walls Could Talk", "Halsey", "Pop");
		Song six = new Song("Ohio", "Hyukoh", "Indie");
		Song diarrhea = new Song("Mei you li you", "By2", "Cpop");
		
		Playlist Apsara = new Playlist();
		Apsara.addSong(one);Apsara.addSong(two);Apsara.addSong(three);
		Apsara.addSong(four);Apsara.addSong(five);Apsara.addSong(six);
		Apsara.addSong(diarrhea);
		
		System.out.println(Apsara.toString() + "\n");
		
		Apsara.removeSong(diarrhea);
		
		System.out.println("Song removed.\n");
		
		System.out.println(Apsara.toString() + "\n");
		
		System.out.println("\nShuffling...\n");
		Apsara.getRandom();
		

		for(int i = 0; i < 10; i++)
		System.out.println("Playing:\t" + Apsara.next().toString());
	}
}