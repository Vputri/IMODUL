package vika.IModul.ATA.si.openoffice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class openoffice1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openoffice1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewof1);
        pdfView.fromAsset("M1_oo.pdf").load();
    }
}