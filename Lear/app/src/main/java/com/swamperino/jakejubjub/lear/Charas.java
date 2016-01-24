package com.swamperino.jakejubjub.lear;

/**
 * Created by jakej_000 on 1/24/2016.
 */
public class Charas {
    int value;
    String name;
    public Charas(){
        value=0;
        name="";
    }
    public Charas(int v,String n){
        value=v;
        name=n;
    }
    public void setValue(int v){
        value=v;
    }
    public void setName(String n){
        name=n;
    }
    public int getValue(){
        return value;
    }
    public String getName(){
        return name;
    }
}
