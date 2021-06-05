
public class Animal {
public void eat() {
System.out.println("Animal eats differnt type of food");
}
}

//Child class
class Cat extends Animal {
public void eat() {
System.out.println("Cat eats meat  ");
}
}

class MainClass {
public static void main(String[] args) {
Animal animal = new Animal();
Animal cat = new Cat(); 
animal.eat(); 
cat.eat(); 
}
}
