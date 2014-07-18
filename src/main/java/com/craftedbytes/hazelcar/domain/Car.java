package com.craftedbytes.hazelcar.domain;

import com.hazelcast.nio.serialization.Portable;
import com.hazelcast.nio.serialization.PortableReader;
import com.hazelcast.nio.serialization.PortableWriter;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by dbrimley on 11/07/2014.
 */
public class Car implements Portable {

    public static int Id= 5;

    private transient CarKey carKey;

    private String model_body;
    private String model_engine_position;
    private int model_engine_cc;
    private int model_engine_cyl;
    private String model_engine_type;

    private int model_engine_valves_per_cyl;
    private int model_engine_power_ps;
    private int model_engine_power_rpm;
    private int model_engine_torque_nm;
    private int model_engine_torque_rpm;
    private int model_engine_bore_mm;
    private int model_engine_stroke_mm;
    private String model_engine_compression;
    private String model_engine_fuel;

    private int model_top_speed_kph;
    private float model_0_to_100_kph;
    private String model_drive;
    private String model_transmission_type;
    private int model_seats;
    private int model_doors;
    private int model_weight_kg;
    private int model_length_mm;
    private int model_height_mm;
    private int model_width_mm;
    private int model_wheelbase_mm;

    private float model_lkm_hwy;
    private float model_lkm_mixed;
    private float model_lkm_city;
    private int model_fuel_cap_l;
    private boolean model_sold_in_us;
    private float model_co2;
    private String model_make_display;
    private String make_display;
    private String make_country;

    public Car(){};

    @JsonCreator
    public Car(@JsonProperty("model_id") int model_id,
               @JsonProperty("model_make_id") String model_make_id,
               @JsonProperty("model_name") String model_name,
               @JsonProperty("model_trim") String model_trim,
               @JsonProperty("model_year") int model_year,
               @JsonProperty("model_body") String model_body,
               @JsonProperty("model_engine_position") String model_engine_position,
               @JsonProperty("model_engine_cc") int model_engine_cc,
               @JsonProperty("model_engine_cyl") int model_engine_cyl,
               @JsonProperty("model_engine_type") String model_engine_type,
               @JsonProperty("model_engine_valves_per_cyl") int model_engine_valves_per_cyl,
               @JsonProperty("model_engine_power_ps") int model_engine_power_ps,
               @JsonProperty("model_engine_power_rpm") int model_engine_power_rpm,
               @JsonProperty("model_engine_torque_nm") int model_engine_torque_nm,
               @JsonProperty("model_engine_torque_rpm") int model_engine_torque_rpm,
               @JsonProperty("model_engine_bore_mm") int model_engine_bore_mm,
               @JsonProperty("model_engine_stroke_mm") int model_engine_stroke_mm,
               @JsonProperty("model_engine_compression") String model_engine_compression,
               @JsonProperty("model_engine_fuel") String model_engine_fuel,
               @JsonProperty("model_top_speed_kph") int model_top_speed_kph,
               @JsonProperty("model_0_to_100_kph") float model_0_to_100_kph,
               @JsonProperty("model_drive") String model_drive,
               @JsonProperty("model_transmission_type") String model_transmission_type,
               @JsonProperty("model_seats") int model_seats,
               @JsonProperty("model_doors") int model_doors,
               @JsonProperty("model_weight_kg") int model_weight_kg,
               @JsonProperty("model_length_mm") int model_length_mm,
               @JsonProperty("model_height_mm") int model_height_mm,
               @JsonProperty("model_width_mm") int model_width_mm,
               @JsonProperty("model_wheelbase_mm") int model_wheelbase_mm,
               @JsonProperty("model_lkm_hwy") float model_lkm_hwy,
               @JsonProperty("model_lkm_mixed") float model_lkm_mixed,
               @JsonProperty("model_lkm_city") float model_lkm_city,
               @JsonProperty("model_fuel_cap_l") int model_fuel_cap_l,
               @JsonProperty("model_sold_in_us") int model_sold_in_us,
               @JsonProperty("model_co2") float model_co2,
               @JsonProperty("model_make_display") String model_make_display,
               @JsonProperty("make_display") String make_display,
               @JsonProperty("make_country") String make_country) {

        this.carKey = new CarKey(model_id,model_make_id,model_name,model_trim,model_year);

        this.model_body = model_body;
        this.model_engine_position = model_engine_position;
        this.model_engine_cc = model_engine_cc;
        this.model_engine_cyl = model_engine_cyl;
        this.model_engine_type = model_engine_type;
        this.model_engine_valves_per_cyl = model_engine_valves_per_cyl;
        this.model_engine_power_ps = model_engine_power_ps;
        this.model_engine_power_rpm = model_engine_power_rpm;
        this.model_engine_torque_nm = model_engine_torque_nm;
        this.model_engine_torque_rpm = model_engine_torque_rpm;
        this.model_engine_bore_mm = model_engine_bore_mm;
        this.model_engine_stroke_mm = model_engine_stroke_mm;
        this.model_engine_compression = model_engine_compression;
        this.model_engine_fuel = model_engine_fuel;
        this.model_top_speed_kph = model_top_speed_kph;
        this.model_0_to_100_kph = model_0_to_100_kph;
        this.model_drive = model_drive;
        this.model_transmission_type = model_transmission_type;
        this.model_seats = model_seats;
        this.model_doors = model_doors;
        this.model_weight_kg = model_weight_kg;
        this.model_length_mm = model_length_mm;
        this.model_height_mm = model_height_mm;
        this.model_width_mm = model_width_mm;
        this.model_wheelbase_mm = model_wheelbase_mm;
        this.model_lkm_hwy = model_lkm_hwy;
        this.model_lkm_mixed = model_lkm_mixed;
        this.model_lkm_city = model_lkm_city;
        this.model_fuel_cap_l = model_fuel_cap_l;
        this.model_sold_in_us = new Boolean((model_sold_in_us > 0 ? true : false));
        this.model_co2 = model_co2;
        this.model_make_display = model_make_display;
        this.make_display = make_display;
        this.make_country = make_country;
    }

    public CarKey getCarKey() {
        return carKey;
    }

    public String getModel_body() {
        return model_body;
    }

    public String getModel_engine_position() {
        return model_engine_position;
    }

    public int getModel_engine_cc() {
        return model_engine_cc;
    }

    public int getModel_engine_cyl() {
        return model_engine_cyl;
    }

    public String getModel_engine_type() {
        return model_engine_type;
    }

    public int getModel_engine_valves_per_cyl() {
        return model_engine_valves_per_cyl;
    }

    public int getModel_engine_power_ps() {
        return model_engine_power_ps;
    }

    public int getModel_engine_power_rpm() {
        return model_engine_power_rpm;
    }

    public int getModel_engine_torque_nm() {
        return model_engine_torque_nm;
    }

    public int getModel_engine_torque_rpm() {
        return model_engine_torque_rpm;
    }

    public int getModel_engine_bore_mm() {
        return model_engine_bore_mm;
    }

    public int getModel_engine_stroke_mm() {
        return model_engine_stroke_mm;
    }

    public String getModel_engine_compression() {
        return model_engine_compression;
    }

    public String getModel_engine_fuel() {
        return model_engine_fuel;
    }

    public int getModel_top_speed_kph() {
        return model_top_speed_kph;
    }

    public float getModel_0_to_100_kph() {
        return model_0_to_100_kph;
    }

    public String getModel_drive() {
        return model_drive;
    }

    public String getModel_transmission_type() {
        return model_transmission_type;
    }

    public int getModel_seats() {
        return model_seats;
    }

    public int getModel_doors() {
        return model_doors;
    }

    public int getModel_weight_kg() {
        return model_weight_kg;
    }

    public int getModel_length_mm() {
        return model_length_mm;
    }

    public int getModel_height_mm() {
        return model_height_mm;
    }

    public int getModel_width_mm() {
        return model_width_mm;
    }

    public int getModel_wheelbase_mm() {
        return model_wheelbase_mm;
    }

    public float getModel_lkm_hwy() {
        return model_lkm_hwy;
    }

    public float getModel_lkm_mixed() {
        return model_lkm_mixed;
    }

    public float getModel_lkm_city() {
        return model_lkm_city;
    }

    public int getModel_fuel_cap_l() {
        return model_fuel_cap_l;
    }

    public boolean isModel_sold_in_us() {
        return model_sold_in_us;
    }

    public float getModel_co2() {
        return model_co2;
    }

    public String getModel_make_display() {
        return model_make_display;
    }

    public String getMake_display() {
        return make_display;
    }

    public String getMake_country() {
        return make_country;
    }

    @Override
    public int getFactoryId() {
        return PortableFactory.FactoryId;
    }

    @Override
    public int getClassId() {
        return Id;
    }

    public void writePortable(PortableWriter writer) throws IOException {
        writer.writeUTF("f0", model_body);
        writer.writeUTF("f1", model_engine_position);
        writer.writeInt("f2", model_engine_cc);
        writer.writeInt("f3", model_engine_cyl);
        writer.writeUTF("f4", model_engine_type);

        writer.writeInt("f5", model_engine_valves_per_cyl);
        writer.writeInt("f6", model_engine_power_ps);
        writer.writeInt("f7", model_engine_power_rpm);
        writer.writeInt("f8", model_engine_torque_nm);
        writer.writeInt("f9", model_engine_torque_rpm);
        writer.writeInt("f10", model_engine_bore_mm);
        writer.writeInt("f11", model_engine_stroke_mm);
        writer.writeUTF("f12", model_engine_compression);
        writer.writeUTF("f13", model_engine_fuel);

        writer.writeInt("f14", model_top_speed_kph);
        writer.writeFloat("f15", model_0_to_100_kph);
        writer.writeUTF("f16", model_drive);
        writer.writeUTF("f17", model_transmission_type);
        writer.writeInt("f18", model_seats);
        writer.writeInt("f19", model_doors);
        writer.writeInt("f20", model_weight_kg);
        writer.writeInt("f21", model_length_mm);
        writer.writeInt("f22", model_height_mm);
        writer.writeInt("f23", model_width_mm);
        writer.writeInt("f24", model_wheelbase_mm);

        writer.writeFloat("f25", model_lkm_hwy);
        writer.writeFloat("f26", model_lkm_mixed);
        writer.writeFloat("f27", model_lkm_city);
        writer.writeInt("f28", model_fuel_cap_l);
        writer.writeBoolean("f29", model_sold_in_us);
        writer.writeFloat("f30", model_co2);
        writer.writeUTF("f31", model_make_display);
        writer.writeUTF("f32", make_display);
        writer.writeUTF("f33", make_country);
    }

    public void readPortable(PortableReader reader) throws IOException {
        model_body = reader.readUTF("f0");
        model_engine_position = reader.readUTF("f1");
        model_engine_cc = reader.readInt("f2");
        model_engine_cyl = reader.readInt("f3");
        model_engine_type = reader.readUTF("f4");

        model_engine_valves_per_cyl = reader.readInt("f5");
        model_engine_power_ps = reader.readInt("f6");
        model_engine_power_rpm = reader.readInt("f7");
        model_engine_torque_nm = reader.readInt("f8");
        model_engine_torque_rpm = reader.readInt("f9");
        model_engine_bore_mm = reader.readInt("f10");
        model_engine_stroke_mm = reader.readInt("f11");
        model_engine_compression = reader.readUTF("f12");
        model_engine_fuel = reader.readUTF("f13");

        model_top_speed_kph = reader.readInt("f14");
        model_0_to_100_kph = reader.readFloat("f15");
        model_drive = reader.readUTF("f16");
        model_transmission_type = reader.readUTF("f17");
        model_seats = reader.readInt("f18");
        model_doors = reader.readInt("f19");
        model_weight_kg = reader.readInt("f20");
        model_length_mm = reader.readInt("f21");
        model_height_mm = reader.readInt("f22");
        model_width_mm = reader.readInt("f23");
        model_wheelbase_mm = reader.readInt("f24");

        model_lkm_hwy = reader.readFloat("f25");
        model_lkm_mixed = reader.readFloat("f26");
        model_lkm_city = reader.readFloat("f27");
        model_fuel_cap_l = reader.readInt("f28");
        model_sold_in_us = reader.readBoolean("f29");
        model_co2 = reader.readFloat("f30");
        model_make_display = reader.readUTF("f31");
        make_display = reader.readUTF("f32");
        make_country = reader.readUTF("f33");
    }
    public void update(){
        model_body = model_body+ "MODIFIED";
    }
    @Override
    public String toString() {
        return carKey.toString();
    }
}
