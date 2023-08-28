package com.haha.homework;

/**
 * @author hhm
 * @version 1.0
 */
public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name,Vehicles vehicles){
        this.name=name;
        this.vehicles=vehicles;
    }
    //把具体的要求，封装成方法
    public void passRiver(){
        //先得到船
//
//        if(vehicles==null){
        if(!(vehicles instanceof Boat)){
            vehicles=VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        //得到马儿
//        if(vehicles==null){
        if(!(vehicles instanceof Horse)){

            //多态
            vehicles=VehiclesFactory.getHorse();
                }
        //接口调用

        vehicles.work();
    }
    //过火焰山
    public void passFireHill(){
        if(!(vehicles instanceof Plane)){

            //多态
            vehicles=VehiclesFactory.getPlane();
        }
        //接口调用

        vehicles.work();
    }
}
