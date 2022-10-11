package diagonisePackage;

import java.util.ArrayList;

public class DiagoniseDisease {
	ArrayList<String> symptoms = new ArrayList<String>();
	public DiagoniseDisease(ArrayList<String> symptoms) {
		// TODO Auto-generated constructor stub
		this.symptoms = symptoms;
	}
	public String getDisease()
	{
		String disease;
		if (symptoms.contains("Muscle pain") && symptoms.contains("fever") && symptoms.contains("weakness")) {
			disease = "Corona";
			
		}
		else if (symptoms.contains("headache") && symptoms.contains("fever") && symptoms.contains("nausea") && symptoms.contains("Muscle pain")) {
			disease = "Malaria";
			
		}
		else if (symptoms.contains("headache") && symptoms.contains("Stomach ache/ cramps") && symptoms.contains("weakness")) {
			disease = "Typhoid";
			
		}
		else if (symptoms.contains("Stomach bloating") && symptoms.contains("fever") && symptoms.contains("Joint pain") && symptoms.contains("nausea")) {
			disease = "Diarrhea";
			
		}
		else if (symptoms.contains("fever") && symptoms.contains("Joint pain") && symptoms.contains("sensititvity")) {
			disease = "Jaundice";
			
		}
		else if (symptoms.contains("fever") && symptoms.contains("Pale skin") && symptoms.contains("rashes")) {
			disease = "Skin disease";
			
		}
		else {
			disease = "Couldnot detect";
		}
		
		return disease;
		
	}

}
