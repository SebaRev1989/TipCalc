package com.reverso.seba.tipcalc;

import android.app.Application;

/**
 * Created by seba on 01/06/16.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_ME = "https://ar.linkedin.com/in/sebareverso";

    public String getAboutMe() {
        return ABOUT_ME;
    }
}
