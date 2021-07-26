package app.miki.mikiso.sound0726

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //レイアウトのdrum_ImageをdrumImageという名前で使えるようにする
        val drumImage : ImageView = findViewById(R.id.drum_Image)

        //ドラムのサウンドファイルを読み込んで、プレイヤーを作る
        val drumSound : MediaPlayer = MediaPlayer.create(this,R.raw.seikai)

        //ドラムがタップされたときに呼ばれる
        drumImage.setOnClickListener {
            //ドラムの音を巻き戻す
            drumSound.seekTo(0)

            //ドラムの音を再生する
            drumSound.start()
        }
    }
}