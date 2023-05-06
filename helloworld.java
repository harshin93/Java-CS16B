public class helloworld {
	/*to compile, javac helloworld.java (c in javac is for compilation)
	 to run, java helloworld
	*/
	public static int larger (int z, int y){
		if (z > y){
			return z;
		}
		return y;
	}
	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println(larger(5, 50));
		int x;
		x = 0;
		while (x < 10) {
			System.out.println(x);
			x = x + 1;
		}
	}
}