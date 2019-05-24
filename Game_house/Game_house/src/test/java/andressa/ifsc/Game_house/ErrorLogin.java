package andressa.ifsc.Game_house;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

import javafx.stage.Stage;

public class ErrorLogin extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane paneErroLogin = new AnchorPane();
		paneErroLogin.setPrefSize(300, 160);

		Scene sceneErroLogin = new Scene(paneErroLogin);
		primaryStage.setScene(sceneErroLogin);

		BackgroundImage ImagemTelaBusca = new BackgroundImage(
				new Image("https://i.imgur.com/TVm5rBn.jpg",300 , 160, false, true), 
				BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		paneErroLogin.setBackground(new Background(ImagemTelaBusca));

		primaryStage.show();

	}

}
