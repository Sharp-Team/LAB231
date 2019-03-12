/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author demonslight998
 */
public class Product {

  private int id;
  private String productName, supplier, category, quantity;
  private double unitPrice;
  private int unitStock, unitOrder;
  private boolean discontinued;

  public Product() {
  }

  public Product(int id, String productName, String supplier, String category, String quantity, double unitPrice, int unitStock, int unitOrder, boolean discontinued) {
    this.id = id;
    this.productName = productName;
    this.supplier = supplier;
    this.category = category;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
    this.unitStock = unitStock;
    this.unitOrder = unitOrder;
    this.discontinued = discontinued;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public int getUnitStock() {
    return unitStock;
  }

  public void setUnitStock(int unitStock) {
    this.unitStock = unitStock;
  }

  public int getUnitOrder() {
    return unitOrder;
  }

  public void setUnitOrder(int unitOrder) {
    this.unitOrder = unitOrder;
  }

  public boolean isDiscontinued() {
    return discontinued;
  }

  public void setDiscontinued(boolean discontinued) {
    this.discontinued = discontinued;
  }

}
