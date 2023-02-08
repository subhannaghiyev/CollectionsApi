/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Iterator;

/**
 *
 * @author subhan
 */
public class User implements Iterable {

    private User user;

    public User(User user) {
        this.user = user;
    }

    public User() {
        }
    
    
    @Override
    public Iterator iterator() {
        if (user!=null) {
            System.out.println("Salam");
        }
        return (Iterator) user;
    }

}
