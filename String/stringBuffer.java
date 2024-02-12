s stringBuffer {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Java");

        s.append(" Programming");
        System.out.println(s);

        s.insert(0, "JDK");
        System.out.println(s);

        s.replace(3, 6, "JRE");
        System.out.println(s);

        s.delete(6, 8);
        System.out.println(s);

        s.reverse();
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Programming");
        sb.capacity();
        System.out.println(sb);
    }
}