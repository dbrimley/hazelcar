package com.craftedbytes.hazelcar.bootstrap;

import com.craftedbytes.hazelcar.domain.Car;
import com.craftedbytes.hazelcar.domain.CarKey;
import com.craftedbytes.hazelcar.domain.PortableFactory;
import com.craftedbytes.hazelcar.json.CarJSONLoader;
import com.hazelcast.config.Config;
import com.hazelcast.config.XmlConfigBuilder;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Map;

/**
 * Created by dbrimley on 11/07/2014.
 */

public class Server {

    public static void main(String[] args) throws InterruptedException, IOException {

        String location = System.getProperty("LOCATION");
        XmlConfigBuilder xmlConfigBuilder = new XmlConfigBuilder(Server.class.getResourceAsStream("/"+ location + ".hazelcast.xml"));
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(xmlConfigBuilder.build());
        CarJSONLoader loader = new CarJSONLoader(hazelcastInstance);
        loader.load();
        Map<CarKey,Car> carMap = hazelcastInstance.getMap("cars");
        System.out.println(carMap.keySet());
    }

}
