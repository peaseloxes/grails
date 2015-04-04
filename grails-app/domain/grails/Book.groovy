package grails

class Book {
    String title
    String isbn
    static belongsTo = [author: Author]
    static constraints = {
    }
}
