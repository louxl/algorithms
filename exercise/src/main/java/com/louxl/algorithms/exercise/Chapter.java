package com.louxl.algorithms.exercise;

import java.util.List;

/**
 * Exercise Chapter interface
 * Created on 2015/8/2.
 *
 * @author xiaolong.lou
 */
public interface Chapter {
    String getIndex();
    String getTitle();

    List<Section> getSelections();
}
