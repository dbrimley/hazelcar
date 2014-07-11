package com.craftedbytes.hazelcar.domain;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

/**
 * Created by dbrimley on 11/07/2014.
 */
public class Car implements Serializable {

    private CarKey carKey;

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
    public String toString() {
        return carKey.toString();
    }
}
