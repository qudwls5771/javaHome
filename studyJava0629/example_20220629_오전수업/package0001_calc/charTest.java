package package0001_calc;

public class charTest {
    public void test() {
        char c1 = 'A';          
		char c2 = 65;          
		char c3 = '\u0041';   
		
		char c4 = 'a';         
		char c5 = 44032;      
		char c6 = '\uac00';   
		
		int uniCode = c1;		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
    }
}
