package model;

public class Code {

    static String code1;
    static  String code2;
	static int f=0;
	public static String getCode1() {
		return code1;
	}
	
	public static String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
		System.out.println(code2);
	}
	public void setCode1(String string) {
		if(string!=null) {
		f++;
		this.code1=string;
		System.out.println(code1);
		if(f==1) {
			code2=code1;
			code1=null;
			System.out.println(code2);
		}
		}
	}
	
	
	
}
