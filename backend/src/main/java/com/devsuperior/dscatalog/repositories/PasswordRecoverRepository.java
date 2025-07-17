package com.devsuperior.dscatalog.repositories;

import com.devsuperior.dscatalog.lib.entities.PasswordRecover;
import com.devsuperior.dscatalog.lib.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordRecoverRepository extends JpaRepository<PasswordRecover, Long> {

}
