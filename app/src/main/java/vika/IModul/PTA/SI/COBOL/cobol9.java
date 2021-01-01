package vika.IModul.PTA.SI.COBOL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import vika.IModul.R;

public class cobol9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobol9);

        PDFView pdfView;
        pdfView = findViewById(R.id.pdfView46);
        pdfView.fromAsset("Cobol9.pdf").load();
    }
}