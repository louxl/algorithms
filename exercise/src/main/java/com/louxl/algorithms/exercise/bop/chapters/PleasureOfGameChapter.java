package com.louxl.algorithms.exercise.bop.chapters;

import com.google.common.collect.ImmutableList;
import com.louxl.algorithms.exercise.Chapter;
import com.louxl.algorithms.exercise.Section;

import java.util.List;

/**
 * Please describe this class
 * Created on 2015/8/2.
 *
 * @author xiaolong.lou
 */
public class PleasureOfGameChapter implements Chapter{
    private static final List<Section> SELECTIONS;

    static {
        SELECTIONS = ImmutableList.<Section>builder()
                .add()
                .build();
    }

    public static PleasureOfGameChapter build() {
        return new PleasureOfGameChapter();
    }

    public String getIndex() {
        return "一";
    }

    public String getTitle() {
        return "游戏之乐————游戏中碰到的题目";
    }

    public List<Section> getSelections() {
        return null;
    }
}
