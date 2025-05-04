package MacineCodingPractice.Document;

import java.util.HashMap;
import java.util.Map;

public class Document {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Map<User, String> getAccessInfo() {
        return accessInfo;
    }

    public void setAccessInfo(Map<User, String> accessInfo) {
        this.accessInfo = accessInfo;
    }

    private String name;

    private String content;

    private User owner;

    private Map<User,String> accessInfo;


    public Document(String name, String content, User owner) {
        this.name = name;
        this.content = content;
        this.owner = owner;
        this.accessInfo=new HashMap<>();
    }

    public boolean isHavingReadAccess(User user){

        return user.equals(owner) || accessInfo.get(user).equals("READ") || accessInfo.get(user).equals("EDIT");

    }

    public boolean isHavingEditAccess(User user){

        return user.equals(owner) || accessInfo.get(user).equals("EDIT");

    }
}
