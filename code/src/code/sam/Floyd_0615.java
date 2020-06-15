package code.sam;

public class Floyd_0615 {

	int W = 99999;					//w가 엄청 큰 수라고 가정
	int w [][] = {{0,2,3,W,7},			//가중치 
				  {5,0,W,W,4},
				  {2,W,0,6,W},
				  {W,W,3,0,4},
				  {6,1,7,2,0}};
	//	int D [][] = W;					//가중치의 합이 가장 적은 것을 대입할 것
	public void printmatrix() {					//그래프 w를 행렬에 저장
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
			if(w[i][j] == W) {
				System.out.printf("   W"); continue;
				}
			System.out.printf("%4d", w[i][j]);
		}
		System.out.println();
		}
	}
		  
		 public void floydalgorithm() {				//플로이드 알고리즘 대입
		        for(int k=0; k<5; k++)
		        {
		            for(int i=0; i<5; i++)
		            {
		                for(int j=0; j<5; j++)
		                {
		                    if(w[i][j]>w[i][k]+w[k][j])				//경로를 비교하여 가중치의 합이 가장 적은 값을 대입
		                        w[i][j] = w[i][k]+w[k][j];
		                }
		            }
		            System.out.println(k);
		            printmatrix();
		        }
		    }
		    public static void main(String[] args) {
		        Floyd_0615 f = new Floyd_0615();
		        f.floydalgorithm();
		    }
		 
		}
		 


