package ie.tudublin;

import processing.core.PApplet;

public class newprocessing extends PApplet {

    public void settings() {
        size(500, 500);
    }

    public void draw() {
        float x1, x2, y1, y2, z;
        x1 = 10;
        x2 = 10;
        y1 = 100;
        y2 = 100;
        z = 200;
        background(255, 0, 0);
        fill(255, 255, 0);
        circle(250, 250, 420);
        fill(0, 255, 255);
        triangle(40, 440, 460, 440, 250, 40);
        fill(200);
        ellipse(250, 200, 160, 75);[]
        fill(0);
        circle(250, 200, 50);
        image(loadImage("\"C:\\Users\\aidan\\Downloads\\donkey.jpg\""), 0, 0, 50);
    }

    public void main() {
        draw();
    }
}
