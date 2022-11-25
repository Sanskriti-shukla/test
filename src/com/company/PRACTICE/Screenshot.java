package com.company.PRACTICE;


    import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;

    public class Screenshot {
        public static final long serialVersionUID = 1L;
        public static void main(String[] args)
        {
            try {
                Thread.sleep(120);
                Robot r = new Robot();

                // It saves screenshot to desired path
                String path = "C:\\Users\\TRPC05\\Desktop\\bubble-1.1\\Test project\\Shot1.jpeg";

                // Used to get ScreenSize and capture image
                Rectangle capture =
                        new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                BufferedImage Image = r.createScreenCapture(capture);
                ImageIO.write(Image, "jpeg", new File(path));
                System.out.println("Screenshot saved");
            }
            catch (AWTException | IOException | InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }