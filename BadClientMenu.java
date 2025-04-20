import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BadClientMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bad_client_menu); // Nome do XML acima

        Button btnFly = findViewById(R.id.btnFly);
        Button btnXray = findViewById(R.id.btnXray);
        Button btnAutoClick = findViewById(R.id.btnAutoClick);
        Button btnSpam = findViewById(R.id.btnSpam);

        btnFly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BadClientMenu.this, "Fly ativado", Toast.LENGTH_SHORT).show();
            }
        });

        btnXray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BadClientMenu.this, "X-Ray ativado", Toast.LENGTH_SHORT).show();
            }
        });

        btnAutoClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BadClientMenu.this, "AutoClicker ativado", Toast.LENGTH_SHORT).show();
            }
        });

        btnSpam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BadClientMenu.this, "Spam Chat ativado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
