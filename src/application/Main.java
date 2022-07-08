package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		
		Label lno1=new Label("First Number");
		TextField tfno1=new TextField();
		tfno1.setPromptText("Enter Number...");
		tfno1.setFocusTraversable(false);
		
		
		Label lno2=new Label("Second Number");
		TextField tfno2=new TextField();
		tfno2.setPromptText("Enter Number...");
		tfno2.setFocusTraversable(false);
		
		
		Label ans=new Label("");
		
		Label lno3=new Label("Operators");
		HBox hbox=new HBox(15); 
		
		Button btn1=new Button("+");
		Button btn2=new Button("-");
		Button btn3=new Button("*");
		Button btn4=new Button("/");
		Button btn5=new Button("C");
		
		
		
		btn1.setOnAction(new EventHandler<ActionEvent>()
				{
			public void handle(ActionEvent e)
			{
				String a=tfno1.getText();
				
				Integer num1 = Integer.valueOf(a);
				String b=tfno2.getText();
				int num2 = Integer.valueOf(b);
				int rel=num1+num2;
				String tem=String.valueOf(rel);
				
				ans.setText(tem);
				tfno1.setText("");
				tfno2.setText("");
			}
				});
		
		
		btn2.setOnAction(new EventHandler<ActionEvent>()
		{
	public void handle(ActionEvent e)
	{
		String a=tfno1.getText();
		
		Integer num1 = Integer.valueOf(a);
		String b=tfno2.getText();
		int num2 = Integer.valueOf(b);
		int rel=num1-num2;
		String tem=String.valueOf(rel);
		
		ans.setText(tem);
		tfno1.setText("");
		tfno2.setText("");
	}
		});
		
		btn3.setOnAction(new EventHandler<ActionEvent>()
		{
	public void handle(ActionEvent e)
	{
		String a=tfno1.getText();
		
		Integer num1 = Integer.valueOf(a);
		String b=tfno2.getText();
		int num2 = Integer.valueOf(b);
		int rel=num1*num2;
		String tem=String.valueOf(rel);
		
		ans.setText(tem);
		tfno1.setText("");
		tfno2.setText("");
	}
		});
		
		btn4.setOnAction(new EventHandler<ActionEvent>()
		{
	public void handle(ActionEvent e)
	{
		String a=tfno1.getText();
		
		Integer num1 = Integer.valueOf(a);
		String b=tfno2.getText();
		int num2 = Integer.valueOf(b);
		float rel=num1/num2;
		String tem=String.valueOf(rel);
		
		ans.setText(tem);
		tfno1.setText("");
		tfno2.setText("");
	}
		});
		
		btn5.setOnAction(new EventHandler<ActionEvent>()
		{
	public void handle(ActionEvent e)
	{
		
		ans.setText("");
		tfno1.setText("");
		tfno2.setText("");
	}
		});
		
		
		
		
		
		
		
		
		
		
		
		btn1.setFocusTraversable(false);
		btn2.setFocusTraversable(false);
		btn3.setFocusTraversable(false);
		btn4.setFocusTraversable(false);
		btn5.setFocusTraversable(false);
		hbox.getChildren().addAll(lno3,btn1,btn2,btn3,btn4,btn5);
		
		
		
		
		ans.setFocusTraversable(false);
		ans.setTextFill(Color.BLACK);
		ans.setFont(Font.font("Verdana", FontWeight.BOLD, 40));
		
		
		
		
		
		
		VBox root = new VBox(20);
		root.getChildren().addAll(lno1,tfno1,lno2,tfno2,hbox,ans);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(20));
		Scene scene = new Scene(root,350,400);
		stage.setScene(scene);
		Image icon=new Image("file:///Users/macbook/Documents/Eclipse-Work/SimpleCalculator/src/application/21283780921537355429-128.png");
		stage.getIcons().add(icon);
		stage.setTitle("Calculator");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
