package com.craftedbytes.hazelcar.bootstrap;

import com.craftedbytes.hazelcar.domain.Car;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by dbrimley on 11/07/2014.
 */
public class Convert {

    public static void main(String args[]) {

        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStream = Convert.class.getResourceAsStream("/cars.json");
        List<Car> carList = null;

        try {
            carList = mapper.readValue(inputStream, new TypeReference<List<Car>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Car car:carList){
            System.out.println(car);
        }

    }

}
