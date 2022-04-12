package test;

public class Solution_N개의최소공배수 {

	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		System.out.println(solution(arr));
	}
	public static int solution(int[] arr) {
        int answer = 0;
        int res = arr[0];
        for(int i=0; i<arr.length; i++) {
        	res = lcm(res,arr[i]);
        }
        return res;
    }
	private static int lcm(int i, int j) {
		return i*j/gcd(i,j);
	}
	private static int gcd(int i, int j) {
		while(j!=0) {
			int r=i%j;
			i=j;
			j=r;
		}
		return i;
	}
}
