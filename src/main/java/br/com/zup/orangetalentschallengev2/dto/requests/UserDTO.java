package br.com.zup.orangetalentschallengev2.dto.requests;


import br.com.zup.orangetalentschallengev2.entity.Car;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class UserDTO {

    private Long id;

    @NotEmpty(message = "Field name cannot be empty or null")
    private String name;

    @NotEmpty(message = "Field email cannot be empty or null")
    private String email;

    @NotEmpty(message = "Field CPF cannot be empty or null")
    @CPF(message = "Invalid CPF number")
    private String cpf;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime birthdate;

    private List<Car> cars;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(id, userDTO.id) && Objects.equals(name, userDTO.name) && Objects.equals(email, userDTO.email) && Objects.equals(cpf, userDTO.cpf) && Objects.equals(birthdate, userDTO.birthdate) && Objects.equals(cars, userDTO.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, cpf, birthdate, cars);
    }

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String email, String cpf, LocalDateTime birthdate, List<Car> cars) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.birthdate = birthdate;
        this.cars = cars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDateTime birthdate) {
        this.birthdate = birthdate;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
