// file name: City.java

package com.example.listycity_lab6;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName()); // this.city refers to the city name
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.city) &&
                province.equals(city1.province);
    }

    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }

}

