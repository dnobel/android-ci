package org.androidci.sample.uitest;

import junit.framework.Assert;

import org.androidci.sample.MainActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.jayway.android.robotium.solo.Solo;

public class MainActivityRobotiumUiTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityRobotiumUiTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testTextViewShowsHelloWorldAfterButtonClicked() throws Exception {
        solo.clickOnButton("Greet Me");

        TextView textView = solo.getText("Hello World");
        Assert.assertEquals("Hello World", textView.getText());
    }
}
