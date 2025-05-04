package MacineCodingPractice.Document;

public class DocumentMain {

    public static void main(String[] args) {

        DocumentService documentService=new DocumentService();

        User user=new User("Piyush");


        User user2=new User("Ranjan");

        documentService.createDocument(user,"abcDocument","abcd");

        documentService.createDocument(user2,"abcDocument2","abcd2");

        documentService.addAccess(user2,"abcDocument2",user,"EDIT");

    }
}
