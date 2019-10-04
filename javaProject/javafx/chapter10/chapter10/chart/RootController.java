package chapter10.chart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.image.*;


public class RootController implements Initializable {
	@FXML private PieChart pieChart;
	@FXML private BarChart barChart;
	@FXML private AreaChart areaChart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//파이차트 ObservableList 데이터 입력과 연결 -> 리스트(PieChart.Data)-> 파이차트.setData(리스트)
		ObservableList<PieChart.Data> pcl=FXCollections.observableArrayList();
		pcl.add(new PieChart.Data("AWT", 10));
		pcl.add(new PieChart.Data("Swing", 30));
		pcl.add(new PieChart.Data("SWT", 25));
		pcl.add(new PieChart.Data("JAVAFX", 15));
		pieChart.setData(pcl);
		
		//바차트-> 리스트(XYChart.Data)
		ObservableList<XYChart.Data> bcl=FXCollections.observableArrayList();
		bcl.add(new XYChart.Data("2015", 70));
		bcl.add(new XYChart.Data("2016", 90));
		bcl.add(new XYChart.Data("2017", 40));
		bcl.add(new XYChart.Data("2018", 60));
		XYChart.Series s1 = new XYChart.Series();
		s1.setName("남자");
		s1.setData(bcl);
		barChart.getData().add(s1);
		
		ObservableList<XYChart.Data> bcl2=FXCollections.observableArrayList();
		bcl2.add(new XYChart.Data("2015", 40));
		bcl2.add(new XYChart.Data("2016", 60));
		bcl2.add(new XYChart.Data("2017", 90));
		bcl2.add(new XYChart.Data("2018", 70));
		XYChart.Series s2 = new XYChart.Series();
		s2.setName("여자");
		s2.setData(bcl2);
		barChart.getData().add(s2);
		
		ObservableList<XYChart.Data> bcl3=FXCollections.observableArrayList();
		bcl3.add(new XYChart.Data("2015", 16));
		bcl3.add(new XYChart.Data("2016", 6));
		bcl3.add(new XYChart.Data("2017", 22));
		bcl3.add(new XYChart.Data("2018", 19));
		XYChart.Series s3 = new XYChart.Series();
		s3.setName("평균온도");
		s3.setData(bcl3);
		areaChart.getData().add(s3);

	}
}
