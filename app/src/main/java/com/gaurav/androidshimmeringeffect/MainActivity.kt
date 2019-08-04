package com.gaurav.androidshimmeringeffect

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.facebook.shimmer.ShimmerFrameLayout

class MainActivity : AppCompatActivity() {

    private var shimmerLayout: ShimmerFrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shimmerLayout = findViewById(R.id.shimmer_layout)
    }

    override fun onPause() {
        super.onPause()
        shimmerLayout?.stopShimmer()
    }

    override fun onResume() {
        super.onResume()
        shimmerLayout?.startShimmer()
    }
}
