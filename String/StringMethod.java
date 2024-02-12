class StringMethod {
    public static void main(String[] args) {
        String s = "Rana Corporation";
        System.out.println(s.charAt(5));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        System.out.println(s.trim());
        System.out.println(s.concat(" Copyrights"));
        System.out.println(s.isEmpty());
        System.out.println(s.substring(5));
        System.out.println(s.compareTo("Rana"));
        System.out.println(s.equals("Rana Corporation"));
        System.out.println(s.indexOf('C'));
        System.out.println(s.replace("Corporation", "Foundation"));
        System.out.println(s.startsWith("R"));
        System.out.println(s.endsWith("L"));
    }
}