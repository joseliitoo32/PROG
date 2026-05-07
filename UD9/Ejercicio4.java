public static void main(String args[]) {
    byte b[] = new byte[5];
    try {
        System.in.read(b);
    } catch (IOException ioe) {
        System.out.println(ioe);
    }
    String s = new String(b);
    System.out.println(s);
}

// Te imprime los 5 primeros caracteres que escribas