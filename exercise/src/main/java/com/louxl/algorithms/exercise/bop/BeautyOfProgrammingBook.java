package com.louxl.algorithms.exercise.bop;

import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableList;
import com.louxl.algorithms.exercise.Book;
import com.louxl.algorithms.exercise.Chapter;
import com.louxl.algorithms.exercise.bop.chapters.PleasureOfGameChapter;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Beauty-Of-Programming's exercise catelog
 * Created on 2015/8/2.
 *
 * @author xiaolong.lou
 */
public class BeautyOfProgrammingBook implements Book {
    private static final String CN_NAME = "编程之美";
    private static final String EN_NAME = "Beauty of Programming";
    private static final String FULL_NAME;
    private static final List<Chapter> CHAPTERS;

    static {
        FULL_NAME = CN_NAME + "(" + EN_NAME + ")";

        CHAPTERS = ImmutableList.<Chapter>builder()
                .add(PleasureOfGameChapter.build())
                .build();
    }

    public String getName() {
        return FULL_NAME;
    }

    public List<Chapter> getChaters() {
        return CHAPTERS;
    }
}
