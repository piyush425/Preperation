package DesignPattern.Creational.PrototypePattern;

public class Document implements Cloneable{

    public String title;
    public String content;
    public String footer;

    public Document(String title, String content, String footer) {
        this.title = title;
        this.content = content;
        this.footer = footer;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Footer: " + footer);
    }


}
