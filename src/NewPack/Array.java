package NewPack;

public class Array {

	public static void main(String[] args) {
		int s[]= {1,2,3,4,5};
		int t=0;
		int i;
		for (i=0; i <= s.length; i++) {
		System.out.println(s[i]);
		t = t + s[i];
		
		if (s[i]== 5){
			System.out.println(i);
			break;
		}
		}
		System.out.println(t);
	}

}
