package website.tachi.app

import android.app.Application
import android.util.Log
import com.kakao.sdk.common.KakaoSdk
import com.kakao.sdk.common.util.Utility
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TachiApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, BuildConfig.KAKAO_AOUTH_HOST_SCHEME)

        if (BuildConfig.DEBUG) {
            val keyHash = Utility.getKeyHash(this)
            Log.e("TachiApplication:Kakao", keyHash)
        }
    }
}