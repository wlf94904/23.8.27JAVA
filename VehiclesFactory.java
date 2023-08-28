package com.haha.homework;

/**
 * @author hhm
 * @version 1.0
 */
public class VehiclesFactory {
    private static Horse horse=new Horse();
    private VehiclesFactory(){}
    public static  Horse getHorse(){
//
//            return new Horse();
        return horse;
        }
        public static Boat getBoat(){
            return new Boat();
        }
        public static Plane getPlane(){
        return new Plane();
        }

}
