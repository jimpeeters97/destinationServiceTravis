package hello;

import java.util.HashMap;
import java.util.Map;

public class DestinationService {
	public Map<String, Destination> destinations;
	
	public DestinationService() {
		this.destinations = new HashMap<String, Destination>();
		
		Destination leuven = new Destination("Leuven", "Vlaams-Brabant", "3000", "Louis Tobback", 98292);
		Destination aarschot = new Destination("Aarschot", "Vlaams-Brabant", "3200", "André Peeters", 29074);
		Destination genk = new Destination("Genk", "Limburg", "3600", "Wim Dries", 65399);
		Destination oostende = new Destination("Oostende", "West-Vlaanderen", "8400", "Johan Vande Lanotte", 70274);
		Destination brugge = new Destination("Brugge", "West-Vlaanderen", "8000", "Renaat Landuyt", 117377);
		Destination antwerpen = new Destination("Antwerpen", "Antwerpen", "2000", "Bart De Wever", 510610);
		Destination hasselt = new Destination("Hasselt", "Limburg", "3500", "Nadja Vananroye", 75991);
		Destination ieper = new Destination("Ieper", "West-Vlaanderen", "8900", "Jan Durnez", 34930);
		Destination mechelen = new Destination("Mechelen", "Antwerpen", "2800", "Bart Somers", 83194);
		
		destinations.put(leuven.getNaam(), leuven);
		destinations.put(aarschot.getNaam(), aarschot);
		destinations.put(genk.getNaam(), genk);
		destinations.put(oostende.getNaam(), oostende);
		destinations.put(brugge.getNaam(), brugge);
		destinations.put(antwerpen.getNaam(), antwerpen);
		destinations.put(hasselt.getNaam(), hasselt);
		destinations.put(ieper.getNaam(), ieper);
		destinations.put(mechelen.getNaam(), mechelen);
	}
	
	
	public Map<String,Destination> getAllDestinations() {
		return destinations;
	}
	
	public Destination getDestinationByName(String cityName) {
		return destinations.get(cityName);
	}
	
	public void addDestination(Destination destination) {
		if(destination == null) {
			throw new IllegalArgumentException("Destination to add can't be null");
		}
		destinations.put(destination.getNaam(), destination);
	}
}
