package _17_method;

public class Main1 {

	public static void main(String[] args) {
		TestMethod t = new TestMethod();
		System.out.println(t.name);
		t.setName("hong");
		t.setAge(100);
		t.setName("윤율");
		t.setAge1(10);
		t.setAge2(10000);
		t.setName4("이원재");
		t.setNum("최진석");
		System.out.println(t.name);
		System.out.println(t.getName());
		String resultName = t.getName2("1122");
		if(resultName != null) {
			System.out.println(resultName);
		}else {
			System.out.println("비번틀림");
		}
		System.out.println(t.maskName("◆"));
		System.out.println(t.aaa(200));
		System.out.println(t.bbb("윤율"));
		System.out.println(t.t(10));
		System.out.println(t.hhh(1));
		System.out.println(t.jk("잘생김 "));
		String z = t.qq("조준곤");
		System.out.println(z);
	}
}