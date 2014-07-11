package com.craftedbytes.hazelcar.domain;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by dbrimley on 11/07/2014.
 */
public class Car {

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

    @Override
    public String toString() {
        return carKey.toString();
    }
}
