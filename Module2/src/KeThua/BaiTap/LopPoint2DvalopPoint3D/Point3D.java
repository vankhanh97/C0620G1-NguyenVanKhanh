package KeThua.BaiTap.LopPoint2DvalopPoint3D;

public class Point3D extends Point2D {
    private float z =0.0f;

    public Point3D(){}
    public Point3D(float x,float y, float z){
        super(x, y);
        this.z =z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y,float z) {
        super.setXY(x, y);
        this.z=z;
    }

    public void getXYZ() {
        float [] arr = new float[3];
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}'+super.toString();
    }
}
