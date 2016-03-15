package com.devcolibri.logpack;

import java.util.logging.*;


/**
 * Created by Марсель on 13.03.2016.
 */
public class OrderLogic {
    //Инициализация логера
    private static final Logger log = Logger.getLogger("My Logger");

    public void doOrder(){
        try {
            Handler logFileHandler = new FileHandler("Z:\\log_file.log");
            ConsoleHandler consoleHandler = new ConsoleHandler();
            log.addHandler(logFileHandler);
            log.addHandler(consoleHandler);

            //Setting levels to handlers and LOGGER
            consoleHandler.setLevel(Level.ALL);
            logFileHandler.setLevel(Level.ALL);
            log.setLevel(Level.ALL);

            log.config("Configuration done.");
            //Console handler removed
            log.removeHandler(consoleHandler);
            log.log(Level.FINE, "Finer logged");

            //Какая то логика
            System.out.println("Заказ оформлен!");
            //Логируем инфо
            log.log(Level.FINE,"Это информационное сообщение!");
            addToCart();
        }
        catch (Exception ex){
            System.out.print(ex.getMessage() + " --> " + ex.getStackTrace());
        }

    }

    private void addToCart(){
        //добавление товара в корзину
        System.out.println("Товар добавлен в корзину");
        //Логируем ошибку
        log.log(Level.FINE,"Это сообщение ошибки");
    }
}
