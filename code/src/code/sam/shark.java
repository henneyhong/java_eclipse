package code.sam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class shark {
	static final int INF = 987654321;
	static int N;
	static int Map[] [] = new int [20][20];
	static int Dr[] = {-1,1,0,0};
	static int Dc[] = {0,0,-1,1};
	
	static class Point{
		int r, c, d;
		Point (int r, int c, int d){
			this.r = r;
			this.c = c;
			this.d = d;
		}
	}
	
	static int solve(int r, int c) {
		int ret = 0;
		int size =2, cnt=2;
		Point minPt = new Point(r,c,0);
		
		do {
			boolean visited[][] = new boolean[20][20];
			Queue<Point> myqueue = new LinkedList<Point>();
			visited[minPt.r][minPt.c]= true;
			myqueue.add(new Point(minPt.r, minPt.c,0));
			minPt.d = INF;
			
			while(myqueue.peek() !=null) {
				Point curr = myqueue.poll();
				
				
				if(curr.d > minPt.d)break; 
				if(Map[curr.r][curr.c]> size)continue;
				if(Map[curr.r][curr.c]!= 0 && Map[curr.r][curr.c]<size ) {
					if(curr.d <minPt.d) {
						minPt = curr;
					} else if ( curr.d == minPt.d) {
						if(curr.r < minPt.r)
							minPt = curr;
						else if (curr.r == minPt.r && curr.c < minPt.c)
							minPt = curr;
					}
					continue;
				}
			
				for (int i=0;i<4;++i) {
					int nr = curr.r +Dr[i],nc = curr.c+Dc[i];
					if (nr < 0 || nr > N-1 || nc < 0 || nc> N-1) continue;
					if(visited[nr][nc]) continue;
					visited[nr][nc] = true;
					myqueue.add(new Point(nr,nc, curr.d+1));
				}
			}
			
			if(minPt.d != INF) {
				ret +=minPt.d;
				--cnt;
				if ( cnt==0) {
					++size;
					cnt = size;
				}
				Map[minPt.r][minPt.c]= 0; 
			}
			
		} while(minPt.d != INF);
	
			return ret;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int srow = 0, scol=0;
		for (int i=0; i<N; ++i) {
			for (int j=0; j<N; ++j) {
				Map[i][j] = sc.nextInt();
				if(Map[i][j] == 9) {
					srow = i;
					scol = j;
					Map[i][j] = 0;
				}
				
			}
		}
	
	
		System.out.println(solve(srow,scol));
	}
}
