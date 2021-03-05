package Bomberman;

public class Player {
	char name,direction;
	int x,y;
	Player(char name,char direction,int x,int y){
		this.name=name;
		this.direction=direction;
		this.x=x;
		this.y=y;
		addPosition();
	}
	public void addPosition(){
		if(Bomberman.Main.matrix[this.x][this.y]=='*')
		Bomberman.Main.matrix[this.x][this.y]=this.name;
		else
			System.out.println("ALREADY OCCUPIED");
	}
	public static void moveNorth(Player p,int steps){
		int steps1=steps;
		boolean flag=false;
			for(int i=p.x-1;i>=0&& steps>0;i--,steps--){
				if(Bomberman.Main.matrix[i][p.y]=='*')
					flag=true;
				else{
					flag=false;
					break;
				}
		    }
			if(flag){
				Bomberman.Main.matrix[p.x-steps1][p.y]=p.name;
				Bomberman.Main.matrix[p.x][p.y]='*';
				p.setX(p.x-steps1);
				Bomberman.Main.display();
			}
		}
	public static void moveEast(Player p,int steps){
		int steps1=steps;
		boolean flag=false;
			for(int i=p.y-1;i>=0&& steps>0;i--,steps--){
				if(Bomberman.Main.matrix[p.x][i]=='*')
					flag=true;
				else{
					flag=false;
					break;
				}
		    }
			if(flag){
				Bomberman.Main.matrix[p.x][p.y-steps1]=p.name;
				Bomberman.Main.matrix[p.x][p.y]='*';
				p.setX(p.y-steps1);
				Bomberman.Main.display();
			}
		}
	public static void moveWest(Player p,int steps){
		int steps1=steps;
		boolean flag=false;
			for(int i=p.y+1;i<6&& steps>0;i++,steps--){
				if(Bomberman.Main.matrix[p.x][i]=='*')
					flag=true;
				else{
					flag=false;
					break;
				}
		    }
			if(flag){
				Bomberman.Main.matrix[p.x][p.y+steps1]=p.name;
				Bomberman.Main.matrix[p.x][p.y]='*';
				p.setX(p.y+steps1);
				Bomberman.Main.display();
			}
		}
	
	public static void moveSouth(Player p,int steps){
		int steps1=steps;
		boolean flag=false;
			for(int i=p.x+1;i<6&& steps>0;i++,steps--){
				if(Bomberman.Main.matrix[i][p.y]=='*')
					flag=true;
				else{
					flag=false;
					break;
				}
		    }
			if(flag){
				Bomberman.Main.matrix[p.x+steps1][p.y]=p.name;
				Bomberman.Main.matrix[p.x][p.y]='*';
				p.setX(p.x+steps1);
				Bomberman.Main.display();
			}
		}
	@Override
	public String toString() {
		return "Player [name=" + name + ", direction=" + direction + ", x=" + x
				+ ", y=" + y + "]";
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public char getDirection() {
		return direction;
	}
	public void setDirection(char direction) {
		this.direction = direction;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}
