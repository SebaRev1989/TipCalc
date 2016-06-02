package com.reverso.seba.tipcalc.fragments;

import com.reverso.seba.tipcalc.models.TipRecord;

/**
 * Created by seba on 01/06/16.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
