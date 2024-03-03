import java.awt.image.BufferedImage;

public class ImageUtils {
    
    
    public static BufferedImage convertToBlackAndWhite(BufferedImage image) {
        BufferedImage result = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_BINARY);
        result.getGraphics().drawImage(image, 0, 0, null);
        return result;
    }
    
    
    public static BufferedImage resizeImage(BufferedImage image, int newWidth, int newHeight) {
        BufferedImage result = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        result.getGraphics().drawImage(image.getScaledInstance(newWidth, newHeight, java.awt.Image.SCALE_SMOOTH), 0, 0, null);
        return result;
    }
}
