package com.devsuperior.dscatalog.repositories;

import com.devsuperior.dscatalog.lib.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByAuthority(String authority);

}
