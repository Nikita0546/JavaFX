package com.example.javafxdz2;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Lesson243 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        ObservableList<String> observableList = FXCollections.observableList(list);
        observableList.addListener(new ListChangeListener<String>() {
            @Override
            public void onChanged(Change<? extends String> change) {
                System.out.println("List was changed");
            }
        });
        observableList.addAll("one");
        list.add("two");
        System.out.println(list.size());
        System.out.println(observableList.size());
    }
}
