package com.company;

public class Main {
    public static void main(String[] args) {
        //the basic structure
        carBasics carBasics = new carBasics();

        carBasics.color = "green";
        carBasics.number = "25555";
        carBasics.door = "3";
        carBasics.engine = "4589cc";

        carBasics.color = "blue";
        carBasics.engine = "5236cc";
        carBasics.door = "4";
        carBasics.number = "4568977";

        System.out.println(carBasics.color);
    }
}
