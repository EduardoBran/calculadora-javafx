package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ManViewController implements Initializable {
	
    private double valor1 = 0;
    private double valor2 = 0;
    private double[] valor3;
    private double resultado = 0;
    
    private String operacao = "";
    
    @FXML
    private Label labelErro;
	
	@FXML
	private TextField txtTela;	
	@FXML
	private Button bt0;
	@FXML
	private Button bt1;
	@FXML
	private Button bt2;
	@FXML
	private Button bt3;
	@FXML
	private Button bt4;
	@FXML
	private Button bt5;
	@FXML
	private Button bt6;
	@FXML
	private Button bt7;
	@FXML
	private Button bt8;
	@FXML
	private Button bt9;
	@FXML
	private Button btPonto;
	@FXML
	private Button btIgualdade;
	@FXML
	private Button btSoma;
	@FXML
	private Button btSubtracao;
	@FXML
	private Button btMulti;
	@FXML
	private Button btDivisao;
	@FXML
	private Button btC;
	
	public void onBt1Action() {
		
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				txtTela.setText(txtTela.getText() + "1");
			}			
		});
	}	
	
	public void onBt2Action() {
		
		bt2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				txtTela.setText(txtTela.getText() + "2");
			}			
		});
	}
	
	public void onBt3Action() {
		
		bt3.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				txtTela.setText(txtTela.getText() + "3");
			}			
		});
	}
	
	public void onBt4Action() {
		
		bt4.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				txtTela.setText(txtTela.getText() + "4");
			}			
		});
	}
	
	public void onBt5Action() {
		
		bt5.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				txtTela.setText(txtTela.getText() + "5");
			}			
		});
	}
	
	public void onBt6Action() {
		
		bt6.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				txtTela.setText(txtTela.getText() + "6");
			}			
		});
	}
	
	public void onBt7Action() {
		
		bt7.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				txtTela.setText(txtTela.getText() + "7");
			}			
		});
	}
	
	public void onBt8Action() {
		
		bt8.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				txtTela.setText(txtTela.getText() + "8");
			}			
		});
	}
	
	public void onBt9Action() {
		
		bt9.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				txtTela.setText(txtTela.getText() + "9");
			}			
		});
	}
	
	public void onBt0Action() {
		
		bt0.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				txtTela.setText(txtTela.getText() + "0");
			}			
		});
	}
	
	public void onBtSomaAction() {
		
		btSoma.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				if(txtTela.getText().equals("")) {
					labelErro.setText("Escolha um numero.");
				}
				else {
					labelErro.setText("");				
					valor1 = Double.parseDouble(txtTela.getText());
					txtTela.setText("");
					operacao = "+";
				}
			}
		});
	}
	
	public void onBtSubtracaoAction() {
		
		btSubtracao.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				if(txtTela.getText().equals("")) {
					labelErro.setText("Escolha um numero.");
				}
				else {
					labelErro.setText("");
					valor1 = Double.parseDouble(txtTela.getText());
					txtTela.setText("");
					operacao = "-";
				}
			}
		});
	}
	
	public void onBtMultiAction() {
		
		btMulti.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				if(txtTela.getText().equals("")) {
					labelErro.setText("Escolha um numero.");
				}
				else {
					labelErro.setText("");
					valor1 = Double.parseDouble(txtTela.getText());				
					txtTela.setText("");
					operacao = "*";
				}
			}
		});
	}
	
	public void onBtDivisaoAction() {
		
		btDivisao.setOnAction(new EventHandler<ActionEvent>() {			
			
			@Override
			public void handle(ActionEvent event) {
				
				if(txtTela.getText().equals("")) {
					labelErro.setText("Escolha um numero.");
				}
				else {
					labelErro.setText("");
					valor1 = Double.parseDouble(txtTela.getText());
					txtTela.setText("");
					operacao = "/";
				}	
			}
		});
	}
	
	public void onBtPontoAction() {
		
		btPonto.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				txtTela.setText(txtTela.getText() + ".");
			}
		});
	}
	
	public void onBtCAction() {
		
		btC.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				txtTela.setText("");
				valor1 = 0;
				valor2 = 0;
				operacao = "";
			}
		});
	}
	
	public void onBtIgualdade() {
		
		btIgualdade.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				if(txtTela.getText().equals("")) {
					labelErro.setText("Escolha um numero.");
				}
				else {
					labelErro.setText("");
					
					valor2 = Double.parseDouble(txtTela.getText());
					
					switch (operacao) {
	
						case "+":							
							resultado = valor1 + valor2;
							txtTela.setText(String.valueOf(resultado));
							break;
						
						case "-":							
							resultado = valor1 - valor2;
							txtTela.setText(String.valueOf(resultado));
							break;	
							
						case "*":							
							resultado = valor1 * valor2;
							txtTela.setText(String.valueOf(resultado));
							break;
							
						case "/":								
							
							if (valor2 == 0) {
								txtTela.setText("Operação Inválida");
							}
							else {
								resultado = valor1 / valor2;												
								txtTela.setText(String.valueOf(resultado));
							}						
							break;						
					}
				}	
			}
		});
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		initializeNodes();
		onBt1Action();
		onBt2Action();
		onBt3Action();
		onBt4Action();
		onBt5Action();
		onBt6Action();
		onBt7Action();
		onBt8Action();
		onBt9Action();
		onBt0Action();
		onBtSomaAction();
		onBtSubtracaoAction();
		onBtMultiAction();
		onBtDivisaoAction();
		onBtPontoAction();
		onBtCAction();
		
	}

	private void initializeNodes() {
		
		Constraints.setTextFieldMaxLength(txtTela, 20);		
	}
}
