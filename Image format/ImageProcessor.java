import java.awt.image.BufferedImage;

public class ImageProcessor {
    
     
    public static BufferedImage processImage(BufferedImage image, int newWidth, int newHeight) {
        
        BufferedImage blackAndWhiteImage = ImageUtils.convertToBlackAndWhite(image);
        
        
        BufferedImage resizedImage = ImageUtils.resizeImage(blackAndWhiteImage, newWidth, newHeight);
        
        return resizedImage;
    }
}
