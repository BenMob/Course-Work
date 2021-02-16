package ImageLoading;


public class ImageProxy implements Image{
    private RealImage realImage;
    private String fileName;

    public ImageProxy(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display(){
        if(this.realImage == null){
            this.realImage = new RealImage(this.fileName);
        }
        this.realImage.display();
    }
}