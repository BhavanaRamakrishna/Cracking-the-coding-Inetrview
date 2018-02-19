import java.util.Scanner;
enum Color {Black, White, Yellow, red, Green}
public class PaintFill{
	public static boolean paintFill(Color[][] screen,int r, int c, Color oldColor, Color newColor){
		if( r<0 || r>screen.length || c<0 || c>screen.length)
			return false;
		else{
			if(screen[r][c] == oldColor){
				screen[r][c] == newColor;
				paintFill(screen, r-1, c, oldColor, newColor);
				paintFill(screen, r-1, c, oldColor, newColor);
				paintFill(screen, r, c-1, oldColor, newColor);
				paintFill(screen, r, c+1, oldColor, newColor);
			}
			return true;
		}


	}

	 public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Color[][] screen = new Color[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				Color[i][j] = in.next();
			}
		}
		int r = in.nextInt();
		int c = in.nextInt();
		Color newColor = in.nextLine();
		if(Color[r][c] == newColor)
			System.out.println("False");
		else
			System.out.println(paintFill(screen, r, c, color[r][c], newColor));

	 }
}
