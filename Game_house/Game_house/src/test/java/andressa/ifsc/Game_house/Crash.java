package andressa.ifsc.Game_house;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Crash extends Application{
	public void start( Stage window) throws Exception {
		AnchorPane paneCrash = new AnchorPane();
		Scene scene = new Scene(paneCrash);
		window.setScene(scene);
		paneCrash.setPrefSize(796, 530);
		window.setResizable(false);

		Button buttonComeBack = new Button(String.buttonComeBack);
		buttonComeBack.setLayoutX(10);
		buttonComeBack.setLayoutY(10);
		buttonComeBack.setPrefWidth(90);
		
		paneCrash.getChildren().add(buttonComeBack);
		
		window.show();
		
	buttonComeBack.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				try {
					comeBack();
				} catch (Exception e) {

					e.printStackTrace();
				}
			}

			private void comeBack() throws Exception {

				new Adventure().start(new Stage());
				window.close();
			}
		});

	}
}
