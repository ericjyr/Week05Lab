/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import models.User;

/**
 *
 * @author ericr
 */
public class AccountService extends User{

    
    
    public User login(String username, String password) {
        
        if ((username.equals("abe") || username.equals("barb"))
                && password.equals("password")) {
            User user = new User(username, null);
            return user;
        }
        else {
            return null;
        }
    }
    
    
    
}
