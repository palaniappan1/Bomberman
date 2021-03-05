package Bomberman;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	static char matrix[][]=new char[6][6];
	static ArrayList<Player> player=new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++)
				matrix[i][j]='*';
		}
		while(true){
			System.out.print("1.Player\n2.Walls\n3.Move\n4.Bomb");
			int choice=sc.nextInt();
			switch(choice){
			case 1:
			   char name=sc.next().charAt(0);
			   char direction=sc.next().charAt(0);
			   int x=sc.nextInt();
			   int y=sc.nextInt();
			   Player p=new Player(name,direction,x,y);
			   player.add(p);
			   System.out.println(player);
			   display();
			   break;
			case 2:
				char type=sc.next().charAt(0);
				int wallx=sc.nextInt();
				int wally=sc.nextInt();
				Bomberman.Walls w=new Bomberman.Walls(type,wallx,wally);
				display();
				break;
			case 3:
				char playername=sc.next().charAt(0);
				for(int i=0;i<player.size();i++){
					p=player.get(i);
					if(p.name==playername){
						int steps=sc.nextInt();
						char type1=sc.next().charAt(0);
						if(type1=='D'){
						if(p.direction=='N')
							Player.moveNorth(p,steps);
						else if(p.direction=='S')
							Player.moveSouth(p,steps);
						else if(p.direction=='W')
							Player.moveWest(p,steps);
						else if(p.direction=='E')
							Player.moveEast(p,steps);
						}
						else if(type1=='L')
						{
							if(p.direction=='N'){
							    p.setDirection('W');
							    Player.moveWest(p, steps);
							}
							else if(p.direction=='S'){
								p.setDirection('E');
								Player.moveEast(p, steps);
							}
							else if(p.direction=='W'){
								p.setDirection('S');
								Player.moveSouth(p, steps);
							}
							else if(p.direction=='E'){
								p.setDirection('N');
								Player.moveNorth(p, steps);
							}
						}
						else if(type1=='R'){
							if(p.direction=='N'){
							    p.setDirection('E');
							    Player.moveEast(p, steps);
							}
							else if(p.direction=='S'){
								p.setDirection('W');
								Player.moveWest(p, steps);
							}
							else if(p.direction=='W'){
								p.setDirection('N');
								Player.moveNorth(p, steps);
							}
							else if(p.direction=='E'){
								p.setDirection('S');
								Player.moveSouth(p, steps);
							}
							
						}
					}
				}
				break;
			case 4:
				int radius=sc.nextInt();
				int bombx=sc.nextInt();
				int bomby=sc.nextInt();
				Bomb b=new Bomb();
				b.burst(radius,bombx,bomby);
				break;
			case 5:
			     break;
			}
		}
	}
	public static void display(){
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				System.out.print(matrix[i][j]+" ");
			}
		System.out.println();
		}
	}

}
