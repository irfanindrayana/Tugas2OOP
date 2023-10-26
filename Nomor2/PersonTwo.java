package Nomor2;

public class PersonTwo {
	int kuota;
	String person;
	
	public PersonTwo(int kuota, String person) {
		this.kuota = kuota;
		this.person = person;
	}
	
	public void displayQuote(){
		System.out.println("Person :" + person);
		System.out.println("Kuota  :" + kuota);
	}
	
}
