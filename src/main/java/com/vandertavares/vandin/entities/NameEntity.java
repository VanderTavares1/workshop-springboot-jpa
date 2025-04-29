package com.vandertavares.vandin.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_name")
public class NameEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "name_client")
    private UserEntity name;

    public NameEntity(Long id, UserEntity name) {
        super();
        this.id = id;
        this.name = name;
    }

    public UserEntity getName() {
        return name;
    }

    public void setName(UserEntity name) {
        this.name = name;
    }

    public NameEntity(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NameEntity that = (NameEntity) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
