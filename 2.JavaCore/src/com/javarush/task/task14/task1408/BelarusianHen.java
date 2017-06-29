package com.javarush.task.task14.task1408;

/**
 * Created by Dom on 09.03.2017.
 */
public class BelarusianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 15;
    }

    @Override
    String getDescription(){
        String descripHen = super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";

        return descripHen;
    }
}
