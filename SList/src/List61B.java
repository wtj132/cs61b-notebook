public interface List61B<unkonw> {
    public void add_first(unkonw x);
    public void add_last(unkonw x);
    public void insert(unkonw x,int y);
    public int size();
    public unkonw get(int x);

    /*父类可以写一个default函数，这表示一个默认函数，如果子类中没有该函数，那么就可以调用父类的
    感觉像是一个保底的东西，如果子类有更好的就用自己的，如果没有就调用父类，但是一定会有这么个函数在*/

    /**注意，default函数由于是父类的函数，所以不能调用子类的private参数或函数，只能通过已经实现的public函数实现功能**/
    default void show(){
        System.out.println("List61B的show()");
        for(int i=1;i<=this.size();i++){
            System.out.println(this.get(i));
        }
    }
}
