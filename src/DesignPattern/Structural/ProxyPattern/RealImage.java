package DesignPattern.Structural.ProxyPattern;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadRealImage();
    }

    private void loadRealImage() {
        System.out.println("Load Real Image : "+ fileName);
    }

    @Override
    public void display() {

        System.out.println("Real Image Is DISPLAYIG");

    }
}
