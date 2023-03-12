import java.util.Scanner;
public class Township{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double T=0,N=0,H=0,S=0,R=0,T_B=0; 
		int i ,j ,k;
		System.out.println("Enter How Many Township Are There .. : " );
		T = sc.nextDouble();
		for (i=1;i<=T;i++){
			System.out.println("Enter Details For Township"+ i + " :");
			System.out.println("How Many Houses are there ?");
			N = sc.nextDouble();
				double whall=1 , wbed=1 ,totalwalls=0 , sum = 0;
				double totalhours=0 , qtny_accent=1 , qtny_reg=1;
				
			for( j=1;j<=N;j++){
				System.out.println("Enter Details For House "+ j + " :");
				System.out.println("Total BedRooms : ");
				T_B = sc.nextDouble();
				System.out.println("How many Victorian Type Halls :");
				H = sc.nextDouble();
				System.out.println("How many Stamdard Rooms :");
				S = sc.nextDouble();
				System.out.println("How many Roof BedRooms:");
				R = sc.nextDouble();

				whall = H*6;
				wbed = S*4 + R*3;
				totalwalls = whall + wbed;
				sum = sum + totalwalls;

				double accent = sum/3.0;
				double reg = sum - accent ; 

				totalhours = accent * 2.5 + reg * 3.25;
				qtny_accent = accent * 1.5 ;
				qtny_reg = reg *2.25;
			}
			System.out.println("Case"+i+", "+totalhours+", "+qtny_accent+", "+qtny_reg);
		}	
	}
}