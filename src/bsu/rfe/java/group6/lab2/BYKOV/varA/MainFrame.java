package bsu.rfe.java.group6.lab2.BYKOV.varA;

public class MainFrame {
    public Double calculate1(Double x, Double y, Double z) {
        return (Math.pow(Math.cos(Math.PI*x*x*x)+Math.log((1+y)*(1+y)),0.25)*
                (Math.exp(Math.pow(z,2))+Math.pow((1*Math.pow(x,-1)),0.5)+Math.cos(Math.exp(y))));

    }

    public Double calculate2(Double x, Double y, Double z) {
        return ((Math.pow(x,x))/((Math.pow((y*y*y+1),0.5)+Math.log(z))));
    }
}
