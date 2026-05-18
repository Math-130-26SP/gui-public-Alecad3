package math130.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private GridPane grid;
    private int col[] = new int[4];
    private int row[] = new int[4];
    public boolean playing;
    @FXML
    private Tetrimino block = new Tetrimino();

    @FXML
    protected void onMoveRight() {
        for (int i = 0; i < col.length; i++) {
            col[i] = GridPane.getColumnIndex(block.getMino(i));
            if (col[i] < 9) {
                GridPane.setColumnIndex(block.getMino(i), col[i] + 1);
            }
            //col[i] = GridPane.getColumnIndex(block.getMino(i));
        }
    }
    @FXML
    protected void onMoveLeft() {
        for (int i = 0; i < col.length; i++) {
            col[i] = GridPane.getColumnIndex(block.getMino(i));
            if (col[0] > 0&&col[1] > 0&&col[2] > 0&&col[3] > 0) {
                GridPane.setColumnIndex(block.getMino(i), col[i] - 1);
            }
            //col[i] = GridPane.getColumnIndex(block.getMino(i));
        }

    }
    @FXML
    public void onDrop() {
        for (int i = 0; i < row.length; i++) {
            row[i] = GridPane.getRowIndex(block.getMino(i));
            if (row[i] < 19) {
                GridPane.setRowIndex(block.getMino(i), row[i] + 1);
            }
            row[i] = GridPane.getRowIndex(block.getMino(i));
        }
    }
    @FXML
    public void onSpawn() {
        block = new Tetrimino();
        grid.add(block.getMino(0),0,0);
        grid.add(block.getMino(1),0,1);
        grid.add(block.getMino(2),1,0);
        grid.add(block.getMino(3),1,1);
    }
}