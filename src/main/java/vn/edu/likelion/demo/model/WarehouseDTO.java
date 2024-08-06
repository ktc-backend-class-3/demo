package vn.edu.likelion.demo.model;

import jakarta.persistence.Column;

public class WarehouseDTO extends BaseDTO {

    private String warehouseName;
    private String warehouseAddress;

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }
}
