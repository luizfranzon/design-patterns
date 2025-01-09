package design_patterns.behavioral.strategy;

import design_patterns.behavioral.strategy.entities.Order;
import design_patterns.behavioral.strategy.entities.Shipping;
import design_patterns.behavioral.strategy.shipping_types.CommonShipping;
import design_patterns.behavioral.strategy.shipping_types.ExpressShipping;
import design_patterns.behavioral.strategy.product_types.EletronicProductShipping;
import design_patterns.behavioral.strategy.product_types.FurnitureProductShipping;

public class Main {

    public static void main(String[] args) {

        Shipping commonShipping = new CommonShipping();
        Shipping expressShipping = new ExpressShipping();

        Order eletronicOrder = new EletronicProductShipping(100, commonShipping);
//        Order furnitureOrder = new FurnitureProductShipping(100, expressShipping);

        System.out.printf("Common: R$ %.2f \n", eletronicOrder.calculateShipping());

        eletronicOrder.setShippingType(expressShipping);

        System.out.printf("Common: R$ %.2f \n", eletronicOrder.calculateShipping());
    }

}
