package vika.IModul.PTA.akuntansi.AKK;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akk4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akk4);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakk4);
        pdfView.fromAsset("akk4.pdf").load();
    }
}