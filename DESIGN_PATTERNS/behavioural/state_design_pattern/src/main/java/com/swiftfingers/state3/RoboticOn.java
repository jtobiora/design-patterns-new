package com.swiftfingers.state3;


//Concrete states of a robot. A robot will be in any of these states at any time.
public class RoboticOn implements RoboticState{
    private final Robot robot;

    public RoboticOn(Robot robot){
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
        robot.setRoboticState(robot.getRoboticCook());
    }

    @Override
    public void off() {
        robot.setState(robot.getRoboticOff());
        System.out.println("Robot is switched off");
    }
}