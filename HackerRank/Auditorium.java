package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Auditorium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int audId;
		String audiName;
		int audiCapacity;
		int audiRating;
		String audiType;

		int inputAudiID;
		String inputAudiType;
		
		List<Auditorium> input = new ArrayList<Auditorium>();
		
		for (int i=0;i<4;i++) {
			audId = sc.nextInt();
			sc.nextLine();
			
			audiName = sc.nextLine();
			
			audiCapacity = sc.nextInt();
			sc.nextLine();
			
			audiRating = sc.nextInt();
			sc.nextLine();
			audiType = sc.nextLine();
			Auditorium audi = new Auditorium(audId, audiName, audiCapacity, audiRating, audiType);
			input.add(audi);
		}
		
		inputAudiID = sc.nextInt();
		sc.nextLine();
		inputAudiType = sc.nextLine();
		
		
		sc.close();
		System.out.println(getAudiCapacity(input, inputAudiID));
		
		System.out.println(getSecondHighestAudiRating(input, inputAudiType));
	}

	//Function Implementation Complete
	public static int getAudiCapacity(List<Auditorium> arr, int audID) {
		for (Auditorium audi:arr) {
			if (audi.getAudId() == audID) {
				return audi.getAudiCapacity();
			}
		}
		return 0;
	}


	public static Auditorium getSecondHighestAudiRating(List<Auditorium> arr, String audiType) {
		List<Auditorium> outputList = new ArrayList<Auditorium>();
		Collections.sort(arr,Comparator.comparingInt(Auditorium::getAudiRating));
		for (Auditorium audi : arr) {
			if (audi.getAudiType().equals(audiType)) {
				outputList.add(audi);
			}
		}
		if (outputList.size()==0) {
			return null;
		}
		return outputList.get(1);
	}
}

class Auditorium {

	private int audId;
	private String audiName;
	private int audiCapacity;
	private int audiRating;
	private String audiType;
	
	public Auditorium(int audId, String audiName, int audiCapacity, int audiRating, String audiType) {
		this.audId = audId;
		this.audiName = audiName;
		this.audiCapacity = audiCapacity;
		this.audiRating = audiRating;
		this.audiType = audiType;
	}
	
	public int getAudId() {
		return audId;
	}
	public String getAudiName() {
		return audiName;
	}
	public int getAudiCapacity() {
		return audiCapacity;
	}
	public int getAudiRating() {
		return audiRating;
	}
	public String getAudiType() {
		return audiType;
	}
	public void setAudId(int audId) {
		this.audId = audId;
	}
	public void setAudiName(String audiName) {
		this.audiName = audiName;
	}
	public void setAudiCapacity(int audiCapacity) {
		this.audiCapacity = audiCapacity;
	}
	public void setAudiRating(int audiRating) {
		this.audiRating = audiRating;
	}
	public void setAudiType(String audiType) {
		this.audiType = audiType;
	}	
}

