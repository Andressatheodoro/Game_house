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

public class Adventure extends Application {
	public void start(final Stage window) throws Exception {
		AnchorPane paneAdventure = new AnchorPane();
		paneAdventure.setPrefSize(796, 530);
		window.setResizable(false);

		Button buttonComeBack = new Button(String.buttonComeBack);
		buttonComeBack.setLayoutX(10);
		buttonComeBack.setLayoutY(10);
		buttonComeBack.setPrefWidth(90);
		paneAdventure.getChildren().addAll(buttonComeBack);
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
				new Image("https://i.imgur.com/1cSfgHB.jpg",830, 550,
						false, true),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		paneAdventure.setBackground(new Background(ImagemTelaBusca));

		Scene sceneAdventury = new Scene(paneAdventure);
		window.setScene(sceneAdventury);
		window.show();
	}
}
