package com.devcolibri.logpack;

/**
 * Created by Марсель on 13.03.2016.
 */
public class Main {
    private static OrderLogic logic;

    public static void main(String[] args) {
        logic = new OrderLogic();
        logic.doOrder();
    }
}
