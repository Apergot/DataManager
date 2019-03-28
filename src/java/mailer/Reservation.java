/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailer;

import java.io.Serializable;

/**
 *
 * @author Apergot
 */
public class Reservation implements Serializable{
    private final String name;
    private final String email;
    private final String phone;
    private final String date;
    private final String time;
    private final String movie_id;

    public Reservation(String name, String phone, String email, String date, String time, String movie_id) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.date = date;
        this.time = time;
        this.movie_id = movie_id;
    }
    public Reservation(){
        name = "";
        email = "";
        phone = "";
        date = "";
        time = "";
        movie_id = "";
    }

    public String getMovie_id() {
        return movie_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}

