import java.util.Scanner;


public class Timer extends Thread {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("\tSet Timer(in seconds):");
		int number=sc.nextInt();
		sc.close();
		try {
			for(int i=number;i>=0;i--) {     //count down starts from n to 0
			
				System.out.print("\rTime left : "+i+" ");
				Thread.sleep(1000);	
			}
			System.out.print("\rTime's up!		\n");
		}
		catch(InterruptedException e) {
			System.out.println("Exception error :" +e.getMessage());
		}
		
		
	}

}
