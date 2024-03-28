package jungsuk09;

public class Point3D {

	int x, y, z;

	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Point3D() {
		this(0, 0, 0);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point3D) {
			Point3D point = (Point3D)obj;
			if(point.x == this.x && point.y == this.y && point.z == this.z) {
				return true;
			}
			
		} return false;
	}
	
	@Override
	public String toString() {
	return "["+this.x+","+this.y+","+this.z+"]";
	}
}
