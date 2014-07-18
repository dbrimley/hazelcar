package com.craftedbytes.hazelcar.domain;

import com.hazelcast.nio.serialization.Portable;
import com.hazelcast.nio.serialization.PortableReader;
import com.hazelcast.nio.serialization.PortableWriter;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by dbrimley on 11/07/2014.
 */
public class CarKey implements Portable{

    public static int Id= 6;

    private long model_id;
    private String model_make_id;
    private String model_name;
    private String model_trim;
    private int model_year;

    public CarKey() {
    }

    public CarKey(long model_id, String model_make_id, String model_name, String model_trim, int model_year) {
        this.model_id = model_id;
        this.model_make_id = model_make_id;
        this.model_name = model_name;
        this.model_trim = model_trim;
        this.model_year = model_year;
    }

    public long getModel_id() {
        return model_id;
    }

    public String getModel_make_id() {
        return model_make_id;
    }

    public String getModel_name() {
        return model_name;
    }

    public String getModel_trim() {
        return model_trim;
    }

    public int getModel_year() {
        return model_year;
    }

    public void writePortable(PortableWriter writer) throws IOException {
        writer.writeLong("mi", model_id);
        writer.writeUTF("mm", model_make_id);
        writer.writeUTF("mt", model_trim);
        writer.writeInt("my", model_year);
        writer.writeUTF("mn", model_name);
    }

    public void readPortable(PortableReader reader) throws IOException {
        model_id = reader.readLong("mi");
        model_make_id = reader.readUTF("mm");
        model_trim = reader.readUTF("mt");
        model_year = reader.readInt("my");
        model_name = reader.readUTF("mn");
    }

    @Override
    public String toString() {
        return "CarKey{" +
                "model_id=" + model_id +
                ", model_make_id='" + model_make_id + '\'' +
                ", model_name='" + model_name + '\'' +
                ", model_trim='" + model_trim + '\'' +
                ", model_year=" + model_year +
                '}';
    }

    @Override
    public int getFactoryId() {
        return PortableFactory.FactoryId;
    }

    @Override
    public int getClassId() {
        return Id;
    }
}
