package com.craftedbytes.hazelcar.domain;

import java.io.Serializable;

/**
 * Created by dbrimley on 11/07/2014.
 */
public class CarKey implements Serializable{

    private final long model_id;
    private final String model_make_id;
    private final String model_name;
    private final String model_trim;
    private final int model_year;

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
}
