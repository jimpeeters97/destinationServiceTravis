package hello;

public class Destination {
	private String naam;
	private String provincie;
	private String postcode;
	private String burgemeester;
	private long aantalInwoners;
	
	public Destination() {
		
	}
	
	public Destination(String naam, String provincie, String postcode, String burgemeester, long aantalInwoners) {
		this.setNaam(naam);
		this.setProvincie(provincie);
		this.setPostcode(postcode);
		this.setBurgemeester(burgemeester);
		this.setAantalInwoners(aantalInwoners);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getProvincie() {
		return provincie;
	}

	public void setProvincie(String provincie) {
		this.provincie = provincie;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getBurgemeester() {
		return burgemeester;
	}

	public void setBurgemeester(String burgemeester) {
		this.burgemeester = burgemeester;
	}

	public long getAantalInwoners() {
		return aantalInwoners;
	}

	public void setAantalInwoners(long aantalInwoners) {
		this.aantalInwoners = aantalInwoners;
	}
}
