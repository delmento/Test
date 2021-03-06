package bestbucketlist2022;


/* 
 * Deze class defineert een bestemming
 * 
 */
public class Destinations {

	public static enum Country {
		SURINAME, INDONESIA, INDIA, BORA_BORA;
	}
	
	public static enum Sightseeing {
		BLANCHE_MARIEFALLS, BALI, THE_TAJ_MAHAL, FRENCH_POLYNESIA
	}
	
	protected String location;
	protected Country country;
	protected Sightseeing sightseeing;
	public String location() {
		return location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Sightseeing getSightseeing() {
		return sightseeing;
	}
	public void setSightseeing(Sightseeing sightseeing) {
		this.sightseeing = sightseeing;
	}
	
	public Destinations(String location, Country country, Sightseeing sightseeing) {
		super();
		this.location = location;
		this.country = country;
		this.sightseeing = sightseeing;
	}
	
	public String toString() {
		return "Next destination: " +  location + " " + country + " " +  sightseeing;
	}
	
}
