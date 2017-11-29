package application;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(this.getClass().getResource("MainFrame.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			/*
			 * ����ע����� #��
			 * ���ַ�ʽ�����ȼ�>��fxml ����˵�����ط�д�������ķ�ʽ��
			 */
			Label lab =(Label) root.lookup("#lab");
			Button btn =(Button) root.lookup("#btn");
			btn.setOnAction((e)->{
				lab.setText("click");
			});

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
