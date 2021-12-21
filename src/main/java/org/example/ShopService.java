package org.example;

import org.DI.InjectDugi;

public class ShopService {

    @InjectDugi
    private ShopRepository shopRepository;

    public void buy() {
        System.out.println("ShopService.buy");
        shopRepository.save();
    }
}
