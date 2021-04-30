package com.example.ejemplomvp.view;

import androidx.test.espresso.ViewAction;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.example.ejemplomvp.R;

import junit.framework.TestCase;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withInputType;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivity2Test extends TestCase {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void botonesOperacionesTest(){
        onView(withId(R.id.etNumero1)).perform(typeText("10"));
        onView(withId(R.id.etNumero2)).perform(typeText("2"), closeSoftKeyboard());

        onView(withId(R.id.bntSumar)).perform(click());
       // onView(withId(R.id.resultadoSuma)).check(matches(withText("12.0")));

        onView(withId(R.id.bntRestar)).perform(click());
        //onView(withId(R.id.resultadoResta)).check(matches(withText("8.0")));

        onView(withId(R.id.bntMultiplicar)).perform(click());
        //onView(withId(R.id.resultadoMultiplicacion)).check(matches(withText("20.0")));

        onView(withId(R.id.bntDividir)).perform(click());
       // onView(withId(R.id.resultadoDivision)).check(matches(withText("5.0")));

        onView(withId(R.id.btnCalcular)).perform(click());
       // onView(withId(R.id.tvMain2)).check(matches(withText("24.0")));
        onView(withId(R.id.btnAtras)).perform(click());

        onView(withId(R.id.etHola)).perform(typeText("hola como estas "),closeSoftKeyboard());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.tvHola)).check(matches(withText("hola como estas soy yo")));

    }


}