package com.devsuperior.dscatalog.lib.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;

    public Role(){
    }

    public Role(Long id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Role role = (Role) object;
        return Objects.equals(id, role.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
