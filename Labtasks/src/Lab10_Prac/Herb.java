package Lab10_Prac;

public class Herb extends Plant{
	private boolean isMedical;
	private String season;
	
	public Herb(String name, String color,boolean isMedical, String season) {
		super(name,color);
		this.setMedical(isMedical);
		this.setSeason(season);
	}

	public boolean isMedical() {
		return isMedical;
	}

	public void setMedical(boolean isMedical) {
		this.isMedical = isMedical;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	
	public String toString() {
		return super.toString() + " Medical: "+ isMedical + " Season:"+season;
	}

}
