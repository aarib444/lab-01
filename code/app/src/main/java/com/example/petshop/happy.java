package com.example.petshop;

import java.util.Date;

public class happy extends Mood{

    happy() {
        super();
    }

    happy(Date date){
        super(date);
    }

    @Override
    public String myMood() {
        return "Happy";
    }


}
