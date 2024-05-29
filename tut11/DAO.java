package tut11.product;

import java.io.Serializable;
import java.util.*;

public abstract class DAO<Entity> {
	private List<Entity> objects = new ArrayList<Entity>();
	
	public abstract void addObject(Entity object) throws Exception;
	
	public abstract void removeObject(Entity object) throws Exception;
	
	public abstract void updateObject(Entity object);		
	
	public abstract Product findObject(Serializable id);

	public List<Entity> getList() {
		return objects;
	}
}
