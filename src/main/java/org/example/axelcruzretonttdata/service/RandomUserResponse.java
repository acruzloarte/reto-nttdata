package org.example.axelcruzretonttdata.service;

import java.util.List;

public record RandomUserResponse(List<User> results) {}

record User(String gender, Name name, Location location, String email, Dob dob, Picture picture){

}

record Name(String tittle, String first, String last){}
record Location(String country){}
record Dob(String date){}
record Picture(String medium){}
