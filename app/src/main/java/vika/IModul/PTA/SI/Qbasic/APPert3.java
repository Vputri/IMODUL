package vika.IModul.PTA.SI.Qbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class APPert3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appert3);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView10);
        pdfView.fromAsset("PTA_AP3.pdf").load();
    }
}