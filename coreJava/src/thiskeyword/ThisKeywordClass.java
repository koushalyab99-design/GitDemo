package thiskeyword;

public class ThisKeywordClass {
	
	int a =5051;
	
	public void getData()
	{
		int a = 4041;
		System.out.println(a);
		//this keyword scope lies in class level
		System.out.println(this.a+a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordClass kc= new ThisKeywordClass();
		kc.getData();
		

	}

}
