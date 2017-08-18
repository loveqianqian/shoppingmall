package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/7/17.
 */
@Repository
public interface RoleRepository {

    void insertOne(Role role);

    List<Role> selectAll();

    List<Role> selectByLike(Role role);

    void deleteById(String id);

    void updateById(Role role);
}
