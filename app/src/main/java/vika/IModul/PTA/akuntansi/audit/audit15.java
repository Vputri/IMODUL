package vika.IModul.PTA.akuntansi.audit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class audit15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audit15);
        PDFView pdfView;
        pdfView = findViewById(R.id.pdfViewaudit5);
        pdfView.fromAsset("audit5.pdf").load();
    }
}