package DesignPattern.Creational.PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {

    Map<String,Document> map=new HashMap<>();

    public DocumentRegistry() {
        map.put("Employee",new EmployeDocument());
        map.put("Office",new OfficeDocument());
    }

    public Document getClonedDocument(String doc) throws CloneNotSupportedException {
        return (Document) map.get(doc).clone();
    }

    public Document getDocument(String doc){
        return  map.get(doc);
    }
}


