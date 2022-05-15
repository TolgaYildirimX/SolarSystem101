package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**
         * branching
         * create basic structure of solar system and deploy asap
         */

        Solarsystem factorX = new Solarsystem();
        factorX.sun="1";
        factorX.moon="4";
        factorX.planet="2";
        factorX.stars="1000";

        // adding feature to our sun
        FeatureSun xFact = new FeatureSun();
        xFact.color="green";
        xFact.radius= "100000km";
        xFact.heat = "234324234324kj";

    }
}
