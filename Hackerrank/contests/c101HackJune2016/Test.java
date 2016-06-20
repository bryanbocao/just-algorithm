package contests.c101HackJune2016;

public class Test {

	public static void main(String[] args) {
		System.out.println(gcd(5,5));
	}
	public static int gcd(int a, int b) {
	    if (b == 0) {
	        return Math.abs(a);
	    }
	    return gcd(b, a % b);
	}
}
