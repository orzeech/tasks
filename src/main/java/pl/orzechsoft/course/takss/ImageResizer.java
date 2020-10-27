package pl.orzechsoft.course.takss;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.imgscalr.Scalr;

public class ImageResizer {

  public static void main(String[] args) {
    BufferedImage img = null;
    try {
      img = ImageIO.read(new File("strawberry.jpg"));
      BufferedImage bufferedImage = simpleResizeImage(img, 200);
      File outputfile = new File("resized_strawberry.jpg");
      ImageIO.write(bufferedImage, "jpg", outputfile);
    } catch (IOException e) {
      System.out.println("Couldn't read the file!! Message " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Something wrong with resizing!!");
    }
  }

  private static BufferedImage simpleResizeImage(BufferedImage originalImage, int targetWidth)
      throws Exception {
    return Scalr.resize(originalImage, targetWidth);
  }

}
