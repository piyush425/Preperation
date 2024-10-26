package DesignPattern.Structural.ProxyPattern;

public class ProxyRealImage implements Image {
    RealImage realImage;
    public String fileName;

    public ProxyRealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage==null){
            realImage=new RealImage(fileName);
        }
        realImage.display();
    }
}
