package exercise3;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ResultController {
    private final Random random = new Random();

    public void generateGreetingCard(CheckBox balloons, CheckBox hearts, CheckBox stars) {
            Group root = new Group();
            List<String> selected = new ArrayList<>();
            if (balloons.isSelected()) selected.add("balloon");
            if (hearts.isSelected()) selected.add("heart");
            if (stars.isSelected()) selected.add("star");

            for (int i = 0; i < 50; i++) {
                if (!selected.isEmpty()) {
                    String shape = selected.get(random.nextInt(selected.size()));
                    Shape s = generateShape(shape);
                    s.setTranslateX(random.nextDouble() * (570));
                    s.setTranslateY(random.nextDouble() * (370));
                    root.getChildren().add(s);
                }
            }

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
        }


        private Shape generateShape(String type) {
            switch (type) {
                case "balloon":
                    Ellipse balloon = new Ellipse(15, 20);
                    balloon.setFill(Color.web(randomColor()));
                    return balloon;
                case "heart":
                    Path heart = new Path();
                    heart.getElements().addAll(
                            new MoveTo(10, 10),
                            new CubicCurveTo(10, 0, 0, 0, 0, 10),
                            new CubicCurveTo(0, 20, 10, 25, 10, 30),
                            new CubicCurveTo(10, 25, 20, 20, 20, 10),
                            new CubicCurveTo(20, 0, 10, 0, 10, 10)
                    );
                    heart.setFill(Color.RED);
                    return heart;
                case "star":
                    Polygon star = new Polygon();
                    double centerX = 15, centerY = 15, radius = 10;
                    for (int i = 0; i < 10; i++) {
                        double angle = Math.PI / 5 * i;
                        double r = (i % 2 == 0) ? radius : radius / 2.5;
                        star.getPoints().addAll(
                                centerX + r * Math.cos(angle),
                                centerY + r * Math.sin(angle)
                        );
                    }
                    star.setFill(Color.GOLD);
                    return star;
            }
            return null;
        }

        private String randomColor() {
            String[] colors = {"#FF69B4", "#87CEEB", "#FFD700", "#ADFF2F", "#FFA07A"};
            return colors[random.nextInt(colors.length)];
        }
}
