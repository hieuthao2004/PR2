package tut11.product;

import java.io.*;
import java.util.List;

public class ProductDAO extends DAO<Product>{
	
	@Override
	public void updateObject(Product object) {
		List<Product> objectList = getList();
		
		for (Product product : objectList ) {
			if (product.getName().equals(object.getName())) {
				product.setPrice(object.getPrice());
				break;
			}
		}
		
	}
	
	@Override
	public Product findObject(Serializable id) {
		List<Product> objectList = getList();
		
		for (Product product : objectList) {
			if (product.getName().equals(id)) {
				return product;
			}
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		String result = "Product=[";
		List<Product> objectList = getList();
		for (Product product : objectList) {
			result += "[name=" + product.getName() + ", price=" + product.getPrice() + "], ";
		}
		result += "]";
		return result;
	}

	@Override
	public void addObject(Product object) throws Exception {
		List<Product> objectList = getList();
		if (objectList.contains(object)) {
			throw new Exception("List already contained " + object.getName());
		}
		objectList.add(object);
	}

	@Override
	public void removeObject(Product object) throws Exception {
		List<Product> objectList = getList();
		if (objectList.contains(object)) {
			objectList.remove(object);
		}
		else {
			throw new Exception("list does not contain " + object.getName());
		}
	}
}
