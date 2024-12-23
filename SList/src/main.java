public class main {
    public static String get_longest(List61B<String> list) {
        int length = 0;
        String longest = null;
        for (int i = 1; i <= list.size(); i++) {
            if (list.get(i).length() >= length) {
                length = list.get(i).length();
                longest = list.get(i);
            }
        }
        return longest;
    }

    public static void main (String[]args){
        List61B<String> list = new SList<String>();
        list.add_first("3");
        list.add_first("5");
        list.add_last("10");
        list.insert("4", 1);
        list.insert("9", 3);
        list.show();
        System.out.println(get_longest(list));
    }
}

