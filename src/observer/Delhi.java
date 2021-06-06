package observer;

public class Delhi extends CentralObserver {

	public Delhi(MedicalCouncil medicalCouncil) {
      this.medicalCouncil = medicalCouncil;
      this.medicalCouncil.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Vaccine is " + medicalCouncil.getVaccineStatus() + " in Delhi");		
	}
}
