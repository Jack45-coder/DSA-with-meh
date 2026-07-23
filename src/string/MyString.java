package string;

public class MyString {
    public static void main(String[] args) {
        String name = "Jackey Kumar";
        System.out.println(name);

        int[] arr = new int[100];
        arr[0] = 50;
        System.out.println(arr[0]);

        int[] brr = new int[200];
        brr[0] = 60;
        System.out.println(arr[0]);

        int[] crr = new int[300];
        crr[0] = 70;
        System.out.println(arr[0]);
        System.out.println(brr[0]);
        System.out.println(crr[0]);

        String name1 = "Jackey Kumar";
        System.out.println(name1);
        String name2 = name1;
        name2 = "Ravish";
        System.out.println(name1);
        String name3 = "Jackey Kumar";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        String n1 = new String("Jack");
        String n2 = new String("Jack");
        String n3 = new String("Jack");
        String n4 = n1;
        System.out.println(n1.equals(n2));
        System.out.println(n2.equals(n3));
        System.out.println(n3.equals(n4));
        System.out.println(n4.equals(n1));

        String naam = "Jackey Kumar";
        System.out.println(naam.toUpperCase());
        System.out.println(naam.toLowerCase());
        System.out.println(naam);

        String naam1 = name.toUpperCase();
        name = naam1;
        System.out.println(naam1);
        System.out.println(name);

        System.out.println(name.charAt(10));
        System.out.println(name.indexOf('A'));
        System.out.println(name.lastIndexOf('A'));
        System.out.println(name.length());


        char[] ch = naam1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }

        System.out.println("JACKEY".compareTo("JACK"));
        System.out.println("JACK".compareTo("JACKEY"));
        System.out.println("JACKEY".compareTo("JACKEY"));

        System.out.println("       Jackey        ");
        System.out.println("       Jackey        ".trim());
        System.out.println("Jackey Kumar".startsWith("Jackey ")); //true
        System.out.println("Jackey Kumar".startsWith("Rjackey ")); //false

        System.out.println("Jackey Kumar".endsWith("mar")); //true
        System.out.println("Jackey Kumar".endsWith(" mar")); //false

        System.out.println("Jackey".substring(3));//key
        System.out.println("Jackey".substring(1, 5));// acke

        String names = "Mohan, Rohan, Sohan, Rahul, Lokesh";
        String myNameList[] = names.split(",");
        for (int i = 0; i < myNameList.length; i++) {
            System.out.println(myNameList[i] + " ");


            String email1 = "jackeyKumar@gmail.com";
            String email2 = "randomAvengers@hotgmail.com";

            String emailArr[] = email1.split("@");
            String lastPart = emailArr[emailArr.length - 1];
            int dotIndex = lastPart.lastIndexOf('.');
            System.out.println(lastPart.substring(0, dotIndex));

            StringBuilder stu1 = new StringBuilder("Jackey");
            StringBuilder stu2 = new StringBuilder("Jackey");
            StringBuilder stu3 = new StringBuilder("Jackey");
            StringBuilder stu4 = stu1;

            System.out.println(stu1.equals(stu2));
            System.out.println(stu2.equals(stu3));
            System.out.println(stu3.equals(stu4));
            System.out.println(stu4.equals(stu2));
            System.out.println(stu1.equals(stu4));

            stu4.append("Kumar");
            System.out.println(stu1.equals(stu2));
            System.out.println(stu2.equals(stu3));
            System.out.println(stu3.equals(stu4));
            System.out.println(stu4.equals(stu2));
            System.out.println(stu1.equals(stu4));
        }
    }
}
