//package oop;

abstract class Binatang{
    protected abstract void tampilSuara();
}

class Anjing extends Binatang{

    @Override
    protected void tampilSuara() {
        System.out.println("Guk Guk Guk");
    }
}

class Kucing extends Binatang{

    @Override
    protected void tampilSuara() {
        System.out.println("Meow Meow Meow");
    }
}

public class oop2 {
    public static void main (String args[]){
        Binatang dog = new Anjing();
        dog.tampilSuara();

        Binatang cat = new Kucing();
        cat.tampilSuara();
    }
}