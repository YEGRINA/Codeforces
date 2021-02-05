import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, x, y, u, d, r, l, check;
		String s;
		char[] c = new char[100000];
		
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			check = 0;
			u = 0;
			d = 0;
			r = 0;
			l = 0;
			x = sc.nextInt();
			y = sc.nextInt();
			s = sc.next();
			c = s.toCharArray();
			
			for(int j=0;j<s.length();j++) {
				if(c[j] == 'U') {
					u++;
				}
				else if(c[j] == 'D') {
					d--;
				}
				else if(c[j] == 'R') {
					r++;
				}
				else if(c[j] == 'L') {
					l--;
				}
			}
			if(x >= 0 && r >= x) {
				check++;
			}
			else if(x < 0 && x >= l) {
				check++;
			}
			if(y >= 0 && u >= y) {
				check++;
			}
			else if(y < 0 && y >= d) {
				check++;
			}
			
			if(check == 2) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}

}
