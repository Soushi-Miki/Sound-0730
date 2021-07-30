package app.miki.mikiso.sound0726

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.MotionEvent.ACTION_DOWN
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //レイアウトのdrum_ImageをdrumImageという名前で使えるようにする
        val drumImage : ImageView = findViewById(R.id.drum_Image)

        //ドラムのサウンドファイルを読み込んで、プレイヤーを作る
        val drumSound : MediaPlayer = MediaPlayer.create(this,R.raw.seikai)

        //ドラムがタッチされたときに呼ばれる
        drumImage.setOnTouchListener{ view, event ->

            //タッチが始まった時に
            if (event.action == MotionEvent.ACTION_DOWN){

                //ドラムが鳴っている画像に切り替える
                drumImage.setImageResource(R.drawable.kyouryuu)

                //ドラムの音を巻き戻す
                drumSound.seekTo(0)

                //ドラムの音を再生する
                drumSound.start()
            }
            //タッチが終るときに
            else if (event.action == MotionEvent.ACTION_UP){
                //ドラムが鳴っていない画像に切り替える
                drumImage.setImageResource(R.drawable.kodaiko)
            }

            true

        }

        val  pianoImage : ImageView = findViewById(R.id.piano_image)
        val pianoSound : MediaPlayer = MediaPlayer.create(this,R.raw.kikon)

        pianoImage.setOnTouchListener {view, event ->

          if ( event.action == MotionEvent.ACTION_DOWN)  {
              pianoImage.setImageResource(R.drawable.h)
              pianoSound.seekTo(0)
              pianoSound.start()
          }
            else if (event.action == MotionEvent.ACTION_UP){
                pianoImage.setImageResource(R.drawable.buta)
            }
            true

        }

        val guitarImage : ImageView = findViewById(R.id.guitar_image)
        val guitarSound : MediaPlayer = MediaPlayer.create(this,R.raw.kakon)

        guitarImage.setOnTouchListener{ view, event ->

           if (event.action == MotionEvent.ACTION_DOWN) {
               guitarImage.setImageResource(R.drawable.comment)
               guitarSound.seekTo(0)
               guitarSound.start()
           }

            else if (event.action == MotionEvent.ACTION_UP){
                guitarImage.setImageResource(R.drawable.bag)
            }
            true
        }

    }
}