package code.sam;

public class Cm_Trans_0608 {
	
	public static void main(String[] args) {
		
		double []arr = new double[6];
		
		double Cm = 1;
		double M = (double) (Cm / 0.01);
		double Inch = (double) (Cm / 0.3937007874015748);
		double Feet = (double) (Cm / 0.032808398950);
		double Yard = (double) (Cm / 0.010936132983);
		double Mile = (double) (Cm / 0.000006213712);
		
		arr[0] = Cm;
		arr[1] = M;
		arr[2] = Inch;
		arr[3] = Feet;
		arr[4] = Yard;
		arr[5] = Mile;
		
		System.out.printf("            Cm    " + "             M    " + "                  Inch      " + "      Feet     " + "       Yard      "+ "    Mile    ");
		
		System.out.println();

		System.out.println("Cm         " + arr[0]*arr[0] +"            "+ arr[0]/arr[1] + "              "+ arr[0]/arr[2]+"  "+ 
		arr[0]/arr[3]+"  "+ arr[0]/arr[4]+"  "+ arr[0]/arr[5]);
		
		System.out.println("M          " + arr[1]*arr[0] +"           "+ arr[1]/arr[1] + "              "+ arr[1]/arr[2]+"  "+ 
				arr[1]/arr[3]+"  "+ arr[1]/arr[4]				+"  "+ arr[1]/arr[5]);
		
		System.out.println("Inch       " + arr[2]*arr[0] +"            "+ arr[2]/arr[1] + "                    "+ 
				arr[2]/arr[2]+"          "+ arr[2]/arr[3]+"  "+ arr[2]/arr[4]+"  "+ arr[2]/arr[5]);
		
		System.out.println("Feet  " + arr[3]*arr[0] +"  "+ arr[3]/arr[1] + "  "+ arr[3]/arr[2]+"          "+ arr[3]/arr[3]
				+"        "+ arr[3]/arr[4]+"  "+ arr[3]/arr[5]);
		
		
		System.out.println("Yard  " + arr[4]*arr[0] +"  "+ arr[4]/arr[1] + "  "+ arr[4]/arr[2]+"  "+ arr[4]/arr[3]+"  "+ arr[4]/arr[4]
				+"              "+ arr[4]/arr[5]);
		
		System.out.println("Mile  " + arr[5]*arr[0] +"  "+ arr[5]/arr[1] + "  "+ arr[5]/arr[2]+"  "+ arr[5]/arr[3]+"  "+ arr[5]/arr[4]
				+"  "+ arr[5]/arr[5]);
	}
}
