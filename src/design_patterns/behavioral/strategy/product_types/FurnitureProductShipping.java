package design_patterns.behavioral.strategy.product_types;

import design_patterns.behavioral.strategy.entities.Order;
import design_patterns.behavioral.strategy.entities.Shipping;

public class FurnitureProductShipping extends Order {

    private String sectorName;

    public FurnitureProductShipping(float price, Shipping shippingType) {
        super(price, shippingType);
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }
}
