package com.example.loginjava.data;

import android.util.Log;

import com.example.loginjava.data.model.user;
import com.example.loginjava.ui.login.LoginActivity;

import java.io.IOException;
import java.lang.reflect.Executable;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {


    public Result<user> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            user NewUser = new user(username,password);
            


            return new Result.Success<>(NewUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}