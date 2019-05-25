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

public class Horror extends Application {
	public void start(final Stage window) throws Exception {
		AnchorPane paneHorror = new AnchorPane();
		paneHorror.setPrefSize(709, 496);
		window.setResizable(false);

		Button buttonOutLast = new Button(String.buttonCrash);
		buttonOutLast.setLayoutX(400);
		buttonOutLast.setLayoutY(294);
		buttonOutLast.setPrefWidth(90);
		paneHorror.getChildren().add(buttonOutLast);

		Button buttonComeBack = new Button(String.buttonComeBack);
		buttonComeBack.setLayoutX(10);
		buttonComeBack.setLayoutY(10);
		buttonComeBack.setPrefWidth(90);
		paneHorror.getChildren().addAll(buttonComeBack);

		buttonOutLast.setOnAction(e -> outLast(window));

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
				new Image("https://i.imgur.com/lWSblge.jpg", 722, 530, false, true), BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		paneHorror.setBackground(new Background(ImagemTelaBusca));

		Scene sceneHorror = new Scene(paneHorror);
		window.setScene(sceneHorror);
		window.show();
	}

	private void outLast(Stage stage) {
		try {
			new OutLast().start(new Stage());
			stage.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
