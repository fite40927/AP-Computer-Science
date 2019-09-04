package chapter5proj;

//5.6

interface Lockable{
	void setKey(int key);
	void lock(int key);
	void unlock(int key);
	boolean locked();
}

public class Coin implements Lockable {
	private final int HEADS = 0;
	private final int TAILS = 1;
	private int face;
	private int keyCoin;
	public boolean LOCKED;
   
	public Coin() {
		flip();
		keyCoin = 0;
		LOCKED = false;
	}
	
	public void flip() {
		if(!LOCKED)
			face = (int) (Math.random() * 2);
	}
   
	public boolean isHeads () {
		if(!LOCKED)
			return (face == HEADS);
		else {
			System.out.println("its locked boi\npossibly incorrect data will follow");
			return false;
		}
	}
   
	public String toString() {
		if(!LOCKED) {
			String faceName;
			if (face == HEADS)
				faceName = "Heads";
			else
				faceName = "Tails";
			return faceName;
		}
		return "its locked boi";
	}

	public void setKey(int key) {
		if(!LOCKED)
			keyCoin = key;
	}

	public void lock(int key) {
		if(key == keyCoin)
			LOCKED = true;
		else
			System.out.println("Wrong key");
	}

	public void unlock(int key) {
		if(key == keyCoin)
			LOCKED = false;
		else
			System.out.println("Wrong key");
	}

	public boolean locked() {
		return LOCKED;
	}
}
