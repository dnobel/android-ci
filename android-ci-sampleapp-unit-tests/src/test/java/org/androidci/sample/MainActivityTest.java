package org.androidci.sample;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import android.widget.Button;
import android.widget.TextView;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.buildActivity(MainActivity.class).create().get();
    }

    @Test
    public void shouldShowHelloWorldOnButtonClick() throws Exception {
        activity.onCreate(null);

        Button greatingsButton = (Button) activity.findViewById(R.id.greateButton);
        greatingsButton.performClick();

        TextView greetingsTextView = (TextView) activity.findViewById(R.id.greetingsText);
        String greetingsText = (String) greetingsTextView.getText();

        assertThat(greetingsText, is(equalTo("Hello World")));
    }

}
