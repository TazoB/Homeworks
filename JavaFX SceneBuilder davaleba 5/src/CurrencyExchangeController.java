import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class CurrencyExchangeController implements Initializable {
    @FXML
    public ChoiceBox<String> currentCurrency;
    @FXML
    public ChoiceBox<String> calculatedCurrency;
    @FXML
    public Spinner<Double> currentValue;
    @FXML
    public Label calculatedValue;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[] currencies = {"GEL", "USD", "EUR", "GBP"};
        currentCurrency.getItems().addAll(currencies);
        calculatedCurrency.getItems().addAll(currencies);

        currentCurrency.setOnAction(this::calculate);
        calculatedCurrency.setOnAction(this::calculate);

        currentValue.setPromptText("value");
        SpinnerValueFactory<Double> valueFactory =
                new SpinnerValueFactory.DoubleSpinnerValueFactory(0, Integer.MAX_VALUE, 0, 0.5);
        currentValue.setValueFactory(valueFactory);

        currentValue.setEditable(true);

        currentValue.valueProperty().addListener((obs, oldVal, newVal) -> {
            calculate(new ActionEvent());
        });
    }

    public void calculate(ActionEvent actionEvent) {
        if(currentCurrency.getValue() != null && calculatedCurrency.getValue() != null) {
            currentValue.setDisable(false);
            try {
                double CValue = currentValue.getValue();
                double result = Math.round(calculateValue(CValue) * 100);
                result /= 100;
                calculatedValue.setText(String.valueOf(result));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private double calculateValue(double value) {
        HashMap<String, Double> currencies = new HashMap<>(
                Map.of(
                        "GEL", 1.0,
                        "USD", 0.36078,
                        "EUR", 0.31327,
                        "GBP", 0.26956
                )
        );

        String str1 = currentCurrency.getValue();
        String str2 = calculatedCurrency.getValue();

        return value * currencies.get(str2) / currencies.get(str1);
    }
}
