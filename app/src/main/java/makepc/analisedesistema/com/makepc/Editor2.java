package makepc.analisedesistema.com.makepc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Editor2 extends AppCompatActivity {
    private TextView placamae, processador, gabinete, discorigido, cooler, memoriaRAM, placa_video, fonte, precofinal;
    private ImageView imgplacamae, imgprocessador, imggabinete, imgdiscorigido, imgcooler, imgmemoriaram, imgplacavideo, imgfonte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor2);
        inicializa();
        recebe();
        atribuicao();
    }


    private void inicializa() {
        placamae = (TextView) findViewById(R.id.placa_mae_editor_id);
        processador = (TextView) findViewById(R.id.cpu_editor_id);
        gabinete = (TextView) findViewById(R.id.gabinete_editor_id);
        discorigido = (TextView) findViewById(R.id.disco_id);
        cooler = (TextView) findViewById(R.id.cooler_id);
        memoriaRAM = (TextView) findViewById(R.id.memoria_ram_editor_id);
        placa_video = (TextView) findViewById(R.id.placa_video_editor_id);
        fonte = (TextView) findViewById(R.id.fonte_id);
        precofinal = (TextView) findViewById(R.id.precofinal_id);



        /*imagens*/

        imgplacamae = (ImageView) findViewById(R.id.imagem_placa_mae_id);
        imgprocessador = (ImageView) findViewById(R.id.imagem_cpu_editor_id);
        imggabinete = (ImageView) findViewById(R.id.imagem_gabinete_editor_id);
        imgdiscorigido = (ImageView) findViewById(R.id.imagem_disco_id);
        imgcooler = (ImageView) findViewById(R.id.imagem_cooler_id);
        imgmemoriaram = (ImageView) findViewById(R.id.imagem_memoria_ram_editor_id);
        imgplacavideo = (ImageView) findViewById(R.id.imagem_placa_video_editor_id);
        imgfonte = (ImageView) findViewById(R.id.imagem_fonte_id);

    }
    private void recebe() {


        String recebevalor = System.getProperty("chave_valor_desconto", null);

        System.out.println("aa" + recebevalor);

        precofinal.setText("" + recebevalor);

        String verificador = (String) precofinal.getText();

        float precocompara = Float.valueOf(verificador.toString());


        float precocompara1 = precocompara;
        System.setProperty("chave", String.valueOf(precocompara1));


    }
    public void atribuicao() {


        String recebevalor2 = System.getProperty("chave", null);

        double passa = Double.valueOf(recebevalor2.toString());


        if (passa >= 1500 && passa < 1600) {

            precofinal.setText("R$ 1580,00(EM MÉDIA");
            placamae.setText("Msi H81m-e33 - 400,00 R$");
            processador.setText("Pentium Dual Core G3250 3.2ghz - 300,00 R$");
            gabinete.setText("Pc Yes Java - 300,00 R$");
            cooler.setText("Original - 0,00 R$");
            discorigido.setText("Wd Blue Barracuda 500gb - 170,00 R$");
            memoriaRAM.setText("Kingston Ddr3 4 Gb - 100,00 R$");
            fonte.setText("430w Electro Series - 300,00 R$");
            placa_video.setText("OnBoard - 0,00 R$");


            imgplacamae.setBackgroundResource(R.drawable.placamae);
            imgprocessador.setBackgroundResource(R.drawable.processador);
            imggabinete.setBackgroundResource(R.drawable.gabinete17);
            imgdiscorigido.setBackgroundResource(R.drawable.hd);
            imgmemoriaram.setBackgroundResource(R.drawable.memoriaram);
            imgcooler.setBackgroundResource(R.drawable.cooler);
            imgplacavideo.setBackgroundResource(R.drawable.placadevideo);
            imgfonte.setBackgroundResource(R.drawable.fonte18);

        }


        if (passa >= 1600 && passa < 1700) {
            precofinal.setText("1670,00 R$ (em média)");
            placamae.setText("Msi H81m-e33 - 400,00 R$");
            processador.setText("Pentium Dual Core G3250 3.2ghz - 300,00 R$");
            gabinete.setText("Pc Yes Java - 300,00 R$");
            cooler.setText("Original");
            discorigido.setText("Wd Blue Barracuda 500gb - 170,00 R$");
            memoriaRAM.setText("Kingston Ddr3 4 Gb - 100,00 R$");
            fonte.setText("430w Electro Series - 300,00 R$");
            placa_video.setText("OnBoard - 0,00 R$");


            imgplacamae.setBackgroundResource(R.drawable.placamae17);
            imgprocessador.setBackgroundResource(R.drawable.processador17);
            imggabinete.setBackgroundResource(R.drawable.gabinete17);
            imgcooler.setBackgroundResource(R.drawable.cooler17);
            imgdiscorigido.setBackgroundResource(R.drawable.hd17);
            imgmemoriaram.setBackgroundResource(R.drawable.memoriaram);
            imgfonte.setBackgroundResource(R.drawable.fonte);
            imgplacavideo.setBackgroundResource(R.drawable.placavideo17);


        }

        if (passa >= 1700 && passa < 1800) {
            precofinal.setText("1720,00 R$ (em média)");
            placamae.setText("ASROCK N68-GS4 - 250,00 R$");
            processador.setText("Amd Fx 4300 3.8ghz - 400,00 R$");
            memoriaRAM.setText("Kingston Ddr3 4 Gb - 100,00 R$");
            fonte.setText("430w Electro Series - 300,00 R$");
            discorigido.setText("Wd Blue Barracuda 500gb - 170,00 R$");
            cooler.setText("Blizzard T2 - 100,00 R$");
            gabinete.setText("Pc Yes Java - 300,00 R$");
            placa_video.setText("GT730 - 320,00 R$");

            imgplacamae.setBackgroundResource(R.drawable.placamae17);
            imgprocessador.setBackgroundResource(R.drawable.processador17);
            imggabinete.setBackgroundResource(R.drawable.gabinete17);
            imgcooler.setBackgroundResource(R.drawable.coolertodoss);
            imgdiscorigido.setBackgroundResource(R.drawable.hd17);
            imgmemoriaram.setBackgroundResource(R.drawable.memoriaram);
            imgfonte.setBackgroundResource(R.drawable.fonte18);
            imgplacavideo.setBackgroundResource(R.drawable.placadevideo18);
        }

        if (passa >= 1800 && passa < 1900) {
            precofinal.setText("1840,00 R$ (em média)");
            placamae.setText("ASROCK N68-GS4 - 250,00 R$");
            processador.setText("Amd Fx 4300 3.8ghz - 400,00 R$");
            memoriaRAM.setText("Kingston Ddr3 8 Gb - 200,00 R$");
            fonte.setText("430w Electro Series - 300,00 R$");
            discorigido.setText("Wd Blue Barracuda 500gb - 170,00 R$");
            placa_video.setText("GT730 - 320,00 R$");
            cooler.setText("Original - 0,00 R$");
            gabinete.setText("Pc Yes Java - 300,00 R$");


            imgplacamae.setBackgroundResource(R.drawable.placamae19);
            imgprocessador.setBackgroundResource(R.drawable.processador19);
            imggabinete.setBackgroundResource(R.drawable.gabinete17);
            imgcooler.setBackgroundResource(R.drawable.coolertodoss);
            imgdiscorigido.setBackgroundResource(R.drawable.hd17);
            imgmemoriaram.setBackgroundResource(R.drawable.memoriaram17);
            imgfonte.setBackgroundResource(R.drawable.fonte18);
            imgplacavideo.setBackgroundResource(R.drawable.placadevideo19);


        }
        if (passa >= 1900 && passa < 2200) {
            precofinal.setText("2020,00 R$ (em média)");
            placamae.setText("ASROCK N68-GS4 - 250,00 R$");
            processador.setText("Amd Fx 4300 3.8ghz - 400,00 R$");
            memoriaRAM.setText("Kingston Ddr3 4 Gb - 100,00 R$");
            fonte.setText("430w Electro Series - 300,00 R$");
            discorigido.setText("Wd Blue Barracuda 500gb - 170,00 R$");
            placa_video.setText("GTX750 - 500,00 R$");
            cooler.setText("Original - 0,00 R$");
            gabinete.setText("Pc Yes Java - 300,00 R$");

            imgplacamae.setBackgroundResource(R.drawable.placamae19);
            imgprocessador.setBackgroundResource(R.drawable.processador19);
            imggabinete.setBackgroundResource(R.drawable.gabinete17);
            imgcooler.setBackgroundResource(R.drawable.cooler);
            imgdiscorigido.setBackgroundResource(R.drawable.hd17);
            imgmemoriaram.setBackgroundResource(R.drawable.memoriaram17);
            imgfonte.setBackgroundResource(R.drawable.fonte18);
            imgplacavideo.setBackgroundResource(R.drawable.placadevideo19);


        }

        if (passa >= 2200 && passa < 2700) {
            precofinal.setText("2610,00 R$ (em média)");
            placamae.setText("H81m-a/br  - 350,00 R$");
            processador.setText("i3 4170 3.7ghz  - 650,00 R$");
            memoriaRAM.setText("Kingston Ddr3 8 Gb - 200,00 R$");
            fonte.setText("430w Electro Series - 300,00 R$");
            discorigido.setText("Wd Blue Barracuda 500gb - 170,00 R$");
            placa_video.setText("GTX750ti - 540,00 R$");
            cooler.setText("Blizzard T2 - 100,00 R$");
            gabinete.setText("Pc Yes Java - 300,00 R$");


            imgplacamae.setBackgroundResource(R.drawable.placamae19);
            imgprocessador.setBackgroundResource(R.drawable.processador19);
            imggabinete.setBackgroundResource(R.drawable.gabinete17);
            imgcooler.setBackgroundResource(R.drawable.coolertodoss);
            imgdiscorigido.setBackgroundResource(R.drawable.hd17);
            imgmemoriaram.setBackgroundResource(R.drawable.memoriaram17);
            imgfonte.setBackgroundResource(R.drawable.fonte18);
            imgplacavideo.setBackgroundResource(R.drawable.placadevideo19);
        }

        if (passa >= 2700 && passa < 3400) {
            precofinal.setText("3370,00 R$ (em média)");
            placamae.setText("H81m-a/br  - 350,00 R$");
            processador.setText("i3 4170 3.7ghz  - 650,00 R$");
            memoriaRAM.setText("Kingston Ddr3 8 Gb - 200,00 R$");
            fonte.setText("430w Electro Series - 300,00 R$");
            discorigido.setText("SSD 240GB 300,00 R$ + HD 500 170,00 R$");
            placa_video.setText("GTX960 - 1000,00 R$");
            cooler.setText("Blizzard T2 - 100,00 R$");
            gabinete.setText("Pc Yes Java - 300,00 R$");


            imgplacamae.setBackgroundResource(R.drawable.placamae32);
            imgprocessador.setBackgroundResource(R.drawable.processador33);
            imggabinete.setBackgroundResource(R.drawable.gabinete17);
            imgcooler.setBackgroundResource(R.drawable.coolertodoss);
            imgdiscorigido.setBackgroundResource(R.drawable.ssd32);
            imgmemoriaram.setBackgroundResource(R.drawable.memoriaram32);
            imgfonte.setBackgroundResource(R.drawable.fonte18);
            imgplacavideo.setBackgroundResource(R.drawable.placadevideo32);


        }
    }
}
