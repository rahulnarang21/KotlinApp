package goforfit.com.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.* // this is responsible for getting every view id here in activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        abc(5)
        val b = BaseImpl(7)
        Derived(b).printMe()

        btnShowToast.setOnClickListener{
            Toast.makeText(this,"Hello World",Toast.LENGTH_LONG).show()
        }

    }

    fun abc(a:Int){
        Toast.makeText(this, "Hello$a",Toast.LENGTH_LONG).show();
    }

    interface Base{
        fun printMe()
    }

    class BaseImpl(val x:Int):Base{
        override fun printMe() {
            Log.w("check","Hello$x")
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        }
    }

    class Derived(b: Base): Base by b
}
