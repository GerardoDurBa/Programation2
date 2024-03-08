package com.mycompany.clase3;

import books.Book;

public class Clase3 {

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "Fantasía","¿?", 2, 78,"16/12/23","Fruntusio Federal","16/05/24");
        Book book2 = new Book("Sangre de campeòn", "Acciòn","¿?", 1, 93,"17/02/24","Federico Fernandez ","17/07/24");
        
        //Presto el libro
        System.out.println("Libro 1:");
        book1.lendBook();
        System.out.println(book1.isAvailable());
        System.out.println(book1.getTitle());
        System.out.println(book1.getGenre());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getAmmount());
        System.out.println(book1.getId());
        System.out.println(book1.getLoanDate());
        System.out.println(book1.getUser());
        System.out.println(book1.getReturnDate());
        System.out.println("Libro 2:");
        System.out.println(book2.isAvailable());
        
    }
}
