package com.company;

import java.util.Objects;

public class Product {

        private String productName;
        private int quantity;

        public Product(String productName, int quantity) {
            this.productName = productName;
            this.quantity = quantity;
        }

        public Product() {
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        @Override
        public int hashCode() {
            return Objects.hash(productName, quantity);
        }

        @Override
        public String toString() {
            return productName + " " + quantity;
        }

    }

