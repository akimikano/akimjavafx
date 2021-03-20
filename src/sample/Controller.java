package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;


import java.util.Random;

public class Controller {

    @FXML
    private Button buttonCircle;

    @FXML
    private Canvas drawCanvas;

    @FXML
    void drawRandomCircle(ActionEvent event) {
         GraphicsContext gc = drawCanvas.getGraphicsContext2D();
         gc.setStroke(Color.BLACK);
         Random r = new Random();
         int x = r.nextInt(300);
         int y = r.nextInt(300);
         int cr = r.nextInt(255);
         int cg = r.nextInt(255);
         int cb = r.nextInt(255);
         gc.setFill(Color.rgb(cr, cg, cb));
         gc.fillOval(x,y, 50, 50);

    }

}
