package math130.gui;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tetrimino {
    private Rectangle mino1;
    private Rectangle mino2;
    private Rectangle mino3;
    private Rectangle mino4;

    public Tetrimino() {
        this.mino1 = new Rectangle(20,20);
        this.mino2 = new Rectangle(20,20);
        this.mino3 = new Rectangle(20,20);
        this.mino4 = new Rectangle(20,20);
        mino1.setFill(Color.RED);
        mino2.setFill(Color.YELLOW);
        mino3.setFill(Color.GREEN);
        mino4.setFill(Color.BLUE);
//        GridPane.setColumnIndex(this.mino1, 4);
//        GridPane.setColumnIndex(this.mino2, 3);
//        GridPane.setColumnIndex(this.mino3, 2);
//        GridPane.setColumnIndex(this.mino4, 1);
    }
    public Rectangle getMino(int index) {
        Rectangle[] mino = {mino1,mino2,mino3,mino4};
        return mino[index];
    }
    public int[] setIShape() {
        int[] shape = {0,1,2,3};
        return shape;
    }
}
