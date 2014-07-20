package com.craftedbytes.hazelcar.json;

import com.craftedbytes.hazelcar.domain.Car;
import com.craftedbytes.hazelcar.domain.CarKey;
import com.hazelcast.core.HazelcastInstance;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by dbrimley on 11/07/2014.
 */
public class CarJSONLoader {

    private HazelcastInstance hazelcastInstance;

    public List<Car> carList;


    public CarJSONLoader(HazelcastInstance hazelcastInstance){
        this.hazelcastInstance = hazelcastInstance;
    }

    public void load() {

        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStream = CarJSONLoader.class.getResourceAsStream("/cars-small.json");

        try {
            carList = mapper.readValue(inputStream, new TypeReference<List<Car>>(){});
            Map<CarKey,Car> carMap = hazelcastInstance.getMap("cars");
            for(Car car:carList){
                carMap.put(car.getCarKey(),car);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
