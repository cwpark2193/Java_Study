package chapter10.view_control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML private ListView<String> lv;
	@FXML private TableView<Phone> tv;
	@FXML private ImageView iv;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		insertListViewItemAndEventProcess();
		insertTableViewItemAndEventProcess();
	}

	private void insertTableViewItemAndEventProcess() {
		ObservableList<Phone> tvData=FXCollections.observableArrayList();
		tvData.add(new Phone("S1", "phone01.png"));
		tvData.add(new Phone("S2", "phone02.png"));
		tvData.add(new Phone("S3", "phone03.png"));
		tvData.add(new Phone("S4", "phone04.png"));
		tvData.add(new Phone("S5", "phone05.png"));
		tvData.add(new Phone("S6", "phone06.png"));
		tvData.add(new Phone("S7", "phone07.png"));
		
		TableColumn tcSmartPhone = tv.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx-alignment: CENTER;");
		
		TableColumn tcImage = tv.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-alignment: CENTER;");
		
		tv.setItems(tvData);
		tv.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				Image images = new Image(getClass().getResource("Images/"+newValue.getImage()).toString());
				iv.setImage(images);
			}
		});
	}

	private void insertListViewItemAndEventProcess() {
		ObservableList<String> lvData=FXCollections.observableArrayList();
		lvData.add("°¶·°½Ã S1"); lvData.add("°¶·°½Ã S2");
		lvData.add("°¶·°½Ã S3"); lvData.add("°¶·°½Ã S4");
		lvData.add("°¶·°½Ã S5"); lvData.add("°¶·°½Ã S6");
		lvData.add("°¶·°½Ã S7");
		
		lv.setItems(lvData);
		lv.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				tv.getSelectionModel().select(newValue.intValue());
				tv.scrollTo(newValue.intValue());
			}
		});
	}
	public void handlerButtonOkAction(ActionEvent event) {
		String data = lv.getSelectionModel().getSelectedItem();
		System.out.println("¼±ÅÃµÈ Æù : "+data);
		Phone phone = tv.getSelectionModel().getSelectedItem();
		System.out.println("Æù Á¤º¸ : "+phone);
	}
	public void handlerButtonExitAction(ActionEvent event) {
		Platform.exit();
	}
}