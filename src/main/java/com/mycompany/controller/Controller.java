/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dao.UserDao;
import com.mycompany.user.User;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Chathura
 */
@RestController
public class Controller {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/save")
    public String saveData() {
        User user = new User();
        user.setUserId(2);
        user.setUserName("User");
        userDao.save(user);
        return "saved";
    }

    @RequestMapping(value = "/select/{id}/{name}")

    public String selectData(@PathVariable int id,@PathVariable String name){
        User user = userDao.getUser(id,name);
        if (user!=null){
            System.out.println("user.getUserName() = " + user.getUserName());
            return user.toString();
        }else {
            System.out.println("User not found");
            return "User not found";
        }



    }

    @RequestMapping(value = "/update/{uid}/{username}")
    public String getUpdate(@PathVariable int uid,@PathVariable String username){
        User one = userDao.findOne(uid);
        if (one!=null){
            userDao.updateUser(uid,username);
        }
        return "";
    }



    @RequestMapping(value = "/get")
    public @ResponseBody
    ArrayList<Integer>
            getString() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        return arrayList;
    }

}
