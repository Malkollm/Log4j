package com.devcolibri.logpack;

import java.util.logging.Logger;


/**
 * Created by Марсель on 13.03.2016.
 */
public class OrderLogic {
    //Инициализация логера
    private static final Logger log = Logger.getLogger(OrderLogic.class);

    public void doOrder(){
        //Какая то логика
        System.out.println("Заказ оформлен!");
        //Логируем инфо
        log.info("Это информационное сообщение!");
        addToCart();
    }

    private void addToCart(){
        //добавление товара в корзину
        System.out.println("Товар добавлен в корзину");
        //Логируем ошибку
        log.error("Это сообщение ошибки");
    }
}
