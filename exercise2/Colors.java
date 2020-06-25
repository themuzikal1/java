//package exercise2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Colors {
//
//    public static String[] colorful(String[] strings) {
//        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.  discard all the other strings.  If no strings start with a color in the input array, return an empty array.
//        List<String> list = new ArrayList<>();
//        list.add("bluebird");
//        list.add("red herring");
//        list.add("yellow bumblebee");
//        list.add("black spider");
//        list.add("green monkey");
//        list.add("pink");
//        list.add("great gatsby");
//        list.add("feeding frenzy");
//        list.add("black bird");
//        list.add("widowmaker");
//        list.add("quran");
//        list.add("bible");
//        list.add("torah");
//        List<String> filters = new ArrayList<>();
//        filters.add("great gatsby");
//        filters.add("feeding frenzy");
//        filters.add("widowmaker");
//        filters.add("quran");
//        filters.add("bible");
//        filters.add("torah");
//        System.out.println("Original List " + list);
//        list.removeAll(filters);
//        System.out.println("Filtered List " + list);
//
//        return new String[]{};
//    }
//
//
//    public static void main(String[] args) {
//        Colors code = new Colors();
//        code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
//        System.out.println("This is the Colors class");
//
//
//    }
//
//
//}