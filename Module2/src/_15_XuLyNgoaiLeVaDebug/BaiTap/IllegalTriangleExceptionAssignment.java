package _15_XuLyNgoaiLeVaDebug.BaiTap;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Nhập sai cạnh của tam giác" + super.getMessage();
    }

}
