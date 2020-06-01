package com.example.tibe_e_nabvi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Load pdf file
        pdfView=(PDFView) findViewById(R.id.pdfv);
        pdfView.fromAsset("nabvi.pdf").load();
    }
}
