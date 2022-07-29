package com.revature.xmltestapp

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AppTest {
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testClicks(){
        Espresso.onView(withId(R.id.button_layouts))
            .perform(ViewActions.click())

        Espresso.onView(withText(R.string.button_label_nextscreen))
            .perform(ViewActions.click())

        Espresso.onView(withText(R.string.article_title))
            .check(matches(isDisplayed()))
    }
}