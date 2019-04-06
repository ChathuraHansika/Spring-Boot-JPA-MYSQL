/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Chathura
 */
@Repository 
public interface UserDao extends JpaRepository<User, Integer>{

     @Query("select u from User u where u.userId =:id and u.userName=:username")
     User getUser(@Param("id") int uid,@Param("username") String uname);

     @Modifying
     @Transactional
     @Query("UPDATE User u SET u.userName=:Uname where u.userId=:id")
     int  updateUser(@Param("id") int id,@Param("Uname") String uname);


}
