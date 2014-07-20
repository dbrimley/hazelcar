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
public class USClient {

    public static void main(String args[]){

        ClientConfig USConfig = new ClientConfig();
        USConfig.getNetworkConfig().addAddress("ec2-54-225-95-142.compute-1.amazonaws.com");
        USConfig.getGroupConfig().setName("us-east-1").setPassword("badabing");
        USConfig.getSerializationConfig().addPortableFactory( 1, new PortableFactory() );

        HazelcastInstance USClient = HazelcastClient.newHazelcastClient(USConfig);

        CarKey newCarKey = new CarKey(3,"Essex Boy Racer","Halfords","GTI",2012);
        Map<CarKey,Car> usCarMap = USClient.getMap("cars");
        System.out.println("US CAR : " + usCarMap.get(newCarKey));

    }

    private static void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
