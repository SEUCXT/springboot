package com.example.repository;

import com.example.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 17858 on 2017-07-08.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

    long countByUsername(String username);
}
