package andressa.ifsc.Game_house;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ErrorLogin extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane paneErroLogin = new AnchorPane();
		paneErroLogin.setPrefSize(300, 160);

		Scene sceneErroLogin = new Scene(paneErroLogin);
		primaryStage.setScene(sceneErroLogin);
		Text textError2 = new Text();
		
		textError2.setLayoutX(65);
		textError2.setLayoutY(30);
		textError2.setFont(new Font(25));
		textError2.setText("Error");
		
		Text textError = new Text();
		textError.setText("invalid information");
		textError.setLayoutX(50);
		textError.setLayoutY(50);
		textError.setFont(new Font(20));
		
		paneErroLogin.getChildren().addAll(textError,textError2);

		primaryStage.show();

	}

}
