package math130.gui;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static java.awt.Color.red;

public class Mino {
    private Rectangle mino;

    public Mino() {
        this.mino = new Rectangle();
        mino.setHeight(20.0);
        mino.setWidth(20.0);
        mino.setFill(Color.RED);
    }

}
