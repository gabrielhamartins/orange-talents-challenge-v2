package br.com.zup.orangetalentschallengev2.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "car_tb")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    private String brand;

    private String year;

    public Car() {
    }

    public Car(Long id, String model, String brand, String year) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(model, car.model) && Objects.equals(brand, car.brand) && Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, brand, year);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}