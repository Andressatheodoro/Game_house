package andressa.ifsc.Game_house;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Separator;
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
		componentes();

		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.show();

	}

	public void componentes() {

		pane = new AnchorPane(); // cria tela
		pane.setPrefSize(720, 360); // dimensão tela

		
		Button buttonEnter = new Button(String.buttonEnter); // cria botão
		buttonEnter.setLayoutX(542); // posição horinzontal
		buttonEnter.setLayoutY(220); // posição vertical
		buttonEnter.setPrefWidth(60); // tamanho

		BackgroundImage ImagemLogin = new BackgroundImage(
				new Image("http://www.microcampabc.com.br/wp-content/uploads/2017/08/games.jpg", 820, 370, false, true),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		pane.setBackground(new Background(ImagemLogin));
		buttonEnter.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {

				try {
					new SearchGame().start(window);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});

		TextField usuario = new TextField();
		usuario.setLayoutX(500);
		usuario.setLayoutY(150);
		usuario.setPrefWidth(140);

		TextField senha = new TextField();
		senha.setLayoutX(500);
		senha.setLayoutY(185);
		senha.setPrefWidth(140);
		pane.getChildren().addAll(buttonEnter, senha, usuario);

	}

}
