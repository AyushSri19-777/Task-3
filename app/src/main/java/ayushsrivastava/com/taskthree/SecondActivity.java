package ayushsrivastava.com.taskthree;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        coordinatorLayout = (CoordinatorLayout)findViewById(R.id.coordinatorLayout);
        final Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Snackbar snackbar=Snackbar.make(coordinatorLayout,"SecondActivity",Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}
