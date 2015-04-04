package grails

import grails.transaction.Transactional

@Transactional
class EmailService {
def mailService
    def sendMail(bookInstance) {
        def authorList = Author.list() - bookInstance.author
        authorList.each {
            mailService.sendMail { Author author ->
                to author.email
                from "test@test2.com"
                subject "a book has been made"
                body "a book was made by ${bookInstance.author}"
            }
        }
    }
}
