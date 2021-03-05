package Bomberman;

public class Walls {
	char type;
	int x,y;
  Walls(char type,int x,int y){
	  this.type=type;
	  this.x=x;
	  this.y=y;
	  addWalls();
  }
  public void addWalls(){
	  if(Main.matrix[this.x][this.y]=='*')
	  Main.matrix[this.x][this.y]=this.type;
	  else
		  System.out.println("ALREADY OCCUPIED");
  }
@Override
public String toString() {
	return "Walls [type=" + type + ", x=" + x + ", y=" + y + "]";
}
public char getType() {
	return type;
}
public void setType(char type) {
	this.type = type;
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
