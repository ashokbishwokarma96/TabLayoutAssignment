package com.meroapp.tablayoutassignment.implement;

import com.meroapp.tablayoutassignment.model.DataStore;

public class InterfaceClass implements TabLayoutInterface{
    static String names, password;


    @Override
    public boolean adduser(DataStore ds) {
        boolean b;
        if ((!ds.getPassword().isEmpty()) && (!ds.getName().isEmpty())) {
            names = ds.getName();
            password = ds.getPassword();
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    @Override
    public boolean Checkuser(String name, String password) {
        boolean b = false;
        try{  if (names.equals(name)&&(password.equals(password))) {
            b = true;
        } else {
            b = false;
        }}catch (Exception ex){
            ex.printStackTrace();
        }
        return b;
    }
}
