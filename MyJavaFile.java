

public class MyJavaFile {
    public static void main(String[] args){
       int sum= myKotlinFile.add(4,6);                          //calling add method from kotlin file
        System.out.println("printing sum from java file"+ sum);
    }
    public static int findArea(int l,int b){
        return l*b;
    }
}

