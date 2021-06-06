package observer;

public class ObserverPatternDemo {
	public static void main(String[] args) {
      MedicalCouncil medicalCouncil = new MedicalCouncil();
      
      new Bangalore(medicalCouncil);
      
      new Delhi(medicalCouncil);
      
      System.out.println("Vaccine Available");
      medicalCouncil.setVaccineStatus("Available");
      
      System.out.println("*******************Vaccination in progress**************");
      
      System.out.println("Vaccine Unavailable");
      medicalCouncil.setVaccineStatus("Unavailable");      
      
      System.out.println("*******************Procuring***************");
      
      System.out.println("Vaccine Available");
      medicalCouncil.setVaccineStatus("Available");      
	}
}
