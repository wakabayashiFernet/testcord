package main;

public class Calc {

	public int add(int x,int y) {
		return x + y;
	}
	
	public int dec(int x,int y) {
		return x - y;
	}
	public int div(int x,int y) {
		if(y == 0) {
			 return 0;
		}
		return x / y;
	}
}
