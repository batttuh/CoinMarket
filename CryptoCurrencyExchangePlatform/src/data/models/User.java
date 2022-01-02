package data.models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hasan
 */
abstract class User {
    public static String email = "email";

    public User(String email) {
        this.email = email;
    }
    
    String getUser(){
        return this.email;
    }
}
