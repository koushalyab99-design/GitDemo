package polymorphism;

import inheritance.ParentbikeClass;

public class OverridingConcept extends ParentbikeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingConcept orc = new OverridingConcept();
		orc.audioSystem();

	}
	
	public void audioSystem()
	{
		System.out.println("Implemting child audio system for bike");
	}

}
