package com.craftedbytes.hazelcar.bootstrap;

import com.craftedbytes.hazelcar.domain.Car;
import com.craftedbytes.hazelcar.domain.PortableFactory;
import com.craftedbytes.hazelcar.json.CarJSONLoader;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by dbrimley on 11/07/2014.
 */

public class Server {

    public static void main(String[] args) throws InterruptedException, IOException {

        /*ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-beans.xml");

        System.out.println("wait");*/

        Config config = new Config();

        config.setProperty("hazelcast.local.localAddress", "127.0.0.1");

        config.getSerializationConfig().addPortableFactory(PortableFactory.FactoryId, new PortableFactory());
        config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(config);

        CarJSONLoader loader = new CarJSONLoader(hazelcastInstance);

        System.in.read();

        loader.load();

        IMap<Object, Object> map = hazelcastInstance.getMap("cars");

        System.out.println("Loaded " + map.size());

        System.in.read();

        Car car1 = loader.carList.get(0);
        car1.update();

        map.put(loader.carList.get(0).getCarKey(), car1);
        System.out.println("UPDATED ");

        System.in.read();

        for(Car car:loader.carList){
            map.remove(car.getCarKey());
        }

        System.out.println("REMOVED ");

        for(;;) Thread.sleep(1000);
    }

}
