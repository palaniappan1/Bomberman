
package Bomberman;

public class Bomb {
public void burst(int radius,int bombx,int bomby){
	for(int i=bombx;i>=0 && radius>0;i--,radius--){
		if(Bomberman.Main.matrix[i][bomby]!='N'){
			Bomberman.Main.matrix[i][bomby]='*';
		}
		else break;
	}
	for(int i=bombx;i<6 && radius>0;i++,radius--){
		if(Bomberman.Main.matrix[i][bomby]!='N'){
			Bomberman.Main.matrix[i][bomby]='*';
		}
		else
			break;
	}
	for(int i=bomby;i>=0 && radius>0;i--,radius--){
		if(Bomberman.Main.matrix[bombx][i]!='N'){
			Bomberman.Main.matrix[bombx][i]='*';
		}
		else 
			break;
	}
	for(int i=bomby;i<6 && radius>0;i++,radius--){
		if(Bomberman.Main.matrix[bombx][i]!='N'){
			Bomberman.Main.matrix[bombx][i]='*';
		}
		else
			break;
	}
	Bomberman.Main.display();
}
}
