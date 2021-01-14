package vika.IModul.PTA.akuntansi.audit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class audit6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audit6);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewaudit6);
        pdfView.fromAsset("audit6.pdf").load();
    }
}