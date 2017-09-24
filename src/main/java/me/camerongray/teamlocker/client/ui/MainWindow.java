package me.camerongray.teamlocker.client.ui;

import com.sun.javafx.collections.ObservableListWrapper;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import me.camerongray.teamlocker.client.core.Folder;
import me.camerongray.teamlocker.client.core.User;
import me.camerongray.teamlocker.client.utils.UIHelpers;

import javax.swing.*;
import java.net.URL;
import java.util.*;

/**
 * Created by camerong on 20/05/17.
 */
public class MainWindow implements Initializable {
    private User user;
    private ObservableList<Folder> folders = new ObservableListWrapper<Folder>(new ArrayList<>());
    private Folder selectedFolder = null;

    @FXML private Label lblLoggedInUsername;
    @FXML private Label lblLoggedInIsAdministrator;
    @FXML private Menu  menuSystemAdministration;
    @FXML private TableView tableAccounts;
    @FXML private Button btnEditFolder;
    @FXML private ListView listFolders;

    public MainWindow(User user) {
        this.user = user;
    }

    @FXML
    void btnQuit_Click(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void btnAddUser_Click(ActionEvent event) {
        UserForm_Add controller = new UserForm_Add();
        UIHelpers.createStage(getClass().getResource("UserForm.fxml"), controller, "Add User", 640,
                300, true).show();
    }

    @FXML
    void btnAddFolder_Click(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setContentText("Enter a name for this folder:");
        dialog.setTitle("Add Folder");
        dialog.setHeaderText("Add New Folder");
        Optional<String> optionalFolderName = dialog.showAndWait();

        // TODO - Do something if cancel is pressed to avoid "You must enter a name" message being shown

        String folderName = "";
        if (optionalFolderName.isPresent()) {
            folderName = optionalFolderName.get();
        }

        if (folderName.trim().length() == 0) {
            UIHelpers.showInformationDialog("Add Folder", "You must enter a name for this folder");
            return;
        }

        folders.add(Folder.createNew(folderName));
    }

    private void selectedFolderChanged(Folder selectedFolder) {
        this.selectedFolder = selectedFolder;
        this.btnEditFolder.setDisable(this.selectedFolder == null); // Disable edit button if no folder is selected
        // TODO: Fetch folder contents from server and do appropriate UI stuff
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblLoggedInUsername.setText(user.getUsername());
        lblLoggedInIsAdministrator.setVisible(user.isAdmin());
        if (!user.isAdmin()) {
            menuSystemAdministration.setVisible(false);
        }

        listFolders.setItems(folders);
        folders.add(Folder.createNew("Folder 1"));
        folders.add(Folder.createNew("Folder 2"));
        folders.add(Folder.createNew("Folder 3"));

        listFolders.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                selectedFolderChanged((Folder) newValue);
            }
        });
    }
}
