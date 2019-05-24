package andressa.ifsc.Game_house;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Stage;

public class Action extends Application {
	public void start(final Stage window) throws Exception {
		AnchorPane paneAction = new AnchorPane();
		paneAction.setPrefSize(698, 485);
		window.setResizable(false);

		
		
		Button buttonComeBack = new Button(String.buttonComeBack);
		buttonComeBack.setLayoutX(10);
		buttonComeBack.setLayoutY(10);
		buttonComeBack.setPrefWidth(90);
		paneAction.getChildren().addAll(buttonComeBack);
		
buttonComeBack.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				try {
					comeBack();
				} catch (Exception e) {

					e.printStackTrace();
				}
			}

			private void comeBack() throws Exception {
				
					new SearchGame().start(new Stage());
					window.close();
			}
		});
		
		BackgroundImage ImagemTelaBusca = new BackgroundImage(
				new Image("https://i.imgur.com/PfrJBbg.jpg",710,
						540, false, true),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		paneAction.setBackground(new Background(ImagemTelaBusca));

        Scene sceneAction = new Scene(paneAction);
		window.setScene(sceneAction);
		window.show();
	}

}
