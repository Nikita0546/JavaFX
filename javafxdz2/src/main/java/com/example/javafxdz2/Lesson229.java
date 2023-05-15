package com.example.javafxdz2;

import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Lesson229 {
    public static void main(String[] args) {
        IntegerProperty integerProperty = new SimpleIntegerProperty(5);
        IntegerProperty integerProperty1 = new ReadOnlyIntegerWrapper(5);

        IntegerBinding integerBinding = new IntegerBinding() {
            {
                super.bind(integerProperty, integerProperty1);
            }
            @Override
            protected int computeValue() {
                return integerProperty.get() + integerProperty1.get();
            }
        };
        System.out.println(integerBinding.get());
        integerProperty.set(1);
        System.out.println(integerBinding.get());

        //System.out.println(integerProperty.add(integerProperty1).getValue());

//        integerProperty.addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
//                System.out.println("new value = " + newValue);
//            }
//        });
//
//        integerProperty.bindBidirectional(integerProperty1);
//        integerProperty1.set(6);
//        //System.out.println(integerProperty.get());
//        integerProperty.set(7);
//        //System.out.println(integerProperty1.get());
//

    }
}

class User {
    StringProperty stringProperty = new SimpleStringProperty("Max");

    public String getStringProperty() {
        return stringProperty.get();
    }

    public StringProperty stringPropertyProperty() {
        return stringProperty;
    }

    public void setStringProperty(String stringProperty) {
        this.stringProperty.set(stringProperty);
    }
}