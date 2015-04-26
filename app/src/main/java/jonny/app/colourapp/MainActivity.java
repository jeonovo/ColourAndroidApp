package jonny.app.colourapp;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
   private int red;
   private int green;
   private int blue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar1 = (SeekBar) findViewById(R.id.seekBar1);
        SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        SeekBar seekBar3 = (SeekBar) findViewById(R.id.seekBar3);

        red = 255;
        green = 255;
        blue = 255;
        setRed(red);
        setGreen(green);
        setBlue(blue);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            int progressChanged = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                progressChanged =  progress;

                TextView textView = (TextView) findViewById(R.id.textView2);

                textView.setText("" + progressChanged);

                setRed(progressChanged);

                setActivityBackgroundColor();

            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            int progressChanged = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                progressChanged =  progress;

                TextView textView = (TextView) findViewById(R.id.textView3);

                textView.setText("" + progressChanged);

                setGreen(progressChanged);

                setActivityBackgroundColor();

            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            int progressChanged = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                progressChanged =  progress;

                TextView textView = (TextView) findViewById(R.id.textView4);

                textView.setText("" + progressChanged);

                setBlue(progressChanged);

                setActivityBackgroundColor();
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setActivityBackgroundColor() {
        int r = getRed();
        int g = getGreen();
        int b = getBlue();

        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(Color.rgb( r,  g,  b));
    }


    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}
