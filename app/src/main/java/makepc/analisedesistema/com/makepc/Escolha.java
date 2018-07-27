package makepc.analisedesistema.com.makepc;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageButton;

public class Escolha extends AppCompatActivity {
    private ImageButton gamer;
    private ImageButton editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);
        inicializa();

        eventoclick();

    }


    private void inicializa(){
        gamer=(ImageButton)findViewById(R.id.gamerid);
        editor=(ImageButton)findViewById(R.id.editorid);
    }



    private void eventoclick()
    {
        gamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Escolha.this, Editor.class);



                startActivity(intent);

            }
        });

        editor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Escolha.this, Editor2.class);

                startActivity(intent);

            }
        });
    }



}
