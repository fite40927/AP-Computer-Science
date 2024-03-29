package chapter8proj;

public class Proj803 {
	private final static int TRIED = 3;
	private final static int PATH = 7;

	private static int[][] grid = { {1,1,1,0,1,1,0,0,0,1,1,1,1},
							 {1,0,1,1,1,0,1,1,1,1,0,0,1},
							 {0,0,0,0,1,0,1,0,1,0,1,0,0},
							 {1,1,1,0,1,1,1,0,1,0,1,1,1},
							 {1,0,1,0,0,0,0,1,1,1,0,0,1},
							 {1,0,1,1,1,1,1,1,0,1,1,1,1},
							 {1,0,0,0,0,0,0,0,0,0,0,0,0},
							 {1,1,1,1,1,1,1,1,1,1,1,1,1} };

	   //-----------------------------------------------------------------
	   //  Tries to recursively follow the maze. Inserts special
	   //  characters for locations that have been tried and that
	   //  eventually become part of the solution.
	   //-----------------------------------------------------------------
	public static boolean traverse (int row, int column){
		boolean done = false;

		if (valid (row, column)){
			grid[row][column] = TRIED; // this cell has been tried

			if (row == grid.length-1 && column == grid[0].length-1)
				done = true; // the maze is solved
			else{
				done = traverse (row+1, column);     // down
				if (!done)
					done = traverse (row, column+1);  // right
				if (!done)
					done = traverse (row-1, column);  // up
				if (!done)
					done = traverse (row, column-1);  // left
			}

			if (done) {  // this location is part of the final path
				grid[row][column] = PATH;
				System.out.println("[" + row +  ", " + column + "]");
			}

		}

		return done;
	}

	   //-----------------------------------------------------------------
	   //  Determines if a specific location is valid.
	 //-----------------------------------------------------------------
	private static boolean valid (int row, int column)
	{
		boolean result = false;

	      //  check if cell is in the bounds of the matrix
		if (row >= 0 && row < grid.length &&
			column >= 0 && column < grid[row].length)

	  //  check if cell is not blocked and not previously tried
		if (grid[row][column] == 1)
			result = true;

		return result;
	}

	   //-----------------------------------------------------------------
	   //  Returns the maze as a string.
	   //-----------------------------------------------------------------
	public String toString (){
	String result = "\n";

	for (int row=0; row < grid.length; row++){
		for (int column=0; column < grid[row].length; column++)
			result += grid[row][column] + "";
			result += "\n";
		}

		return result;
	}
	
	public static void main(String[] args) {
		traverse(0,0);
	}
}
