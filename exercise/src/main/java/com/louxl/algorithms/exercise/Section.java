package com.louxl.algorithms.exercise;

import java.util.List;

/**
 * Please section this class
 * Created on 2015/8/2.
 *
 * @author xiaolong.lou
 */
public interface Section {
    String getIndex();
    String getTitle();

    List<Exercise> getExercises();
}
