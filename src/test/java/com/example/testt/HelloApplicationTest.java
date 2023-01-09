package com.example.testt;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.TextInputControlMatchers;

import java.io.IOException;

@ExtendWith(ApplicationExtension.class)
class HelloApplicationTest {


    FXMLLoader mainroot;
    Scene mainstage;


    @Start
    public void start(Stage stage) throws IOException {
        mainroot = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        mainstage = new Scene(mainroot.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(mainstage);
        stage.show();
    }


    @Test
    void validarEscribirValorEncampoTexto(FxRobot robot) throws InterruptedException {
        robot.clickOn("#txtNombre");
        robot.write("David");
        // robot.wait(50000);
        FxAssert.verifyThat("#txtNombre", TextInputControlMatchers.hasText("David"));
    }



}