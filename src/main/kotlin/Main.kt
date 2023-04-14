///Project: Simple Library Management System
//The goal of this project is to create a Simple Library Management System
// that allows users to manage a collection of books by
// adding, removing, and listing them. You will be working with Kotlin concepts like variables,
// data types, arrays, array methods, strings, string methods, functions, and classes
fun main(){
//adding books
    println("ORIGINAL LIST")
    var library= Library()
        library.addBooks("born a crime","trevor noah",124)
    library.addBooks("think big","ben carson",250)
    library.addBooks("decolonising mind","ngugi",160)
    library.addBooks("journey to the moon","joyce mumbi",344)

    //listing books
    library.bookList()

    //removing books
    library.removeBook("journey to the moon")
println("NEW LIST")
    //listing again
    library.bookList()
}

data class Book(var title:String, var author:String, var pages:Int)

//library class
class Library{
    var books= mutableListOf<Book>()

    //ADDING BOOKS
    fun addBooks(title: String,author: String,pages: Int){
        var book1=Book(title,author,pages)
        books.add(book1)
    }

    //REMOVE BOOK
    fun removeBook(title: String){
        var bookRemoved= books.find { it.title==title }
        books.remove(bookRemoved)
    }
    //LIST ALL BOOKS

    fun bookList(){
        for (book in books){
            println(book)
        }
    }
}