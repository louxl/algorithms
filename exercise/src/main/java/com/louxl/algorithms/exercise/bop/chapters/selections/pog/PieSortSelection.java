package com.louxl.algorithms.exercise.bop.chapters.selections.pog;

import com.google.common.collect.ImmutableList;
import com.louxl.algorithms.exercise.Exercise;
import com.louxl.algorithms.exercise.Section;
import com.louxl.algorithms.exercise.bop.chapters.selections.pog.exercises.PieSortExercise;

import java.util.Collections;
import java.util.List;

/**
 * Please describe this class
 * Created on 2015/8/2.
 *
 * @author xiaolong.lou
 */
public class PieSortSelection implements Section {
    private static final String INDEX = "1.3";
    private static final String TITLE = "一摞的排序问题";
    private static final List<Exercise> EXERCISES;

    static {
        EXERCISES = ImmutableList.<Exercise>builder()
                .add(PieSortExercise.build())
                .build();
    }

    public String getIndex() {
        return INDEX;
    }

    public String getTitle() {
        return TITLE;
    }

    public List<Exercise> getExercises() {
        return EXERCISES;
    }
}
