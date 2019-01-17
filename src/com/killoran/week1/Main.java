package com.killoran.week1;

public class Main {

    public static void main(String[] args) {
	String cityName = "columbus";
	int zipCode = 43228;
	float temperature[]= {20,21,22,23,24};
	int sum= 0;
	for( int i=0 ; i<=4; i++  ){
	    sum += temperature[i] ;
    };
	int average = sum/5;
        System.out.println( "the city name is "+cityName+" and the zipcode is "+ zipCode +" average temperature this week "+ average);
    }
}
