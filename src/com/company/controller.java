package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class controller {

    @FXML
    private Button c;

    @FXML
    private Button d;

    @FXML
    private Button e;

    @FXML
    private Button f;

    @FXML
    private Button g;

    @FXML
    private Button a;

    @FXML
    private Button b;

    @FXML
    private Button cShrp;

    @FXML
    private Button dShrp;

    @FXML
    private Button fShrp;

    @FXML
    private Button gShrp;

    @FXML
    private Button aShrp;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Slider volume;

    @FXML
    void initialize() {
        SoundProcessor sound = new SoundProcessor();
        ExecutorService pool = Executors.newCachedThreadPool();
        sound.setVolumeLevel(127);
        volume.valueProperty().addListener((observable, oldValue, newValue) -> sound.setVolumeLevel(newValue.intValue()));
        anchorPane.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case C:
                    pool.execute(() -> sound.setNoteAndPlay("c"));
                    c.requestFocus();
                    break;
                case D:
                    pool.execute(() -> sound.setNoteAndPlay("d"));
                    d.requestFocus();
                    break;
                case E:
                    pool.execute(() -> sound.setNoteAndPlay("e"));
                    e.requestFocus();
                    break;
                case F:
                    pool.execute(() -> sound.setNoteAndPlay("f"));
                    f.requestFocus();
                    break;
                case G:
                    pool.execute(() -> sound.setNoteAndPlay("g"));
                    g.requestFocus();
                    break;
                case A:
                    pool.execute(() -> sound.setNoteAndPlay("a"));
                    a.requestFocus();
                    break;
                case B:
                    pool.execute(() -> sound.setNoteAndPlay("b"));
                    b.requestFocus();
                    break;

                case DIGIT1:
                    pool.execute(() -> sound.setNoteAndPlay("cShrp"));
                    cShrp.requestFocus();
                    break;
                case DIGIT2:
                    pool.execute(() -> sound.setNoteAndPlay("dShrp"));
                    dShrp.requestFocus();
                    break;
                case DIGIT3:
                    pool.execute(() -> sound.setNoteAndPlay("fShrp"));
                    fShrp.requestFocus();
                    break;
                case DIGIT4:
                    pool.execute(() -> sound.setNoteAndPlay("gShrp"));
                    gShrp.requestFocus();
                    break;
                case DIGIT5:
                    pool.execute(() -> sound.setNoteAndPlay("aShrp"));
                    aShrp.requestFocus();
                    break;
            }
        });
        c.setOnAction(e ->
                pool.execute(() -> sound.setNoteAndPlay("c"))
        );
        d.setOnAction(e ->
                pool.execute(() -> sound.setNoteAndPlay("d"))
        );
        e.setOnAction(e ->
                pool.execute(() -> sound.setNoteAndPlay("e"))
        );
        f.setOnAction(e ->
                pool.execute(() -> sound.setNoteAndPlay("f"))
        );
        g.setOnAction(e ->
                pool.execute(() -> sound.setNoteAndPlay("g"))
        );
        a.setOnAction(e ->
                pool.execute(() -> sound.setNoteAndPlay("a"))
        );
        b.setOnAction(e ->
                pool.execute(() -> sound.setNoteAndPlay("b"))
        );
        cShrp.setOnAction(e ->
                pool.execute(() -> sound.setNoteAndPlay("cShrp"))
        );
        dShrp.setOnAction(e ->
                pool.execute(() -> sound.setNoteAndPlay("dShrp"))
        );
        fShrp.setOnAction(e ->
                pool.execute(() -> sound.setNoteAndPlay("fShrp"))
        );
        gShrp.setOnAction(e ->
                pool.execute(() -> sound.setNoteAndPlay("gShrp"))
        );
        aShrp.setOnAction(e ->
                pool.execute(() -> sound.setNoteAndPlay("aShrp"))
        );
    }

}
