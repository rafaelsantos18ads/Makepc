package makepc.analisedesistema.com.makepc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView valor,precp;
    private Button continuar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializa();
        setSeekBar();
        eventoclick();
    }



    private void inicializa(){
        seekBar=(SeekBar)findViewById(R.id.seekBarid);
        valor= (TextView)findViewById(R.id.valordesejadoid);
        continuar= (Button)findViewById(R.id.continuarid);


    }


    private void setSeekBar()
    {
     seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
         @Override
         public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
             valor.setText(""+ i);

         }

         @Override
         public void onStartTrackingTouch(SeekBar seekBar) {

         }

         @Override
         public void onStopTrackingTouch(SeekBar seekBar) {
             Toast.makeText(MainActivity.this, "valor estabelecido", Toast.LENGTH_SHORT).show();
         }
     });
    }


    private void eventoclick()
    {
        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String valorpassando = (String) valor.getText();

                System.setProperty("chave_valor_desconto",valorpassando);



                double valor = Double.parseDouble(valorpassando.toString());

                if(valor<1500)
                {
                    Toast.makeText(MainActivity.this, "Por favor, insira um valor superior a R$1500,00", Toast.LENGTH_SHORT).show();


                }
                else {


                    Intent intent = new Intent(MainActivity.this, Escolha.class);

                    startActivity(intent);
                }

            }
        });
    }
}
