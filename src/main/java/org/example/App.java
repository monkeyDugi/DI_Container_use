package org.example;

import org.DI.ContainerService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ShopService object = ContainerService.getObject(ShopService.class);
        object.buy();
    }
}
