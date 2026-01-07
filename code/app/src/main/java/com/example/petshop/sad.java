package com.example.petshop;

import java.util.Date;

public class sad extends Mood{

    sad() {
        super();
    }

    sad(Date date){
        super(date);
    }

    @Override
    public String myMood() {
        return "Sad";
    }
}
