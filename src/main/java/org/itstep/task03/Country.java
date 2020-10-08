package org.itstep.task03;

import org.itstep.task02.City;

import java.util.Arrays;

public class Country {
    private String name;
    private String continent;
    private String code;
    private City capital;//вот тут не понял, будем разбиратся. Я так понял что это не "название" а сама столица отдельно
    private City[] cities;
    //С тем что бы понять какие пораметры должен принимать метод addCity было сложно. Как и попытка прочитать тест.
    //С подсчетом количества жителей я за 20 мин так ничего и не понял, что делать со столицей и почему у меня падает программа

    public Country() {
    }

    public Country(String name, String continent, String code, City capital) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
    }

    public void addCity(){

    }
    /*
    public void addCity(String name, String region, String country, int inhabitants, String index, String code){
        cities = Arrays.copyOf(cities, cities.length + 1);
        cities[cities.length - 1] = new City(name, region, country, inhabitants, index, code);
    }*/

    public void addCity(City city){
        if (cities == null){
            cities = new City[1];
            cities[0] = city;
        }
        else{
            cities = Arrays.copyOf(cities, cities.length + 1);
            cities[cities.length - 1] = city;
        }
    }

    public int getInhabitants(){
        int numbersAllInhabitants = 0;
        /*if (cities != null){
        numbersAllInhabitants = capital.getInhabitants();
        }*/
        for (int i = 0; i < cities.length; i++) {
            numbersAllInhabitants += cities[i].getInhabitants();
        }
        return numbersAllInhabitants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }
}
