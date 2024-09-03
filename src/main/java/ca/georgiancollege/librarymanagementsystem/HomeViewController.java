package ca.georgiancollege.librarymanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HomeViewController {
    @FXML
    private LineChart<String, Number> lineChart;

    @FXML
    private VBox lineChartSection;

    @FXML
    private Label numOfAvailableBooks;

    @FXML
    private Label numOfLoanBooks;

    @FXML
    private Label numOfMembers;

    @FXML
    private Label numOfOverdueBooks;

    @FXML
    private VBox numSection1;

    @FXML
    private VBox numSection2;

    @FXML
    private VBox numSection3;

    @FXML
    private VBox numSection4;

    @FXML
    private PieChart pieChart;

    @FXML
    private VBox pieChartSection;

    public void initialize(){
        numOfMembers.setText("345");
        numOfLoanBooks.setText("256");
        numOfAvailableBooks.setText("125,783");
        numOfOverdueBooks.setText("23");

        // Example data points for the chart
        ObservableList<XYChart.Data<String, Number>> data = FXCollections.observableArrayList(
                new XYChart.Data<>("January", 120),
                new XYChart.Data<>("February", 150),
                new XYChart.Data<>("March", 170),
                new XYChart.Data<>("April", 140),
                new XYChart.Data<>("May", 160),
                new XYChart.Data<>("June", 130)
        );

        // Create a series to hold the data
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Books Borrowed");
        series.setData(data);

        // Add the series to the chart
        lineChart.getData().add(series);

        // Create fake data for the PieChart
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Fiction", 200),
                new PieChart.Data("Non-Fiction", 150),
                new PieChart.Data("Science", 100),
                new PieChart.Data("History", 120),
                new PieChart.Data("Biography", 80)
        );

        // Assign the data to the PieChart
        pieChart.setData(pieChartData);
        pieChart.setTitle("Book Category Distribution");
    }
}
