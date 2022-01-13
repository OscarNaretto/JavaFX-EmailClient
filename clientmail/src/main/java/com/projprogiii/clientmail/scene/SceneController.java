package com.projprogiii.clientmail.scene;

import com.projprogiii.clientmail.ClientApplication;
import com.projprogiii.clientmail.controller.Controller;
import com.projprogiii.clientmail.utils.AlertManager;
import com.projprogiii.clientmail.utils.AlertText;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextFlow;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class SceneController {
    private record ClientWindow(Pane pane, Controller controller) {}

    private final HashMap<SceneName, ClientWindow> sceneMap;
    private final Scene main;

    private SceneController(Scene main){
        this.main = main;
        sceneMap = new HashMap<>();
    }
    public static SceneController getInstance(Scene main){
        return new SceneController(main);
    }

    public void addScene(SceneName name) throws IOException {
        String path = name.toString() + '/' + name + "_scene.fxml";

        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull
                (ClientApplication.class.getResource(path)));
        sceneMap.put(name, new ClientWindow(loader.load(), loader.getController()));
    }

    public Controller getController(SceneName name){
        return sceneMap.get(name).controller();
    }

    public void switchTo(SceneName name){
        main.setRoot(sceneMap.get(name).pane());
    }

}