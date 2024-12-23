//implements 继承，是List61B的子类，相反List61B是SList的父类(interface)
public class SList<unkonw> implements List61B<unkonw>{
    public  class intnode{
        public intnode prev=null;
        public unkonw value;
        public intnode next=null;

        public intnode(unkonw x){
            this.value=x;
        }
    }

    private intnode sentinel;
    private int size;
    private intnode last;

    public SList(){
        sentinel = new intnode(null);
        size=0;
    }
    //override 可以帮助检查该方法是否在父类中出现，防止拼写错误等情况
    @Override
    public void add_first(unkonw x){
        intnode first=new intnode(x);
        if(sentinel.next!=null){
            sentinel.next.prev=first;
        }
        if(sentinel.next==null){
            last=first;
        }
        first.next=sentinel.next;
        sentinel.next= first;
        first.prev=sentinel;

        size+=1;
    }
    public void  add_last(unkonw x){
        intnode corrent=new intnode(x);
        last.next=corrent;
        corrent.prev=last;
        last=corrent;
        size+=1;
    }

    public void insert(unkonw x,int index){
        intnode corrent=new intnode(x);
        intnode search=sentinel;
        for (int i=0;i<index;i++){
            search=search.next;
        }
        search.prev.next=corrent;
        corrent.prev=search.prev;
        corrent.next=search;
        search.prev=corrent;
        size+=1;
    }

    public unkonw get(int index){
        intnode corrent=sentinel;
        for(int i=0;i<index;i++){
            corrent=corrent.next;
        }
        return corrent.value;
    }
    public unkonw getfirst(){
        return sentinel.next.value;
    }
    public unkonw getlast(){
        return last.value;
    }
    public void show(){
        System.out.println("SList的show()");
        intnode corrent=sentinel;
        if(corrent.next!=null) {
            do {
                corrent=corrent.next;
                System.out.println(corrent.value + " ");
            } while (corrent.next != null);
        }else{
            System.out.println(corrent.value);
        }
    }
    public int size(){
        return size;
    }

    public static String get_longest(SList <String> list){
        int length=0;
        String longest=null;

        for(int i=1;i<=list.size;i++){
            if(list.get(i).length()>=length){
                length=list.get(i).length();
                longest=list.get(i);
            }
        }
        return longest;
    }

    public static void main(String[] args){
        SList <String>list=new SList<>();
        list.add_first("a");
        list.add_first("hello");
        list.add_last("10");
        list.insert("b",3);
        list.show();
        System.out.println(list.get(2));
        System.out.println(list.getfirst());
        System.out.println(list.getlast());
        System.out.println(get_longest(list));
    }

    


}



