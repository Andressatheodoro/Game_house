package andressa.ifsc.Game_house;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SearchGame extends Application {

	public void start(final Stage window) throws Exception {

		AnchorPane paneSearchGame = new AnchorPane();
		paneSearchGame.setPrefSize(732, 425);
		window.setResizable(false);

		BackgroundImage ImagemTelaBusca = new BackgroundImage(
				new Image("https://i.imgur.com/WHWKwmI.jpg", 800, 460, false, true), BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		paneSearchGame.setBackground(new Background(ImagemTelaBusca));

		Button buttonSearch = new Button(String.buttonSearch);
		buttonSearch.setLayoutX(460);
		buttonSearch.setLayoutY(210);
		buttonSearch.setPrefWidth(90);
		paneSearchGame.getChildren().addAll(buttonSearch);

		final TextField opitions = new TextField();
		opitions.setLayoutX(220);
		opitions.setLayoutY(170);
		opitions.setPrefWidth(400);
		paneSearchGame.getChildren().addAll(opitions);

		buttonSearch.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				try {
					buscagenero();
				} catch (Exception e) {

					e.printStackTrace();
				}
			}

			private void buscagenero() throws Exception {
				if (opitions.getText().equals("action")) {
					window.close();
					new Action().start(new Stage());
				} else if (opitions.getText().equals("horror")) {
					window.close();
					new Horror().start(new Stage());
				} else if (opitions.getText().equals("adventure")) {
					window.close();
					new Adventure().start(new Stage());
				} else {
					new ErrorLogin().start(new Stage());
				}
			}
		});

		Button buttonExit = new Button(String.buttonExit);
		buttonExit.setLayoutX(700);
		buttonExit.setLayoutY(2);
		buttonExit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				try {
					new Main().start(window);
				} catch (Exception e) {

				}
			}
		});
		paneSearchGame.getChildren().add(buttonExit);
		Scene scene2 = new Scene(paneSearchGame);
		window.setScene(scene2);
		window.show();
	}
}