package edu.eci.arsw.WeatherBackend.persistence.impl;


import edu.eci.arsw.WeatherBackend.model.Ciudad;
import edu.eci.arsw.WeatherBackend.persistence.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;
public class InMemoryWeatherPersistence implements WeatherPersistence{

	private final ConcurrentHashMap<String,Ciudad> dic=new ConcurrentHashMap<>();
	
	@Override
	public Ciudad getDatos(String ciudad) {
		
		if(dic.containsKey(ciudad)){
			return dic.get(ciudad);
		}
		return null;
		
	}
}
