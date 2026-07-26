package generic;

public class MyGeneric {
    public static void main(String[] args) {
        Displayer<Integer> IntegerObj = new Displayer<>();
        IntegerObj.setNum(20);
        IntegerObj.display();

        Displayer<Double> doubleObj = new Displayer<>();
        doubleObj.setNum(20.099);
        doubleObj.display();
    }
}

/*

   T -> type
   E -> element
   K -> key
   V -> value

 */

    class Displayer<T>{
        T num;

        public T getNum() {
            return num;
        }

        public void setNum(T num) {
            this.num = num;
        }

        public void display(){
            System.out.println(num);
        }
    }
