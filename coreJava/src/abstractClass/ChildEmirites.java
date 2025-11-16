package abstractClass;

public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirites ce = new ChildEmirites();
		ce.engine();
		ce.safetyGuidelines();
		ce.bodyColour();
		

	}
	

	

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("child class body colour is Cream white ");
		
	}

}
