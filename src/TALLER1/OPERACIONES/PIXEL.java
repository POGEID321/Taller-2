
package TALLER1.OPERACIONES;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

public class PIXEL {
    public int PixelCanalR(int x, int y)
    {
        int VPIXELRED = 0;
        try{
            InputStream input = new FileInputStream("MULTIVERSO.jpg");
            ImageInputStream imageInput = ImageIO.createImageInputStream(input);
            BufferedImage imagenL = ImageIO.read(imageInput);
            
            int PIXEL = imagenL.getRGB(x, y);
            
            Color VR = new Color (PIXEL);
            
            VPIXELRED = VR.getRed();
       
        }catch(IOException e){}
        return VPIXELRED;
    }

     public int PixelCanalB(int x, int y)
    {
        int VPIXELBLUE = 0;
        try{
            InputStream input = new FileInputStream("MULTIVERSO.jpg");
            ImageInputStream imageInput = ImageIO.createImageInputStream(input);
            BufferedImage imagenL = ImageIO.read(imageInput);
            
            int PIXEL = imagenL.getRGB(x, y);
            
            Color VB = new Color (PIXEL);
            
            VPIXELBLUE = VB.getBlue();
       
        }catch(IOException e){}
        return VPIXELBLUE;
    }
      public int PixelCanalG(int x, int y)
    {
        int VPIXELGREEN = 0;
        try{
            InputStream input = new FileInputStream("MULTIVERSO.jpg");
            ImageInputStream imageInput = ImageIO.createImageInputStream(input);
            BufferedImage imagenL = ImageIO.read(imageInput);
            
            int PIXEL = imagenL.getRGB(x, y);
            
            Color VG = new Color (PIXEL);
            
            VPIXELGREEN = VG.getGreen();
       
        }catch(IOException e){}
        return VPIXELGREEN;
    }
}
