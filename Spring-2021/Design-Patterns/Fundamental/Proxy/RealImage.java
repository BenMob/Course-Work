package Proxy;

public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        this.loadFromDisk(this.fileName);
    }

    @Override
    public void display(){
        System.out.println("Displaying " + this.fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}