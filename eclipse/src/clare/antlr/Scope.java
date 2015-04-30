package clare.antlr;

import java.util.HashMap;
import java.util.Map;

import clare.tree.Id;
import clare.tree.Type;

public class Scope {
	
	private Scope mParent;
	
	public Scope() {}
	
	private Scope(Scope parent) { mParent = parent; }
	
	public Scope subScope() { return new Scope(this); }

	private Map<String, Id> mIds = new HashMap<>();
	
	public Id getId(String name) {
		for (Scope s = this; s != null; s = s.mParent) {
			Id id = s.mIds.get(name);
			if (id != null)
				return id;
		}
		System.err.println("undefined id: " + name);
		return null;
	}
	
	public void addId(Id id) {
		if (mIds.get(id.getName()) != null)
			System.err.println("multiple definitions: " + id.getName());
		mIds.put(id.getName(), id);
	}


	private Map<String, Type> mTypes = new HashMap<>();
	
	public Type getType(String name) {
		for (Scope s = this; s != null; s = s.mParent) {
			Type type = s.mTypes.get(name);
			if (type != null)
				return type;
		}
		System.err.println("undefined id: " + name);
		return null;
	}
	
	public void addType(Type type) {
		if (mTypes.get(type.getName()) != null)
			System.err.println("multiple type definitions: " + type);
		mTypes.put(type.getName(), type);
	}
}

















