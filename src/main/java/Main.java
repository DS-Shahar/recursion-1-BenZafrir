public class Main {
		public static int q1 (int n) {
			if(n==0) {
				return 0;
			}
			int a=n+q1(n-1);
			return a;
		}
		public static double q2(int n) {
			if (n==0) {
				return 1.0;
			}
			double a=n*q2(n-1);
			return a;
		}
		public static double q3(int n) {
			if (n==1) {
				return 1.0;
			}
			if (n%2==0) {
				n=n-1;
			}
			double a=n*q3(n-2);
			return a;
		}
		public static double q4(int n) {
			if (n/10==0) {
				return 1.0;
			}
			double a=1+q4(n/10);
			return a;
		}
		public static double q5(int n1, int n2) {
			if (n1-n2==0) {
				return 1.0;
			}
			if (n1-n2<0) {
				return 0.0;
			}
			double a=1+q5(n1-n2,n2);
			return a;
		}
		public static double q6(int n1, int n2) {//n1 is bigger number
			if (n1-n2==0) {
				return 0.0;
			}
			if (n1-n2<0) {
				return (n1-n2)+n2;
			}
			double a=q6(n1-n2,n2);
			return a;
		}
		public static boolean q7(int x, int y) {//x is bigger number
			if (x-y==0) {
				return true;
			}
			if (x-y<0) {
				return false;
			}
			boolean a=q7(x-y,y);
			return a;
		}
		public static boolean q8(int n, int z) {//z=n-1
			if (z<=1) {
				return true;
			}
			if (n%z==0) {
				return false;
			}
			z--;
			boolean a=q8(n,z);
			return a;
		}

	public static void main(String[] args) {
		System.out.println(q8(89,89-1));
	}

}
