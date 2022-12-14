package ecccomp.team_create4.parkship

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var navigation: BottomNavigationView

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId){
            //マップ画面
            R.id.menu1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, ExampleFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            //検索画面
            R.id.menu2 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, map())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            //フレンド画面
            R.id.menu3 -> {

            }
            //設定画面
            R.id.menu4 -> {

            }

        }
        return@OnNavigationItemSelectedListener false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation = findViewById(R.id.bottom_nav_bar)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }
}