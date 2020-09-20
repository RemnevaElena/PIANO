package com.company;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import com.company.SoundProcessor;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class controller {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

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
        void initialize() {
            SoundProcessor sound = new SoundProcessor();
            ExecutorService pool = Executors.newCachedThreadPool();
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
