package tddClass;

public class TestDriller {

    int result;

    public void customerQuantityOrder(int quantityOrder) {
        if (quantityOrder >= 1 && quantityOrder <= 4) {
            result = quantityOrder * 2000;
        }

        if (quantityOrder >= 5 && quantityOrder <= 9) {
            result = quantityOrder * 1800;
        }
        if (quantityOrder >= 10 && quantityOrder <= 29) {
            result = quantityOrder * 1600;
        }

        if (quantityOrder >= 30 && quantityOrder <= 49) {
            result = quantityOrder * 1500;
        }

        if (quantityOrder >= 50 && quantityOrder <= 99) {
            result = quantityOrder * 1300;
        }

        if (quantityOrder >= 100 && quantityOrder <= 199) {
            result = quantityOrder * 1200;
        }

        if (quantityOrder >= 200 && quantityOrder <= 499) {
            result = quantityOrder * 1100;
        }

        if (quantityOrder >= 500) {
            result = quantityOrder * 1000;
        }

    }

    }



