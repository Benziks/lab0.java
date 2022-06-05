package com.company.lab10;

import java.util.ArrayList;
import java.util.List;

public class List_of_Circles {

    private final List<Circle> figure;


    public List_of_Circles() {
        figure = new ArrayList<>();
    }

    public void add(Circle circle) {
        figure.add(circle);
    }

    public void remove(Circle circle) {
        figure.remove(circle);
    }

    public void remove(int number) {
        if (number < figure.size())
            figure.remove(number);
    }

    public int getSize() {
        return this.figure.size();
    }

    public int countOf(String type) {

        return getListOf(type).getSize();

    }

    public List_of_Circles getListOf(String type) {
        List_of_Circles result = new List_of_Circles();

        for (Circle item : figure) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(type))
                result.add(item);
        }

        return result;
    }

    public Circle getLargestS_Of_CirclesList(){
        Circle ans = figure.get(0);
        for (int i = 1; i < figure.size() ; i++) {
            if(ans.getS() < figure.get(i).getS()){
                ans = figure.get(i);
            }
        }
        return ans;
    }


    public String toString() {
        return "List if Circles{" + figure + '}';
    }

}
