package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Asia implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity(){
        BigDecimal sandQuantity = new BigDecimal("9876543210123456789");
        return sandQuantity;
    }

}
