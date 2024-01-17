package JavaOOP;

import java.util.Scanner;

public class Animal {
    public String name;
    public int age;
    public void makeSound(){

    }
    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Name and Age: " + this.name + " " + this.age);
            System.out.println("Dog Sound: Gau Gau ");
            super.makeSound();
        }
    }
    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Name and Age: " + this.name + " " + this.age);
            System.out.println("Cat Sound: Meow Meow");
            super.makeSound();
        }
    }
    public static void main(String[] args) {
        Animal.Dog dog = new Dog();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name and Age of the dog: ");
        dog.name = sc.nextLine();
        dog.age = sc.nextInt();
        dog.makeSound();
        Animal.Cat cat = new Cat();
        System.out.println("Enter the Name and Age of the cat :");
        cat.name = sc.nextLine();
        cat.age = sc.nextInt();
        cat.makeSound();
    }
}
