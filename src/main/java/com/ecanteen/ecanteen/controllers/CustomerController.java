package com.ecanteen.ecanteen.controllers;

import com.ecanteen.ecanteen.dao.CustomerDaoImpl;
import com.ecanteen.ecanteen.entities.Customer;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class CustomerController {
    @FXML
    private Button productMenuButton;
    @FXML
    private Button categoryMenuButton;
    @FXML
    private Button supplierMenuButton;
    @FXML
    private Button promotionMenuButton;
    @FXML
    private Button logoutButton;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private Button addButton;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button resetButton;
    @FXML
    private Label infoLabel;
    @FXML
    private TextField searchTextField;
    @FXML
    private TableColumn<Customer, String> idTableColumn;
    @FXML
    private TableColumn<Customer, String> nameTableColumn;
    @FXML
    private Button customerMenuButton;
    @FXML
    private TextField phoneTextField;
    @FXML
    private TableView<Customer> customerTableView;
    @FXML
    private TableColumn<Customer, String> phoneTableColumn;

    private ObservableList<Customer> customers;
    private CustomerDaoImpl customerDao;
    private Customer selectedCustomer;

    @FXML
    private void addButtonAction(ActionEvent actionEvent) {
    }

    @FXML
    private void updateButtonAction(ActionEvent actionEvent) {
    }

    @FXML
    private void deleteButtonAction(ActionEvent actionEvent) {
    }

    @FXML
    private void resetButtonAction(ActionEvent actionEvent) {
    }

    @FXML
    private void searchTextFieldKeyPressed(KeyEvent keyEvent) {
    }

    @FXML
    private void productMenuButtonAction(ActionEvent actionEvent) {
    }

    @FXML
    private void categoryMenuButtonAction(ActionEvent actionEvent) {
    }

    @FXML
    private void supplierMenuButtonAction(ActionEvent actionEvent) {
    }

    @FXML
    private void customerTableViewClicked(MouseEvent mouseEvent) {
    }

    @FXML
    private void promotionMenuButtonAction(ActionEvent actionEvent) {
    }
}
