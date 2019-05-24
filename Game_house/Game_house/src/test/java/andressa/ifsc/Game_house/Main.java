package andressa.ifsc.Game_house;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Stage;

public class Main extends Application {

	private AnchorPane pane;
	Stage window;
	Scene scene1, scene2;
	Button buttonEnter;

	public static void main(java.lang.String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setResizable(false);
		login();
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.show();
	}

	public void login() {

		final TextField user = new TextField();
		user.setLayoutX(500);
		user.setLayoutY(150);
		user.setPrefWidth(140);

		final PasswordField passWord = new PasswordField();
		passWord.setLayoutX(500);
		passWord.setLayoutY(185);
		passWord.setPrefWidth(140);

		pane = new AnchorPane();
		pane.setPrefSize(720, 360);

		Button buttonEnter = new Button(String.buttonEnter);
		buttonEnter.setLayoutX(542);
		buttonEnter.setLayoutY(220);
		buttonEnter.setPrefWidth(60);

		pane.getChildren().addAll(buttonEnter, passWord, user);
		
		buttonEnter.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				try {
					errorLogin();
				} catch (Exception e) {

					e.printStackTrace();
				}
			}

			private void errorLogin() throws Exception {
				if (user.getText().equals("admin") && passWord.getText().equals("admin")) {
					window.close();
					new SearchGame().start(new Stage());
				} else {
					new ErrorLogin().start(new Stage());
				}
			}
		});

		BackgroundImage ImagemLogin = new BackgroundImage(
				new Image("https://i.imgur.com/PmlQNyZ.png", 0, 0, false, true),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		pane.setBackground(new Background(ImagemLogin));

	}

}
// #ff7c00