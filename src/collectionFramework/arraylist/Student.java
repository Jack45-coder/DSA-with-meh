package collectionFramework.arraylist;

public class Student {
    int rolNo;
    String name;

    Student(int rolNo, String  name){
        this.rolNo = rolNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student s){
            return this.rolNo == s.rolNo && this.name.equals(s.name);
        }

        return false;
    }

    public String toString(){
        return "[" +this.name+ " , " + this.rolNo + "]";
    }
}
