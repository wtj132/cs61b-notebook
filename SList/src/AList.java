//implements 继承，是List61B的子类，相反List61B是SList的父类(interface)
//父类中的方法在子类中都应该有体现，比如一个警察应该会开车和抓捕，那么不管是男警察还是女警察都应该会开车和抓捕
public class AList<unknow> implements List61B<unknow>{
    private unknow [] list;
    private int index;

    public AList(){
        index=0;
        list=(unknow[]) new Object[100];
    }
    public void add_last(unknow x){
        if(index==list.length){
            resize();
        }
        list[index]=x;
        index+=1;
    }
    public void add_first(unknow x){
        if(index==list.length){
            resize();
        }
        unknow [] new_list=(unknow[]) new Object[list.length+1];
        new_list[0]=x;
        System.arraycopy(list,0,new_list,1,list.length);
        list=new_list;
        index+=1;
    }
    public unknow get_last(){
        return list[index];
    }
    public unknow get_first(){
        return list[0];
    }
    public void insert(unknow x,int pos){
        unknow [] new_list=(unknow[])new Object [list.length+1];
        if(pos!=1) {
            System.arraycopy(list, 0, new_list, 0, pos - 1);
            new_list[pos-1]=x;
            System.arraycopy(list,pos-1,new_list,pos,list.length-pos+1);
            list=new_list;
            index+=1;
        }else{
            add_first(x);
        }

    }
    public int size(){
        return index;
    }
    private void resize(){
        unknow [] new_list=(unknow[])new Object[list.length*2];
        System.arraycopy(list,0,new_list,0,list.length);
        list=new_list;
    }
    /**如果子类中没有show函数，就回继承父类的**/
//    public void show(){
//        for(int i=0;i<index;i++){
//            System.out.println(list[i]+" ");
//        }
//        System.out.println();
//    }

    public unknow get(int x){
        return list[x-1];
    }
    public static String get_longest(AList <String> list){
        int length=0;
        String longest=null;
        for(int i=1;i<=list.index;i++){
            if(list.get(i).length()>=length){
                length=list.get(i).length();
                longest=list.get(i);
            }
        }
        return longest;
    }

    public static void main(String[] args){
        List61B<String> list=new AList<String>();
        list.add_first("3");
        list.add_first("5");
        list.add_last("10");
        list.insert("4",1);
        list.insert("9",3);
        list.show();
//        System.out.println(get_longest(list));
    }
}
