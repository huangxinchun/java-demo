package hxc.day2.demo2;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append(21);
        builder.append("222");
        builder.append("33").append("343");
        System.out.println(builder);

        String str = builder.toString();
        System.out.println(str);
    }
}
