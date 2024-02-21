package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet{
    
    LifeBoard l;
    float tint;

    
    public void settings() {
        //size(500, 500);
        fullScreen();
    }


    public void setup() {
        l = new LifeBoard(1000, this);
        tint = 0;
    }
    
    public void draw() {
        l.randomize();
        l.render();
        tint(255, tint);
        tint = tint + 2f;
        System.out.println(tint);
        image(loadImage("C:\\Users\\aidan\\Downloads\\donkey.jpg"), 0, 0);
    }
}
