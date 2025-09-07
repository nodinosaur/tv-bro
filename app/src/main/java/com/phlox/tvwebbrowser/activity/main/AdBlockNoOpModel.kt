package com.phlox.tvwebbrowser.activity.main

import android.net.Uri
import com.phlox.tvwebbrowser.TVBro
import com.phlox.tvwebbrowser.utils.activemodel.ActiveModel
import com.phlox.tvwebbrowser.utils.observable.ObservableValue

class AdBlockNoOpModel : ActiveModel() {
    companion object {
        val TAG: String = AdBlockNoOpModel::class.java.simpleName

        const val SERIALIZED_LIST_FILE = "adblock_ser.dat"
        const val AUTO_UPDATE_INTERVAL_MINUTES = 60 * 24 * 30 //30 days
    }

    val config = TVBro.config
    val clientLoading = ObservableValue(false)

    init {
        loadAdBlockList(false)
    }

    fun loadAdBlockList(forceReload: Boolean) {
        // NoOp
    }

    fun isAd(url: Uri, type: String?, baseUri: Uri): Boolean {
        return false
    }


}