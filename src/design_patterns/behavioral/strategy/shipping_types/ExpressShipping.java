package design_patterns.behavioral.strategy.shipping_types;

import design_patterns.behavioral.strategy.entities.Shipping;

public class ExpressShipping implements Shipping {


    public float calculate(float productPrice) {
        float shippingTax = 0.1f;

        return productPrice * shippingTax;
    }
}
