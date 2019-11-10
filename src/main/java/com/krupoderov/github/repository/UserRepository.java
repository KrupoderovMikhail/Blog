package com.krupoderov.github.repository;

import com.krupoderov.github.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Krupoderov Mikhail on Nov, 2019
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
