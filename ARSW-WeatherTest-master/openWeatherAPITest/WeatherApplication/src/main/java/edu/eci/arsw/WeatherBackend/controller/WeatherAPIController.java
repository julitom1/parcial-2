package edu.eci.arsw.WeatherBackend.controller;
import edu.eci.arsw.WeatherBackend.model.Ciudad;
import edu.eci.arsw.WeatherBackend.services.WeatherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/")
public class WeatherAPIController {
	
	@Autowired
    WeatherServices ws= null;
	
	public ResponseEntity<?> getDatos(@PathVariable ("ciudad") String ciudad){
    	Ciudad c=ws.getDatos(ciudad);
    	try {
    		if(c!=null) {
        
    			return new ResponseEntity<>(c,HttpStatus.ACCEPTED);
    		} 
    		return new ResponseEntity<>(-1,HttpStatus.ACCEPTED);
    	}catch (Exception ex) {
            
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }        
    }

}
