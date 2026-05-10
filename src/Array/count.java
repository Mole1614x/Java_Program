package Array;

public class count {
	public static void countt(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		 System.out.println("Number of digits: " + count);
	}
	public static void main(String[] args) {
		int num = 1234;
		countt(num);
		
	}
}

