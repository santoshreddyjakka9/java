package pack1;

public class Stbuffer {



    public static void main(String args[]){ 
        StringBuffer sb=new StringBuffer("Hello"); 
        sb.replace(1,3,"Java"); 
        System.out.println(sb);
        //sb.reverse();
        System.out.println(sb);
        sb.delete(1,3); 
        System.out.println(sb);
    } 


}
