package MacineCodingPractice.Document;

import java.util.HashMap;
import java.util.Map;

public class DocumentService {

    Map<String,Document> dcoumentInfo;


    public DocumentService() {
        this.dcoumentInfo = new HashMap<>();
    }

    public  void createDocument(User owner,String name,String content){
        if(dcoumentInfo.containsKey(name)){
            System.out.println("Alraedy exist");
            return;
        }
        dcoumentInfo.put(name,new Document(name,content,owner));
        System.out.println("Document suucessfully vreated");
    }

    public void  addAccess(User owner, String name, User targetUser, String accessType ){
        Document document=dcoumentInfo.get(name);

        if(!document.getOwner().equals(owner)){
            System.out.println("only document owner can give accesss");
            return;
        }

        document.getAccessInfo().put(targetUser,accessType);
        System.out.println("suucesfully given the access");
    }





}
