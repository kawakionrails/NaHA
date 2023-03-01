object Libraries {

    private const val coreKtx: String =
        "androidx.core:core-ktx:${Versions.coreKtx}"
    private const val appCompat: String =
        "androidx.appcompat:appcompat:${Versions.appCompat}"
    private const val material: String =
        "com.google.android.material:material:${Versions.material}"
    private const val constraintLayout: String =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    private const val fragmentKtx: String =
        "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
    private const val legacySupportV4: String =
        "androidx.legacy:legacy-support-v4:${Versions.legacySupportV4}"
    private const val lifecycleLiveDataKtx: String =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    private const val lifecycleViewModelKtx: String =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    private const val navigationFragmentKtx: String =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    private const val navigationUiKtx: String =
        "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    private const val hiltAndroid: String =
        "com.google.dagger:hilt-android:${Versions.hilt}"
    private const val hiltCompiler: String =
        "com.google.dagger:hilt-compiler:${Versions.hilt}"
    val libraries = ArrayList<String>().apply {
        add(coreKtx)
        add(appCompat)
        add(material)
        add(constraintLayout)
        add(fragmentKtx)
        add(legacySupportV4)
        add(lifecycleLiveDataKtx)
        add(lifecycleViewModelKtx)
        add(navigationFragmentKtx)
        add(navigationUiKtx)
        add(hiltAndroid)
        add(hiltCompiler)
    }

}

object TestLibraries {

    private const val jUnit: String =
        "junit:junit:${TestVersions.jUnit}"
    val testLibraries = ArrayList<String>().apply {
        add(jUnit)
    }

}

object AndroidTestLibraries {

    private const val jUnit: String =
        "androidx.test.ext:junit:${AndroidTestVersions.jUnit}"
    private const val espressoCore: String =
        "androidx.test.espresso:espresso-core:${AndroidTestVersions.espressoCore}"
    val androidTestLibraries = ArrayList<String>().apply {
        add(jUnit)
        add(espressoCore)
    }

}