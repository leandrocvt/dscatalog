package com.devsuperior.dscatalog.repositories;

import com.devsuperior.dscatalog.lib.entities.Product;
import com.devsuperior.dscatalog.lib.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
