package vika.IModul.ATA.si;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cplus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cplus);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewcplus);
        pdfView.fromAsset("C++_2DB.pdf").load();
    }
}