package playlist;

import java.util.ArrayList;

public class Playlist implements Pl {
	public ArrayList<Song> list = new ArrayList<Song>();
	public ArrayList<Song> shuffledList = new ArrayList<Song>();
	public ArrayList<Song> currentPlaylist = new ArrayList<Song>();
	public int index;
	public Playlist() {
		currentPlaylist = list;
		index = 0;
	}
	public String toString() {
		String f = "";
		for(int i = 0; i < currentPlaylist.size(); i++) {
			f = f.concat(currentPlaylist.get(i).toString() + "\n");
		}
		
		return f;
	}
	public void addSong(Song x) {
		list.add(x);
		shuffledList.add(x);
	}
	public Song removeSong(Song x) {
		int a = 0;
		for(int i = a; i < list.size(); i++) {
			if(list.get(i).toString().equals(x.toString())) {
				list.remove(i);
				i = list.size();
			}
		}
		return list.get(a);
	}
	public Song next() {
		index++;
		if(index >= currentPlaylist.size()) {
			index = 0;
		}
		return currentPlaylist.get(index);
	}
	public Song getRandom() {
		currentPlaylist = shuffledList;
		for(int g = 0; g<200; g++)
		for(int i = 0; i < currentPlaylist.size(); i++) {
			int a = (int)( Math.random()*list.size());
			Song x = currentPlaylist.get(i);
			Song y = currentPlaylist.get(a);
			Song switch1 = new Song(x.getTitle(), x.getArtist(), x.getGenre());
			Song switch2 = new Song(y.getTitle(), y.getArtist(), y.getGenre());
			currentPlaylist.set(i, switch2);
			currentPlaylist.set(a, switch1);
		}
		return currentPlaylist.get(0);
	}
	public int size() {
		return list.size();
	}
	public Song songAt(int in) {
		if(in >= currentPlaylist.size()) in = currentPlaylist.size()-1;
		return currentPlaylist.get(in);
	}
}