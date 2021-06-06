package observer;

public class Bangalore extends CentralObserver {

	public Bangalore(MedicalCouncil medicalCouncil) {
      this.medicalCouncil = medicalCouncil;
      this.medicalCouncil.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Vaccine is " + medicalCouncil.getVaccineStatus() + " in Bangalore");		
	}
	 

}
