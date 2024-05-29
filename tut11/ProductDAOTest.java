package tut11.product;

import java.util.List;

public class ProductDAOTest {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();

        try {
            // Create new products
            Product product1 = new Product("Apple", 1.0);
            Product product2 = new Product("Banana", 0.5);
            Product product3 = new Product("Cherry", 0.75);

            // Add products to DAO
            productDAO.addObject(product1);
            productDAO.addObject(product2);

            // Try to add a product that already exists
            try {
                productDAO.addObject(product1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            // Print all products
            List<Product> products = productDAO.getList();
            for (Product product : products) {
                System.out.println("Product Name: " + product.getName() + ", Price: " + product.getPrice());
            }

            // Update a product
            product1.setPrice(1.2);
            productDAO.updateObject(product1);

            // Find a product
            Product foundProduct = productDAO.findObject("Apple");
            if (foundProduct != null) {
                System.out.println("Found Product: " + foundProduct.getName() + ", Price: " + foundProduct.getPrice());
            }

            // Try to find a product that does not exist
            Product notFoundProduct = productDAO.findObject("Grape");
            if (notFoundProduct == null) {
                System.out.println("Product not found");
            }

            // Remove a product
            productDAO.removeObject(product2);

            // Try to remove a product that does not exist
            try {
                productDAO.removeObject(product3);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
