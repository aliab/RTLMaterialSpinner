package ir.hamsaa.rtlmaterialspinner.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;

import fr.hamsaa.materialspinner.sample.R;
import ir.hamsaa.RtlMaterialSpinner;


public class MainActivity extends AppCompatActivity {

    private static final String ERROR_MSG = "یک خطا خیلی خیلی خیلی طولانی که برای نمایش قابلیت اسکرول ایجاد شده است و بسیار خوب است!";
    private static final String[] ITEMS = {"ایتم اول", "ایتم دوم", "ایتم سوم", "ایتم چهارم", "ایتم پنجم", "ایتم ششم"};

    private ArrayAdapter<String> adapter;

    RtlMaterialSpinner spinner1;
    RtlMaterialSpinner spinner3;
    RtlMaterialSpinner spinner4;
    RtlMaterialSpinner spinner5;

    private boolean shown = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, ITEMS);
        initSpinnerHintAndFloatingLabel();
        initSpinnerNoHintNoFloatingLabel();
        initSpinnerMultiline();
        initSpinnerScrolling();

    }

    private void initSpinnerHintAndFloatingLabel() {
        spinner1 = (RtlMaterialSpinner) findViewById(R.id.spinner1);
        spinner1.setAdapter(adapter);
        spinner1.setPaddingSafe(0, 0, 0, 0);
    }

    private void initSpinnerNoHintNoFloatingLabel() {
        spinner3 = (RtlMaterialSpinner) findViewById(R.id.spinner3);
        spinner3.setAdapter(adapter);
    }

    private void initSpinnerMultiline() {
        spinner4 = (RtlMaterialSpinner) findViewById(R.id.spinner4);
        spinner4.setAdapter(adapter);
        spinner4.setHint("یک ایتم را انتخاب کنید");
    }

    private void initSpinnerScrolling() {
        spinner5 = (RtlMaterialSpinner) findViewById(R.id.spinner5);
        spinner5.setAdapter(adapter);
        spinner5.setHint("یک ایتم را انتخاب کنید");
    }


    public void activateError(View view) {
        if (!shown) {
            spinner4.setError(ERROR_MSG);
            spinner5.setError(ERROR_MSG);
        } else {
            spinner4.setError(null);
            spinner5.setError(null);
        }
        shown = !shown;

    }


}
