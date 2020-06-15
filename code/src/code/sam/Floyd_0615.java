package code.sam;

public class Floyd_0615 {

	int W = 99999;					//w�� ��û ū ����� ����
	int w [][] = {{0,2,3,W,7},			//����ġ 
				  {5,0,W,W,4},
				  {2,W,0,6,W},
				  {W,W,3,0,4},
				  {6,1,7,2,0}};
	//	int D [][] = W;					//����ġ�� ���� ���� ���� ���� ������ ��
	public void printmatrix() {					//�׷��� w�� ��Ŀ� ����
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
		  
		 public void floydalgorithm() {				//�÷��̵� �˰��� ����
		        for(int k=0; k<5; k++)
		        {
		            for(int i=0; i<5; i++)
		            {
		                for(int j=0; j<5; j++)
		                {
		                    if(w[i][j]>w[i][k]+w[k][j])				//��θ� ���Ͽ� ����ġ�� ���� ���� ���� ���� ����
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
		 


