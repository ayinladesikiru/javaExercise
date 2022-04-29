package chapterThree;

public class PetrolPurchase {

        private String location;
        private String petrolType;
        private int petrolQuantity;
        private double petrolLitres;
        private double petrolDiscount;


        public PetrolPurchase(String location, String petrolType, int petrolQuantity, double petrolLitres, double petrolDiscount){
            this.location = location;
            this.petrolType = petrolType;
            this.petrolQuantity = petrolQuantity;
            this.petrolLitres = petrolLitres;
            this.petrolDiscount = petrolDiscount;
        }

        public void setLocation(String location){
            this.location = location;
        }

        public String getLocation(){
            return  location;
        }

        public void setPetrolType(String petrolType){
            this.petrolType = petrolType;
        }

        public String getPetrolType(){
            return petrolType;
        }

        public void setPetrolQuantity(int petrolQuantity){
            this.petrolQuantity = petrolQuantity;
        }

        public int getPetrolQuantity(){
            return petrolQuantity;
        }

        public void setPetrolLitres(double petrolLitres){
            this.petrolLitres = petrolLitres;
        }

        public double getPetrolLitres(){
            return petrolLitres;
        }

        public void setPetrolDiscount(double petrolDiscount){
            this.petrolDiscount = petrolDiscount;
        }

        public double getPetrolDiscount(){
            return petrolDiscount;
        }

        public double getPurchaseAmount(){
            double netPurchase = (petrolQuantity * petrolLitres) - petrolDiscount;
            return  netPurchase;
        }

    }


