package andressa.ifsc.Game_house;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
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
				
		Button buttonCrash = new Button(String.buttonCrash);
		buttonCrash.setLayoutX(100);
		buttonCrash.setLayoutY(350);
		buttonCrash.setPrefWidth(90);
		paneAdventure.getChildren().add(buttonCrash);
		
		Button buttonComeBack = new Button(String.buttonComeBack);
		buttonComeBack.setLayoutX(10);
		buttonComeBack.setLayoutY(10);
		buttonComeBack.setPrefWidth(90);
		paneAdventure.getChildren().add(buttonComeBack);

		BackgroundImage ImagemTelaBusca = new BackgroundImage(
				new Image("https://i.imgur.com/1cSfgHB.jpg", 830, 550, false, true), BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		paneAdventure.setBackground(new Background(ImagemTelaBusca));

		Scene sceneAdventure = new Scene(paneAdventure);
		window.setScene(sceneAdventure);
		window.show();
		
		buttonComeBack.setOnAction(e -> comeBack(window));
		buttonCrash.setOnAction(e -> crash(window));
	}

	
	private void crash(Stage stage) {
		try {
			new Crash().start(new Stage());
			stage.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void comeBack(Stage stage) {

		try {
			new SearchGame().start(new Stage());
			stage.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
