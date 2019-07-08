//package com.example.dager
//
//import android.app.Activity
//import android.app.Application
//import android.app.Service
//import androidx.fragment.app.Fragment
//
//import dagger.android.AndroidInjector
//import dagger.android.DispatchingAndroidInjector
//import dagger.android.HasActivityInjector
//import dagger.android.HasServiceInjector
//import dagger.android.support.HasSupportFragmentInjector
//import javax.inject.Inject
//
//class MyApplication3 : Application(), HasActivityInjector, HasSupportFragmentInjector,
//    HasServiceInjector {
//
//    @Inject
//    lateinit var activityDaggerInjector: DispatchingAndroidInjector<Activity>
//
//    @Inject
//    lateinit var fragmentDaggerInjector: DispatchingAndroidInjector<Fragment>
//
//    @Inject
//    lateinit var serviceDaggerInjector: DispatchingAndroidInjector<Service>
//
//
//    override fun onCreate() {
//        super.onCreate()
//        initComponent()
//    }
//
//    override fun activityInjector(): AndroidInjector<Activity> = activityDaggerInjector
//    override fun supportFragmentInjector(): DispatchingAndroidInjector<Fragment> =
//        fragmentDaggerInjector
//
//    override fun serviceInjector(): DispatchingAndroidInjector<Service> = serviceDaggerInjector
//
//    @SuppressWarnings("unchecked")
//    private fun initComponent() {
//        DaggerAppComponent3.factory()
//            .create(applicationContext)
//            .inject(this)
//    }
//}
//
//
