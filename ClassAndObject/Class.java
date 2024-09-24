package ClassAndObject;

public class Class {
    public String className;
    private int classNo;

    public void setNo(int cn){
        if (cn <= 0){
            return;
        }
        classNo = cn;
    }
    public int getNo(){
        return classNo;
    }

    
}