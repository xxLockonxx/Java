package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.db.DBProc;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class RegisterController implements Initializable
{
	@FXML private TextField txtUid;
	@FXML private TextField txtName;
	@FXML private TextField txtHp;
	@FXML private ComboBox<String> combPos;
	@FXML private ComboBox<Integer> combDep;
	@FXML private Button btnCancel;
	@FXML private Button btnReg1;
	@FXML private Button btnReg2;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		ObservableList<String> posList =
				FXCollections.observableArrayList("���", "�븮", "����", "���� ", "����");
		ObservableList<Integer> depList =
				FXCollections.observableArrayList(101, 102, 103, 104, 105);
	
		combPos.setItems(posList);
		combDep.setItems(depList);
		
		btnCancel.setOnAction(event->btnCancelHandler());
		btnReg1.setOnAction(event->btnReg1Handler());
		btnReg2.setOnAction(event->btnReg2Handler());
	} // initialize end
	
	// �ڵ鷯 ����
	public void btnCancelHandler() {
		System.out.println("cancel!!!");
	}
	
	public void btnReg1Handler() {
		String uid  = txtUid.getText();
		String name = txtName.getText();
		String hp   = txtHp.getText();
		String pos  = combPos.getValue();
		int    dep  = combDep.getValue();
		
		
		try {
			DBProc.getInstace().insertUser1(uid, name, hp, pos, dep);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	public void btnReg2Handler() {
		String uid  = txtUid.getText();
		String name = txtName.getText();
		String hp   = txtHp.getText();
		String pos  = combPos.getValue();
		int    dep  = combDep.getValue();
		
		
		try {
			DBProc.getInstace().insertUser2(uid, name, hp, pos, dep);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}

