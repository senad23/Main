
public class ForLoops {
	public static void main(String[] args){
		
		loop(9);
		space();
		loop(45);
	}
	
	private static void loop(Integer num){
		
		for (int i = 0; i < 2; i++) {
		num = num *2;
		System.out.println(num);
		}
	}
	
	private static void space(){
		System.out.println();
	}

}
