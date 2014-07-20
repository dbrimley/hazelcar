package com.craftedbytes.hazelcar.client;

import com.craftedbytes.hazelcar.domain.Car;
import com.craftedbytes.hazelcar.domain.CarKey;
import com.craftedbytes.hazelcar.domain.PortableFactory;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;

/**
 * Created by dbrimley on 20/07/2014.
 */
public class Client {

    public static void main(String args[]){

        // Asia Pacific

        ClientConfig APConfig = new ClientConfig();
        APConfig.getNetworkConfig().addAddress("ec2-54-179-141-228.ap-southeast-1.compute.amazonaws.com");
        APConfig.getGroupConfig().setName("ap-southeast-1").setPassword("wavell");
        APConfig.getSerializationConfig().addPortableFactory( 1, new PortableFactory() );

        HazelcastInstance APClient = HazelcastClient.newHazelcastClient(APConfig);

        Map<CarKey,Car> apCarMap = APClient.getMap("cars");

        // US

        //ClientConfig USConfig = new ClientConfig();
        //USConfig.getNetworkConfig().addAddress("ec2-54-225-95-142.compute-1.amazonaws.com");
        //USConfig.getGroupConfig().setName("us-east-1").setPassword("badabing");
        //USConfig.getSerializationConfig().addPortableFactory( 1, new PortableFactory() );

        //HazelcastInstance USClient = HazelcastClient.newHazelcastClient(USConfig);

        //Map<CarKey,Car> usCarMap = USClient.getMap("cars");

        // EU

        ClientConfig EUConfig = new ClientConfig();
        EUConfig.getNetworkConfig().addAddress("ec2-54-75-227-128.eu-west-1.compute.amazonaws.com");
        EUConfig.getGroupConfig().setName("eu-west-1").setPassword("shamrock");
        EUConfig.getSerializationConfig().addPortableFactory( 1, new PortableFactory() );

        HazelcastInstance EUClient = HazelcastClient.newHazelcastClient(EUConfig);

        Map<CarKey,Car> euCarMap = EUClient.getMap("cars");

        // Create the Car

        CarKey newCarKey = new CarKey(3,"Essex Boy Racer","Halfords","GTI",2012);
        Car newCar = new Car(newCarKey);

        // Put it in the cluster

        System.out.println("Putting car in AP");

        apCarMap.put(newCarKey,newCar);

        System.out.println("Sleeping for 500ms");

        sleep();

        System.out.println("EU CAR : " + euCarMap.get(newCarKey));
        //System.out.println("US CAR : " + usCarMap.get(newCarKey));

    }

    private static void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
