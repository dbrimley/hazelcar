package com.craftedbytes.hazelcar.domain;

import com.hazelcast.nio.serialization.Portable;

/**
 * Created by asm on 7/17/2014.
 */
public class PortableFactory implements com.hazelcast.nio.serialization.PortableFactory {

    public static int FactoryId = 1;
    @Override
    public Portable create(int classId) {
        if (Car.Id == classId)
        {
            return new Car();
        }
        if (CarKey.Id == classId)
        {
            return new CarKey();
        }
        return null;
    }
}
