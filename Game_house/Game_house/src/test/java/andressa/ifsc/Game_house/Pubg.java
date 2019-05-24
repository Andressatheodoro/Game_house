package andressa.ifsc.Game_house;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Pubg extends Application {

	@Override
		public void start( Stage window) throws Exception {
			AnchorPane panePubg = new AnchorPane();
			Scene scene = new Scene(panePubg);
			window.setScene(scene);
			panePubg.setPrefSize(796, 530);
			window.setResizable(false);

			Button buttonComeBack = new Button(String.buttonComeBack);
			buttonComeBack.setLayoutX(10);
			buttonComeBack.setLayoutY(10);
			buttonComeBack.setPrefWidth(90);
			
			panePubg.getChildren().add(buttonComeBack);
			
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

					new Action().start(new Stage());
					window.close();
				}
			});

		}
	}

		
	
