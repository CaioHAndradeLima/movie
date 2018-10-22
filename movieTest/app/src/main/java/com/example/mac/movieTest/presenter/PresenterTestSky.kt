package com.example.mac.movieTest.presenter

import com.example.mac.movieTest.view.ActivityMethods

/**
 * the presenter that every presenter will extends
 *
 * here apply the rules for the presenter to work right
 *
 * @author Caio
 * @version 1
 * @since 1
 * @date 18/10/2018
 *
 */
abstract class PresenterTestSky(protected val activityMethods : ActivityMethods) : PresenterAny {

    /**
     * called when view will be destroyed
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    override fun onDestroy() {  }

}

/**
 * the interface with what's needed
 * for the presenter to work, in other words,
 * what the activity need to call for presenter
 * to work right
 *
 * @author Caio
 * @version 1
 * @since 1
 * @date 18/10/2018
 *
 */
interface PresenterAny {

    /**
     * when activity was created
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    fun onCreate()

    /**
     * when activity was destroyed
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    fun onDestroy()
}