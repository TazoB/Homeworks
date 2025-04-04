package davaleba1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.awt.*;
import java.lang.reflect.Method;

public class CircleGameController {
    @FXML
    private Circle circle;
    private static final int[] colors = {1,2,3,4,5,6,7};
    private static int index = 1;

    public void up() {
        circle.setCenterY(circle.getCenterY() - 10);
    }

    public void down() {
        circle.setCenterY(circle.getCenterY() + 10);
    }

    public void right() {
        circle.setCenterX(circle.getCenterX() + 10);
    }

    public void left() {
        circle.setCenterX(circle.getCenterX() - 10);
    }

    public void upRight() {
        circle.setCenterX(circle.getCenterX() + 5);
        circle.setCenterY(circle.getCenterY() - 5);
    }

    public void upLeft() {
        circle.setCenterX(circle.getCenterX() - 5);
        circle.setCenterY(circle.getCenterY() - 5);
    }

    public void downRight() {
        circle.setCenterX(circle.getCenterX() + 5);
        circle.setCenterY(circle.getCenterY() + 5);
    }

    public void downLeft() {
        circle.setCenterX(circle.getCenterX() - 5);
        circle.setCenterY(circle.getCenterY() + 5);
    }

    public void changeColor() {
        switch (index) {
            case 1:
                colorRed();
                break;
            case 2:
                colorBlue();
                break;
            case 3:
                colorGreen();
                break;
            case 4:
                colorOrange();
                break;
            case 5:
                colorPink();
                break;
            case 6:
                colorYellow();
                break;
            default:
                colorBlack();
        }
        if(index == 7) {
            index = 0;
        }
        index++;
    }

    private void colorRed() {
        circle.setFill(Color.RED);
    }

    private void colorBlue() {
        circle.setFill(Color.BLUE);
    }

    private void colorGreen() {
        circle.setFill(Color.GREEN);
    }

    private void colorYellow() {
        circle.setFill(Color.YELLOW);
    }

    private void colorOrange() {
        circle.setFill(Color.ORANGE);
    }

    private void colorPink() {
        circle.setFill(Color.PINK);
    }

    private void colorBlack() {
        circle.setFill(Color.BLACK);
    }
}
