package com.example.loginjava.data.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

import org.bson.types.ObjectId;
public class user extends RealmObject {
    public user(String password, String username) {
        this.password = password;
        this.username = username;
    }
    public user(){}

    @PrimaryKey

    private ObjectId _id;
    private Integer __v;
    private String email;
    private String password;
    private String username;
    // Standard getters & setters
    public ObjectId get_id() { return _id; }
    public void set_id(ObjectId _id) { this._id = _id; }
    public Integer get__v() { return __v; }
    public void set__v(Integer __v) { this.__v = __v; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
}