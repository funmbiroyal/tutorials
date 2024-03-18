package Chapter7;

public class Slip {
    private String salesPersonNumber;
    private String productNumber;
    private String valueOfProductSold;


    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }


    public String getSalesPersonNumber() {
        return salesPersonNumber;
    }

    public void setSalesPersonNumber(String salesPersonNumber) {
        this.salesPersonNumber = salesPersonNumber;
    }

    public String getValueOfProductSold() {
        return valueOfProductSold;
    }

    public void setValueOfProductSold(String valueOfProductSold) {
        this.valueOfProductSold = valueOfProductSold;
    }
//    @Override
//    public String toString(){
//        return  String.format("%3s%3s%3s%n",getSalesPersonNumber(),getProductNumber(),getValueOfProductSold());
//
//    }
    public String getSlip(){
        return getSalesPersonNumber() + getProductNumber() + getValueOfProductSold();
    }
}

