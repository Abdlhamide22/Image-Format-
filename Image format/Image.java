public class Image {
    private int width;
    private int height;
    private String format;
    private byte[] data;

    
    public Image(int width, int height, String format, byte[] data) {
        this.width = width;
        this.height = height;
        this.format = format;
        this.data = data;
    }

    
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getFormat() {
        return format;
    }

    public byte[] getData() {
        return data;
    }

    
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
