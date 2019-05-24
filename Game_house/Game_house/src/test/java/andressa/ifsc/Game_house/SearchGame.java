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
		AnchorPane pane2 = new AnchorPane();
		pane2.setPrefSize(720, 360);

		Text text1 = new Text();
		text1.setText("Opitions");
		text1.setLayoutX(150);
		text1.setLayoutY(140);
		text1.setFill(Color.WHITE);
		BackgroundImage ImagemTelaBusca = new BackgroundImage(
				new Image("https://png.pngtree.com/back_origin_pic/00/01/71/a946bf083ce8abe5a1e4507c46bfc028.jpg", 820,
						370, false, true),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		pane2.setBackground(new Background(ImagemTelaBusca));

		Button buttonSearch = new Button(String.buttonSearch);
		buttonSearch.setLayoutX(320);
		buttonSearch.setLayoutY(190);
		buttonSearch.setPrefWidth(90);
		pane2.getChildren().addAll(buttonSearch);

		final TextField opitions = new TextField();
		opitions.setLayoutX(150);
		opitions.setLayoutY(150);
		opitions.setPrefWidth(400);
		pane2.getChildren().addAll(opitions);

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
				}
				else if (opitions.getText().equals("logic")) {
					window.close();
					new Logic().start(new Stage());
				}
				else if (opitions.getText().equals("adventure")) {
					window.close();
					new Adventure().start(new Stage());
				}
				else {
					new ErrorLogin().start(new Stage());
				}
			}
		});

		Button buttonExit = new Button(String.buttonExit);
		buttonExit.setLayoutX(650);
		buttonExit.setLayoutY(20);

		buttonExit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				try {
					new Main().start(window);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		pane2.getChildren().addAll(text1, buttonExit);
		Scene scene2 = new Scene(pane2);
		window.setScene(scene2);
		window.show();
	}
}