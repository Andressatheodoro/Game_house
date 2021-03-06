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

public class Logic extends Application {
	public void start(final Stage window) throws Exception {
		AnchorPane paneLogic = new AnchorPane();
		paneLogic.setPrefSize(720, 360);

		BackgroundImage ImagemTelaBusca = new BackgroundImage(
				new Image("https://png.pngtree.com/back_origin_pic/00/01/71/a946bf083ce8abe5a1e4507c46bfc028.jpg", 820,
						370, false, true),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		paneLogic.setBackground(new Background(ImagemTelaBusca));

		Scene sceneLogic = new Scene(paneLogic);
		window.setScene(sceneLogic);
		window.show();
	}

}
