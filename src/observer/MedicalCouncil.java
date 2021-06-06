package observer;

import java.util.ArrayList;
import java.util.List;

public class MedicalCouncil {
	private List<CentralObserver> centralObservers = new ArrayList<CentralObserver>();
	private String vaccineStatus;

	public String getVaccineStatus() {
		return vaccineStatus;
	}
	
	public void setVaccineStatus(String vaccineStatus) {
		this.vaccineStatus = vaccineStatus;
		this.notifyCities();		
	}
	
	public void notifyCities() {
		for(CentralObserver centralObserver: centralObservers) {
			centralObserver.update();
		}
	}

	public void attach(CentralObserver centralObserver) {
		centralObservers.add(centralObserver);	
	}
}
