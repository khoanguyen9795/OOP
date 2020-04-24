package khoanguyen.com.oop;

public class Animal {
    String name;
    int weight;

    public Animal(String name , int weight){
        this.name = name;
        this.weight = weight;
    }

    public String info(){
        return "Tên con mèo: " + name +"\n" +"cân nặng: "+ weight;
    }
}
