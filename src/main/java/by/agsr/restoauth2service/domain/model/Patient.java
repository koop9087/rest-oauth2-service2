package by.agsr.restoauth2service.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;


@Entity
@Table(name = "patient")
@Data
@Accessors(chain = true)
public class Patient {

    @Id
    @GeneratedValue
    @Column(name = "ID", columnDefinition = "uuid")
    private String id;

    @Column(name = "NAME")
    String name;

    @Column(name = "GENDER")
    String gender;

    @Column(name = "BIRTH_DATE")
    String birthDate;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Patient{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", birthDate='").append(birthDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
