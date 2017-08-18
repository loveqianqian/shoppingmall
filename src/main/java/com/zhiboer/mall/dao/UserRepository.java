package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by yao on 2017/7/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);

    @Query(value = "SELECT * from User u where u.name=:name", nativeQuery = true)
    User findUser(@Param("name") String name);
}
