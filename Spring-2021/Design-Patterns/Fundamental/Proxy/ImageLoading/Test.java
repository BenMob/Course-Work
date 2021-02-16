package ImageLoading;

public class Test{

    public static void main(String[] args){
        Image image = new ImageProxy("image001.png");
        System.out.println("------------- Had to load the image file first ---------------");
        image.display();
        System.out.println("------------- Did not have to load the image this time ---------------");
        image.display();

    }
}