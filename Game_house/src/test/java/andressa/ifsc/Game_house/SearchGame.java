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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SearchGame extends Application {

	public void start(final Stage window) throws Exception {
		AnchorPane pane2 = new AnchorPane();
		pane2.setPrefSize(720, 360); // dimensão tela

		Text texto1 = new Text();
		texto1.setText("NAME OF THE GAME");
		texto1.setLayoutX(150);
		texto1.setLayoutY(140);
		BackgroundImage ImagemTelaBusca = new BackgroundImage(
				new Image("https://png.pngtree.com/back_origin_pic/00/01/71/a946bf083ce8abe5a1e4507c46bfc028.jpg", 820,
						370, false, true),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		pane2.setBackground(new Background(ImagemTelaBusca));

		Button buttonSearch = new Button(String.buttonSearch); // cria botão buscar
		buttonSearch.setLayoutX(560); // posição horinzontal
		buttonSearch.setLayoutY(150); // posição vertical
		buttonSearch.setPrefWidth(60); // tamano

		TextField SearchGame = new TextField(); // cria caixa de texto
		SearchGame.setLayoutX(150); // posição horinzontal
		SearchGame.setLayoutY(150); // posição vertical
		SearchGame.setPrefWidth(400); // tamano

		pane2.getChildren().addAll(buttonSearch, SearchGame);

		Button buttonExit = new Button(String.buttonExit); // cria botão sair
		buttonExit.setLayoutX(650); // posiçao horizontal
		buttonExit.setLayoutY(20); // posição vertical

		buttonExit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				try {
					new Main().start(window);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		pane2.getChildren().addAll(texto1, buttonExit);
		Scene scene2 = new Scene(pane2);
		window.setScene(scene2);
		window.show();
	}
}