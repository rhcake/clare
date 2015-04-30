package clare.tree;

import java.util.ArrayList;
import java.util.List;

import clare.tree.Id.Storage;



public class Type {

	private String mName;
	private int mSize;
	
	public String getName() { return mName; }
	public int getSize() { return mSize; }
	
	public Type(String name, int size) {
		mName = name;
		mSize = size;
	}
	
	@Override
	public String toString() { return mName; }
	
	public static final Type I32 = new Type("i32", 4);
	
	public static Type max(Type a, Type b) {
		if (a == I32 && b == I32)
			return I32;
		System.err.println("no max type: " + a + " and " + b);
		return null;
	}
	
	public static boolean isScalar(Type type) {
		if (type == I32)
			return true;
		return false;
	}
	
	private List<Id> mFields = new ArrayList<>();
	
	public void addField(String name, Type type) {
		Id id = new Id(name, type, Storage.FIELD);
		mFields.add(id);
		id.setOffset(mSize);
		mSize += id.getType().getSize();
	}
	
	public int getFieldOffset(String field) {
		for (Id id : mFields)
			if (id.getName().equals(field))
				return id.getOffset();
		System.err.println("no field " + field + " in " + mName);
		return -1;
	}
	
	public Type getFieldType(String field) {
		for (Id id : mFields)
			if (id.getName().equals(field))
				return id.getType();
		System.err.println("no field " + field + " in " + mName);
		return null;
	}
}












