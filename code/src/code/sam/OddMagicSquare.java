package code.sam;

public class OddMagicSquare {
	protected int[][] magic;
	protected int top;
	
	public OddMagicSquare() {
		this(3);
	}
	
	public OddMagicSquare(int n) {
		this.init(n);
		
	}
	public void init(int n) {
		this.magic = new int[n][n];
		this.top = n-1;
	}
	
	public void make() {
		int x = 0;
		int y = top/2;
		magic [x][y] = 1;
		
		for (int i = 2; i<=(top +1)*(top+1); i++) {
			int tempX = x;
			int tempY = y;
			
		if(x-1<0) {
			x = top;
			
		}else {
			x--;
		}
		if(y-1<0) {
			y = top;
		}else {
			y--;
		}
		if(magic[x][y]!=0) {
			x = tempX+1;
			y = tempY;
		
		}
		magic[x][y] = i;
		}
	}

	public int[][] getMagic() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
