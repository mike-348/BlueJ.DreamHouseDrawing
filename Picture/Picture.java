
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Triangle tree;
    private Square garage;
    private Square wall1;
    private Triangle roof1;
    private Square trunk;
    private Circle moon;
    private Circle earth;
    private Circle earth1;
    private Square space;
    private Circle earth2;
    private Square door;
    private Square window1;
    private Square doorknob;
    private Circle ufo;
    private Circle ufowindow;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        space = new Square();
        space.moveVertical(-200);
        space.moveHorizontal(-100);
        space.changeColor("black");
        space.changeSize(100000000);
        space.makeVisible();
        
        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(180);
        sun.moveVertical(-30);
        sun.changeSize(60);
        sun.makeVisible();
        
        earth = new Circle();
        earth.changeColor("green");
        earth.moveHorizontal(180);
        earth.moveVertical(-20);
        earth.changeSize(30);
        earth.makeVisible();
        
        earth1 = new Circle();
        earth1.changeColor("green");
        earth1.moveHorizontal(200);
        earth1.moveVertical(-30);
        earth1.changeSize(30);
        earth1.makeVisible();
        
        earth2 = new Circle();
        earth2.changeColor("green");
        earth2.moveHorizontal(210);
        earth2.moveVertical(5);
        earth2.changeSize(20);
        earth2.makeVisible();
        
        moon = new Circle();
        moon.changeColor("lightgray");
        moon.moveHorizontal(-110);
        moon.moveVertical(150);
        moon.changeSize(500);
        moon.makeVisible();
        
        wall = new Square();
        wall.changeColor("magenta");
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        
        
        wall1 = new Square();
        wall1.changeColor("magenta");
        wall1.moveVertical(110);
        wall1.moveHorizontal(115);
        wall1.changeSize(70);
        wall1.makeVisible();
        
        
        garage = new Square();
        garage.changeColor("yellow");
        garage.moveVertical(130);
        garage.moveHorizontal(125);
        garage.changeSize(50);
        garage.makeVisible();
        

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.changeSize(25);
        window.makeVisible();
        
        window1 = new Square();
        window1.changeColor("yellow");
        window1.moveHorizontal(60);
        window1.moveVertical(100);
        window1.changeSize(25);
        window1.makeVisible();
        
        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(30);
        door.changeSize(40);
        door.moveVertical(140);
        door.makeVisible();
        
        doorknob = new Square();
        doorknob.changeColor("orange");
        doorknob.moveHorizontal(60);
        doorknob.changeSize(5);
        doorknob.moveVertical(160);
        doorknob.makeVisible();

        roof = new Triangle();
        roof.changeColor("orange");
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();
        
        roof1 = new Triangle();
        roof1.changeColor("orange");
        roof1.changeSize(40, 100);
        roof1.moveHorizontal(160);
        roof1.moveVertical(110);
        roof1.makeVisible();
        
        
        trunk = new Square();
        trunk.changeColor("darkgray");
        trunk.changeSize(20);
        trunk.moveHorizontal(200);
        trunk.moveVertical(180);
        trunk.makeVisible();
        
        
        tree = new Triangle();
        tree.changeColor("cyan");
        tree.changeSize(70, 40);
        tree.moveHorizontal(220);
        tree.moveVertical(150);
        tree.makeVisible();
        
        ufo = new Circle();
        ufo.changeColor("darkgray");
        ufo.moveHorizontal(140);
        ufo.moveVertical(150);
        ufo.changeSize(80);
        ufo.makeVisible();
        
        ufowindow = new Circle();
        ufowindow.changeColor("yellow");
        ufowindow.moveHorizontal(150);
        ufowindow.moveVertical(160);
        ufowindow.changeSize(30);
        ufowindow.makeVisible();
        
        

        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
