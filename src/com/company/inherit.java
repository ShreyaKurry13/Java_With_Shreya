package com.company;

class Book {
    public void display(){

        System.out.println("This is a parent class of book");

    }
}

    class Reference_Book extends Book {


        public void display(){

            System.out.println("This is a child class of Reference_Book");

        }

        public static void main(String args[]){

            Reference_Book obj1= new Reference_Book();

            obj1.display();

        }

    }

    class Magazine extends Book {
        public void display(){

            System.out.println("This is a child class of Magazine");

        }

        public static void main(String args[]){

            Magazine obj2 = new Magazine();

            obj2.display();

        }

    }

