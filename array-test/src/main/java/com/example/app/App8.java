package com.example.app;

class Emploees{
    int id ;
    String name ;

    public Emploees(int id , String name){
        this.id = id ;
        this.name = name ;

    }

    @Override
    public String toString() {
        return "Emploees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class App8 {
    public static void main(String[] args) {

        Emploees []emploee ={new Emploees(1,"john"),
                new Emploees(2,"abc")};

        int maximumLength = 0 ;
        for (Emploees e : emploee){
            if(e.name.length()>maximumLength){
                maximumLength = e.name.length();
            }
        }

        System.out.println("employee with longest name ");
        for (Emploees e : emploee){
            if (e.name.length() == maximumLength){
                System.out.println(e);
            }
        }
    }

}

