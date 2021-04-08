package edu.eci.arsw.WeatherBackend.persistence;

import edu.eci.arsw.WeatherBackend.model.Ciudad;

public interface WeatherPersistence {
    

    
    public Ciudad getDatos(String ciudad);

}
