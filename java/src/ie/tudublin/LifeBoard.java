package ie.tudublin;

import processing.core.PApplet;
import java.lang.Math;

public class LifeBoard {
    boolean[][] board;

    int rows;
    int cols;

    float cellwidth;
    float cellheight;

    PApplet p;

    public LifeBoard(int cols, PApplet p)
    {
        this.cols = cols;
        this.p = p;

        cellwidth = p.width / (float) cols;
        rows = (int) Math.ceil(p.height/cellwidth);
        System.out.println("floor(" + p.height + "/" + cellwidth + ") = " + cols);
        System.out.println(p.width + " / " + cols + " = " + cellwidth);
        System.out.println(rows + " " + cols);
        cellheight = p.height / (float) rows;

        board = new boolean[rows][cols];
    }

    void randomize()
    {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                float rand = p.random(1.0f);
                board[row][col] = (rand < 0.5f);
            }
        }
    }

    public void update()
    {

    }

    public boolean getState(int row, int col) {
        return board[row][col];
    }

    public void render()
    {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col]) p.fill(255);
                else p.fill(0);
                p.rect(col*cellwidth, row*cellwidth, cellwidth, cellwidth);
            }
        }
    }
}
