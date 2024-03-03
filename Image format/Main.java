import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) {
        
        String imagePath = "-22surp.jpg";

        try {
            
            BufferedImage image = ImageIO.read(new File(imagePath));

            
            displayImage(image);
        } catch (IOException e) {
            System.out.println("حدث خطأ أثناء قراءة الصورة: " + e.getMessage());
        }
    }

    
    private static void displayImage(BufferedImage image) {
        
        System.out.println("تم عرض الصورة بنجاح!");
    }
}
