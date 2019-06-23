package cn.kgc.smbms.entity;

public class SmbmsBill {
    private Integer id;
    private String billCode;
    private String productName,productUnit;
    private SmbmsProvider smbmsProvider = new SmbmsProvider();
    private double productCount, totalPrice;
    private Integer isPayment;

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public double getProductCount() {
        return productCount;
    }

    public void setProductCount(double productCount) {
        this.productCount = productCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getIsPayment() {
        return isPayment;
    }

    public void setIsPayment(Integer isPayment) {
        this.isPayment = isPayment;
    }

    public SmbmsProvider getSmbmsProvider() {
        return smbmsProvider;
    }

    public void setSmbmsProvider(SmbmsProvider smbmsProvider) {
        this.smbmsProvider = smbmsProvider;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    @Override
    public String toString() {
        return "SmbmsBill{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", smbmsProvider=" + smbmsProvider +
                '}';
    }
}
