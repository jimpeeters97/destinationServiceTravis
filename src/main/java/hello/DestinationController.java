package hello;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {
	private DestinationService service;
	
	public DestinationController() {
		service = new DestinationService();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public Map<String,Destination> getAllDestinations() {
		return service.getAllDestinations();
	}
	
	@RequestMapping(value="/getDestination", method=RequestMethod.GET)
	public Destination getDestination(@RequestParam(value="city") String cityName) {
		return service.getDestinationByName(cityName);
	}
	
	@RequestMapping(value="/addDestination", method=RequestMethod.POST)
	public void addDestination(@RequestParam(value="city") String city, @RequestBody Destination destination) {
		service.addDestination(destination);
	}
}
