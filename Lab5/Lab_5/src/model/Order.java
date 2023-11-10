/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jaswa
 */
public class Order {
   ArrayList<OrderItem> orderItemList;

    public Order() {
        this.orderItemList=new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    public void addNewOrderItem(Product product, double salesPrice, int quantity){
        OrderItem orderItem=new OrderItem(product,salesPrice,quantity);
        orderItemList.add(orderItem); 
    }
    public OrderItem findProduct(Product product){
        for(OrderItem oi:this.getOrderItemList()){
            if(oi.getProduct().equals(product)){
                return oi;
            }
        }
        return null;
    }

    public void deleteItem(OrderItem item) {
       this.orderItemList.remove(item);
    }
   
}
