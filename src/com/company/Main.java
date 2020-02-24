package com.company;

public class Main {

    public static void main(String[] args) {
        DatabaseHandler databaseHandler = new DatabaseHandler();
        String name="jmeno";
        String password="heslo";
        User user = new User(name,password);
        databaseHandler.insertUser(user);
    }

}
