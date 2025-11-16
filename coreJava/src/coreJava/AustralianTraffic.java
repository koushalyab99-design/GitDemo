package coreJava;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//interface - same as class but will have methods not body 
		//classes should implement the methods in the interface
		CentralTraffic ct = new AustralianTraffic();
		ContinentalTraffic ct1 = new AustralianTraffic();
		AustralianTraffic at = new AustralianTraffic();
		ct.Greengo();
		ct.redstop();
		ct.Yellowwait();
		at.Walkonsymbol();
		ct1.Trainsymbol();
		
		
	}
	public void Walkonsymbol()
	{
		System.out.println("walking");
	}

	@Override
	public void Greengo() {
		// TODO Auto-generated method stub
		System.out.println("implement green go");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("implement red stop");
		
	}

	@Override
	public void Yellowwait() {
		// TODO Auto-generated method stub
		System.out.println("implement yellow wait");
		
	}
	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Stop when you see the train symbol");
		
	}

}
