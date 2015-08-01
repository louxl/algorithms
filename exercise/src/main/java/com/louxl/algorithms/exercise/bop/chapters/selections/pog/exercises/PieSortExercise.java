package com.louxl.algorithms.exercise.bop.chapters.selections.pog.exercises;

import com.google.common.collect.Lists;
import com.louxl.algorithms.exercise.Exercise;

import java.util.List;

/**
 * Please describe this class
 * Created on 2015/8/2.
 *
 * @author xiaolong.lou
 */
public class PieSortExercise implements Exercise {
    private static final List<Integer> WAIT_SORT_PIES;

    static {
        WAIT_SORT_PIES = Lists.newArrayList(3, 2, 5, 4, 1, 9, 6, 7, 8, 0);
    }

    public static PieSortExercise build() {
        return new PieSortExercise();
    }

    public void run() {

    }
}
