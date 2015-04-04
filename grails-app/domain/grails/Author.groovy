package grails

class Author {
    String name
    String email
    static hasMany = [books : Book]
    static constraints = {
        email(email:true, unique: true)
    }

    String toString(){
        "${name} (${email})"
    }
}
