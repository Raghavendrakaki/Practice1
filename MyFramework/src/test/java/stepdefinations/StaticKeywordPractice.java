package stepdefinations;

public class StaticKeywordPractice {

	int k;
	static int t;

	void test() {

	}

	static void staticTest(StaticKeywordPractice s) {
	//	s.k
		s.k=9;

	}
	
	public static void main(String[] args) {
		StaticKeywordPractice s = new StaticKeywordPractice();
		StaticKeywordPractice s1 = new StaticKeywordPractice();
		s.k=4;
		t=5;
		staticTest(s1);
		s.test();
		s.test2();
		//TestStatic.test2(s);
		System.out.println("t"+t);
		System.out.println("k"+s.k);
		System.out.println(s1.k);
		System.out.println("I'm Raghavendra kaki");
		
		
	}

	void test2() {
		
		t=5;
		
	}
}
