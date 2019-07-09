package ep.com.xmljavalayou;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
//    private ImageView[] img = new ImageView[12];
//    private int[] imagePath = new int[]{
//            R.mipmap.img01, R.mipmap.img02, R.mipmap.img03, R.mipmap.img04,
//            R.mipmap.img05, R.mipmap.img06, R.mipmap.img07, R.mipmap.img08,
//            R.mipmap.img09, R.mipmap.img10, R.mipmap.img11, R.mipmap.img12
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.myframe);
        final RabbitView rabbit = new RabbitView(this);
        rabbit.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event){
                rabbit.bitmapX = event.getX();
                rabbit.bitmapY = event.getY();
                rabbit.invalidate();
                return true;
            }
        });
        frameLayout.addView(rabbit);
//        GridLayout layout = (GridLayout) findViewById(R.id.layout);
//        for(int i = 0; i < 12; i++)
//        {
//            img[i] = new ImageView(MainActivity.this);
//            img[i].setImageResource(imagePath[i]);
//            img[i].setPadding(2, 2, 2, 2);
//            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(116*2, 68*2);
//            img[i].setLayoutParams(params);
//            layout.addView(img[i]);
//        }
    }
}
