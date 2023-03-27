package Actividad10;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class DibujaArtBol {

    public static void main(String[] args) {
        int width = 600;
        int height = 400;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();

        // Dibuja el cielo
        GradientPaint gradient = new GradientPaint(0, 0, Color.CYAN, 0, height, Color.BLUE);
        g2.setPaint(gradient);
        g2.fillRect(0, 0, width, height / 2);

        // Dibuja el pasto
        g2.setColor(Color.GREEN);
        g2.fillRect(0, height / 2, width, height / 2);

        // Dibuja el tronco del Ã¡rbol
        g2.setColor(new Color(139, 69, 19));
        g2.fillRect(300, 250, 50, 150);

        // Dibuja las hojas del Ã¡rbol
        g2.setColor(new Color(50, 200, 19));
        g2.fillOval(200, 200, 150, 100);
        g2.fillOval(250, 150, 150, 100);
        g2.fillOval(300, 200, 150, 100);

        // Guarda la imagen en un archivo JPEG
        try {
            File outputfile = new File("arbol_en_jardin.jpg");
            ImageIO.write(image, "jpg", outputfile);
            System.out.println("Todo bien");
        } catch (IOException e) {
            System.out.println("Error al guardar la imagen: " + e.getMessage());
        }
    }
}