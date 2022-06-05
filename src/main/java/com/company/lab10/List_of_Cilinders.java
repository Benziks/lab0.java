package com.company.lab10;

import java.util.ArrayList;
import java.util.List;

public class List_of_Cilinders {


    private final List<Cilinder> figure;


    public  List_of_Cilinders () {
        figure = new ArrayList<>();
    }

    public void add(Cilinder cilinder) {
        figure.add(cilinder);
    }

    public void remove(Cilinder cilinder) {
        figure.remove(cilinder);
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

    public List_of_Cilinders getListOf(String type) {
        List_of_Cilinders result = new List_of_Cilinders();

        for (Cilinder item : figure) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(type))
                result.add(item);
        }

        return result;
    }


    public double getAvgV_of_CylindersList(){
        double sum = 0;
        for (Cilinder cil : figure){
            sum += cil.getV();
        }
        return sum/ figure.size();
    }

    public String toString() {
        return "List if Cylinders{" + figure + '}';
    }
}
