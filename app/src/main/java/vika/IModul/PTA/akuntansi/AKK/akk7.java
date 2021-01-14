package vika.IModul.PTA.akuntansi.AKK;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akk7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akk7);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakk7);
        pdfView.fromAsset("akk7.pdf").load();
    }
}