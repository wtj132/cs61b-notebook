import org.testng.annotations.Test;

public class test {
    @Test
    public void testaddfirst(){
        SList <Integer>list=new SList<>();
        list.add_first(3);
        list.add_first(5);

    }

    public static void main(String[] args){
        String a="abdk";
        System.out.println(a.length());
    }
}
