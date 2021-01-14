package vika.IModul.PTA.akuntansi.AKK;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class akk2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akk2);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewakk2);
        pdfView.fromAsset("akk.pdf").load();
    }
}