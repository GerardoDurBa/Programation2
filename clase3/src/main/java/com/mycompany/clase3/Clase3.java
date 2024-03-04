package com.mycompany.clase3;

import books.Book;

public class Clase3 {

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 5,"Fantasía", 25);
        Book book2 = new Book("El Hombre Del Viento",3, "Aventura", 12);
        
        //Presto el libro
        book1.lendBook();
        
        System.out.println(book1.isAvailable());
        System.out.println(book2.isAvailable());
        
    }
}
