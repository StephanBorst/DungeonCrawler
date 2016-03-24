package World;

import Square.Square;

public class GameWorld {
	private Square[][] world;
	
	public Square getSquare(int x, int y){
		return world[x][y];
	}
		
	public GameWorld(int x, int y){ 	
	
	}
}
