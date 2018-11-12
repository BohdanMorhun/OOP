# OOP
1) Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
Наделить его свойствами и методами. Создать несколько экземпляров объектов
этого класса. Использовать эти объекты.


public class Main1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Senya","Scotish", 2);
        cat.print();
        cat.voice();
        cat.eat("");

        Cat cat1 = new Cat("Izzya","American",4);
        cat1.setName("Laki");
        cat1.setYear(6);

        System.out.println("New name: " + cat1.getName());
        System.out.println("New age: " + cat1.getYear());
    }
}
    class Cat {
        private String name;
        private String breed;
        private int year;

    public Cat(String name,String breed, int year) {
        this.name = name;
        this.breed = breed;
        this.year = year;
    }

    public void setName(String catName){
        this.name = catName;
        }

    public String getName(){
        return name;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

 public void voice (){
    System.out.println("Meeeooow!!!");
}

 public void eat(String plate){
        if(plate.isEmpty()) {
            System.out.println("Cat is hungry!");
        } else {
            System.out.println("Cat is full!");
        }
    }
 public void print(){
    System.out.println(name);
    System.out.println(year);
    System.out.println(breed);
    }

}






