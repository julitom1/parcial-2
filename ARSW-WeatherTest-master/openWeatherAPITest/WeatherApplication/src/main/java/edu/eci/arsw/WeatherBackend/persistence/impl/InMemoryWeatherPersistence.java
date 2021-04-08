package edu.eci.arsw.WeatherBackend.persistence.impl;


import edu.eci.arsw.WeatherBackend.model.*;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;

import edu.eci.arsw.WeatherBackend.persistence.*;

/**
 *
 * @author hcadavid
 */

@Service
public class InMemoryWeatherPersistence implements WeatherPersistence{

    private final ConcurrentHashMap<String,Ciudad> dic=new ConcurrentHashMap<>();

 
    @Override
	public void postDatos(Ciudad ciudad) {

    	
		dic.put(ciudad.getCiudad(),ciudad);

	}


	@Override
	public Ciudad getDatos(String ciudad) {
		
		if(dic.containsKey(ciudad)){
			return dic.get(ciudad);
		}
		return null;
		
	}
}
