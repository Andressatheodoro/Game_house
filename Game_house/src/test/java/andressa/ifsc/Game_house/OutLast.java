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

public class OutLast extends Application {

	@Override
	public void start(Stage window) throws Exception {
		AnchorPane paneOutLast = new AnchorPane();
		Scene scene = new Scene(paneOutLast);
		window.setScene(scene);
		paneOutLast.setPrefSize(734, 487);
		window.setResizable(false);

		BackgroundImage ImagemTelaBusca = new BackgroundImage(
				new Image("https://i.imgur.com/xMuJ0P6.jpg", 750, 502, false, true), BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		paneOutLast.setBackground(new Background(ImagemTelaBusca));

		Button buttonComeBack = new Button(String.buttonComeBack);
		buttonComeBack.setLayoutX(10);
		buttonComeBack.setLayoutY(10);
		buttonComeBack.setPrefWidth(90);

		paneOutLast.getChildren().add(buttonComeBack);

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

				new Horror().start(new Stage());
				window.close();
			}
		});

	}
}