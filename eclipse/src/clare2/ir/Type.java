package clare2.ir;

import java.util.ArrayList;
import java.util.List;

public class Type {

	private String mName;
	private List<Field> mFields = new ArrayList<>();
	
	public Type(String name) { mName = name; }
	
	public static class Field {
		private Type mType;
		private String mName;
		public Field(String name, Type type) {
			mName = name;
			mType = type;
		}
	}
}












