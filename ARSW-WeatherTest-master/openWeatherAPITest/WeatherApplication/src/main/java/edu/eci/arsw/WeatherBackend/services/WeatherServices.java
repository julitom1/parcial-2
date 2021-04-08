package edu.eci.arsw.WeatherBackend.services;


import edu.eci.arsw.WeatherBackend.model.Ciudad;
import edu.eci.arsw.WeatherBackend.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServices {
	
	@Autowired
	WeatherPersistence bp = null;
	
	public Ciudad getDatos(String datos){
        return bp.getDatos(datos);
    }


}
