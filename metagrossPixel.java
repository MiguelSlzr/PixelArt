package Actividad10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class metagrossPixel {
	static int width = 1360;
    static int height = 1000;
    
    static Color black = new Color(54,54,54);
    static Color softBlue = new Color(131,180,255);
    static Color darkBlue = new Color(74,106,172);
    static Color midBlue = new Color(99,140,222);
    static Color greenGray = new Color(131,131,115);
    static Color darkGray = new Color(82,82,82);
    static Color softGray = new Color(189,189,189);
    static Color white = new Color(255,255,255);
    static Color red = new Color(172,65,65);
    static Color darkRed = new Color(238,90,57);
    
    static Graphics2D g;
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    private final static int PIXEL_SIZE = 40;
    /*private final static Color[][] PIXELS = {
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.RED, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE}
    };
    */
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);     
        
        

        putPixel(6,4,softBlue);
        putPixel(5,5,softBlue);
        drawHorizontalLine(15, 20, 5, softBlue);
        drawHorizontalLine(14, 21, 6, softBlue);
        drawHorizontalLine(15, 20, 7, softBlue);
        drawVerticalLine(15, 16, 21, softBlue);
        drawVerticalLine(10, 17, 23, softBlue);
        drawHorizontalLine(22, 24, 20, softBlue);
        drawHorizontalLine(21, 25, 19, softBlue);
        drawHorizontalLine(25, 26, 18, softBlue);
        drawVerticalLine(14, 17, 24, softBlue);
        drawVerticalLine(10, 11, 24, softBlue);
        drawVerticalLine(13, 14, 22, softBlue);
        drawVerticalLine(13, 14, 25, softBlue);
        putPixel(12,26,softBlue);
        putPixel(28,5,softBlue);
        putPixel(27,4,softBlue);
        putPixel(19,17,softBlue);
        putPixel(20,18,softBlue);
        
        
        //SOMBREADO
        putPixel(10,12,darkBlue);
        putPixel(9,13,darkBlue);
        drawVerticalLine(9,10,4,darkBlue);
        drawHorizontalLine(2, 3, 11, darkBlue);
        drawHorizontalLine(4, 6, 12, darkBlue);
        drawVerticalLine(7,8,7,darkBlue);
        drawVerticalLine(15,16,12,darkBlue);
        putPixel(13,16,darkBlue);
        putPixel(14,17,darkBlue);
        putPixel(11,5,darkBlue);
        putPixel(13,6,darkBlue);
        putPixel(14,7,darkBlue);
        putPixel(21,7,darkBlue);
        putPixel(22,6,darkBlue);
        putPixel(20,14,darkBlue);
        drawHorizontalLine(15, 18, 8, darkBlue);
        drawVerticalLine(12,13,19,darkBlue);
        putPixel(18,16,darkBlue);
        putPixel(17,15,darkBlue);
        putPixel(16,14,darkBlue);
        putPixel(20,19,darkBlue);
        drawHorizontalLine(21, 23, 18, darkBlue);
        drawVerticalLine(15,18,22,darkBlue);
        drawVerticalLine(15,17,25,darkBlue);
        putPixel(26,17,darkBlue);
        putPixel(26,19,darkBlue);
        drawHorizontalLine(28, 30, 12, darkBlue);
        drawHorizontalLine(30, 31, 11, darkBlue);
        drawVerticalLine(5,9,27,darkBlue);
        drawVerticalLine(7,9,26,darkBlue);
        drawVerticalLine(4,5,26,darkBlue);
        drawVerticalLine(7,8,28,darkBlue);
        drawVerticalLine(9,10,29,darkBlue);
        drawHorizontalLine(30, 31, 11, darkBlue);
        drawHorizontalLine(29, 30, 12, darkBlue);
        putPixel(26,11,darkBlue);
        putPixel(12,2,darkBlue);
        putPixel(6,5,darkBlue);
        putPixel(5,8,darkBlue);
        putPixel(8,9,darkBlue);
        putPixel(26,4,darkBlue);
        putPixel(12,3,darkBlue);
        putPixel(10,10,greenGray);
        putPixel(11,12,greenGray);
        putPixel(11,14,greenGray);
        putPixel(14,11,greenGray);
        putPixel(16,16,greenGray);
        putPixel(20,9,greenGray);
        putPixel(16,12,greenGray);
        
        //DETALLES
        putPixel(17,12,Color.black);
        drawHorizontalLine(17, 18, 13, red);
        putPixel(18,12,darkRed);
        
        //FIGURA
        drawHorizontalLine(2, 3, 12, midBlue);
        drawHorizontalLine(3, 6, 13, midBlue);
        drawHorizontalLine(4, 6, 11, midBlue);
        drawHorizontalLine(5, 7, 10, midBlue);
        drawHorizontalLine(5, 6, 9, midBlue);
        drawVerticalLine(7,8,4,midBlue);
        drawVerticalLine(6,7,5,midBlue);
        drawVerticalLine(11,12,8,midBlue);
        drawVerticalLine(11,12,9,midBlue);
        putPixel(3,10,midBlue);
        drawHorizontalLine(12, 14, 8, midBlue);
        drawHorizontalLine(12, 13, 7, midBlue);
        drawHorizontalLine(13, 16, 9, midBlue);
        putPixel(13,10,midBlue);
        drawHorizontalLine(21, 24, 8, midBlue);
        drawHorizontalLine(22, 23, 7, midBlue);
        putPixel(22,9,midBlue);
        drawHorizontalLine(17, 19, 14, midBlue);
        drawHorizontalLine(18, 19, 15, midBlue);
        drawVerticalLine(12, 13, 20, midBlue);
        drawVerticalLine(11, 12, 21, midBlue);
        putPixel(21,17,midBlue);
        putPixel(24,18,midBlue);
        drawVerticalLine(12, 13, 24, midBlue);
        drawVerticalLine(15, 16, 26, midBlue);
        putPixel(26,12,midBlue);
        putPixel(26,6,midBlue);
        putPixel(28,6,midBlue);
        drawVerticalLine(7, 8, 29, midBlue);
        putPixel(25,7,midBlue);
        putPixel(30,10,midBlue);
        drawVerticalLine(9, 11, 28, midBlue);
        putPixel(29,11,midBlue);
        putPixel(27,10,midBlue);
        drawHorizontalLine(27, 31, 13, midBlue);
        drawHorizontalLine(28, 29, 14, midBlue);
        putPixel(31,12,midBlue);
        putPixel(2,14,softGray);
        putPixel(5,15,softGray);
        putPixel(10,14,softGray);
        putPixel(11,13,softGray);
        putPixel(19,9,softGray);
        putPixel(21,21,softGray);
        putPixel(25,21,softGray);
        putPixel(23,22,softGray);
        putPixel(30,15,softGray);
        drawVerticalLine(8,9,10,softGray);
        drawVerticalLine(9,11,11,softGray);
        drawVerticalLine(11,13,12,softGray);
        drawVerticalLine(12,14,13,softGray);
        drawVerticalLine(12,15,14,softGray);
        drawVerticalLine(11,12,15,softGray);
        drawVerticalLine(15,16,15,softGray);
        drawHorizontalLine(15, 18, 11, softGray);
        drawHorizontalLine(17, 20, 10, softGray);
    
       // DEFINICION
        putPixel(2,13,darkGray);
    	drawHorizontalLine(4, 6, 14, darkGray);
    	putPixel(11,15,darkGray);
    	putPixel(12,14,darkGray);
    	putPixel(13,15,darkGray);
    	putPixel(14,16,darkGray);
    	putPixel(15,17,darkGray);
    	putPixel(16,17,darkGray);
        putPixel(7,9,darkGray);
        putPixel(10,13,darkGray);
        putPixel(10,11,darkGray);
        putPixel(8,8,darkGray);
        putPixel(9,9,darkGray);
        putPixel(8,10,darkGray);
        putPixel(9,10,darkGray);
        drawVerticalLine(11,12,7,darkGray);
        drawVerticalLine(6,8,11,darkGray);
        drawVerticalLine(4,6,12,darkGray);
        drawVerticalLine(9,10,12,darkGray);
        drawVerticalLine(2,5,13,darkGray);
        drawVerticalLine(4,5,14,darkGray);
        putPixel(13,11,darkGray);
        drawHorizontalLine(14, 16, 10, darkGray);
        drawHorizontalLine(17, 18, 9, darkGray);
        drawHorizontalLine(19, 20, 8, darkGray);
        drawVerticalLine(9,10,21,darkGray);
        drawVerticalLine(13,14,21,darkGray);
        drawVerticalLine(10,12,22,darkGray);
        drawVerticalLine(15,17,20,darkGray);
        putPixel(19,16,darkGray);
        drawHorizontalLine(23,25,9,darkGray);
        drawVerticalLine(8,12,25,darkGray);
        drawVerticalLine(13,14,26,darkGray);
        putPixel(26,10,darkGray);
        putPixel(30,14,darkGray);
        drawVerticalLine(11,12,27,darkGray);
        drawVerticalLine(14,16,27,darkGray);
        drawHorizontalLine(15,16,13,darkGray);
        drawHorizontalLine(19,20,11,darkGray);
        putPixel(17,16,darkGray);
        drawHorizontalLine(22,24,21,darkGray);
        putPixel(21,20,darkGray);
        putPixel(25,20,darkGray);
        putPixel(13,3,darkGray);
        drawVerticalLine(6,8,6,darkGray);
        putPixel(13,2,darkGray);
        
        //CONTORNO
        drawVerticalLine(5,6,4,black);
        drawVerticalLine(7,9,3,black);
        putPixel(2,10,black);
        drawVerticalLine(11,14,1,black);
        putPixel(2,15,black);
        putPixel(3,14,black);
        putPixel(4,15,black);
        putPixel(5,16,black);
        putPixel(6,15,black);
        drawVerticalLine(13,14,7,black);
        drawVerticalLine(4,6,7,black);
        putPixel(8,7,black);
        putPixel(9,8,black);
        drawVerticalLine(5,7,10,black);
        drawVerticalLine(2,4,11,black);
        drawHorizontalLine(15, 20, 4, black);
        drawHorizontalLine(21, 22, 5, black);
        putPixel(23,6,black);
        putPixel(24,7,black);
        drawVerticalLine(4,6,25,black);
        drawVerticalLine(5,6,29,black);
        drawVerticalLine(7,9,30,black);
        putPixel(31,10,black);
        drawVerticalLine(11,13,32,black);
        drawVerticalLine(14,15,31,black);
        putPixel(30,16,black);
        putPixel(29,15,black);
        drawVerticalLine(15,16,28,black);
        drawVerticalLine(17,19,27,black);
        drawVerticalLine(20,21,26,black);
        drawHorizontalLine(24, 25, 22, black);
        drawHorizontalLine(23, 24, 23, black);
        drawHorizontalLine(21, 22, 22, black);
        drawVerticalLine(20,21,20,black);
        drawVerticalLine(18,19,19,black);
        drawHorizontalLine(17, 18, 17, black);
        drawHorizontalLine(14, 16, 18, black);
        drawHorizontalLine(12, 13, 17, black);
        putPixel(8,13,black);
        putPixel(9,14,black);
        putPixel(10,15,black);
        putPixel(11,16,black);
        drawHorizontalLine(12, 13, 1, black);
        putPixel(11,2,black);
        putPixel(14,2,black);
        putPixel(11,3,black);
        putPixel(14,3,black);
        putPixel(6,3,black);
        putPixel(7,3,black);
        putPixel(26,3,black);
        putPixel(27,3,black);
        putPixel(5,4,black);
        putPixel(7,4,black);
        putPixel(25,4,black);
        putPixel(28,4,black);
        
        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("metagross_art.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public static void main(String[] args) {
		g = image.createGraphics();        
        paint();
	}
	
	private static void drawVerticalLine(int a, int b, int x, Color c){
    	for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
        for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    
    private static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    private static void drawBackground(int size, Color c) {
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }

}