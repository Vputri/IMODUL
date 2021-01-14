package vika.IModul.PTA.akuntansi.AKK;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akk1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akk1);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakk1);
        pdfView.fromAsset("akk1.pdf").load();
    }
}