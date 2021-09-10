package br.com.zup.orangetalentschallengev2.dto.requests;

import java.util.Objects;

public class CarDTO {

    private Long id;

    private String model;

    private String brand;

    private String year;

    private String value;

    private String rotationDay;

    private Boolean isRotating;

    public CarDTO() {
    }

    public CarDTO(Long id, String model, String brand, String year, String value, String rotationDay, Boolean isRotating) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.value = value;
        this.rotationDay = rotationDay;
        this.isRotating = isRotating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDTO carDTO = (CarDTO) o;
        return Objects.equals(id, carDTO.id) && Objects.equals(model, carDTO.model) && Objects.equals(brand, carDTO.brand) && Objects.equals(year, carDTO.year) && Objects.equals(value, carDTO.value) && Objects.equals(rotationDay, carDTO.rotationDay) && Objects.equals(isRotating, carDTO.isRotating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, brand, year, value, rotationDay, isRotating);
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRotationDay() {
        return rotationDay;
    }

    public void setRotationDay(String rotationDay) {
        this.rotationDay = rotationDay;
    }

    public Boolean getRotating() {
        return isRotating;
    }

    public void setRotating(Boolean rotating) {
        isRotating = rotating;
    }
}
