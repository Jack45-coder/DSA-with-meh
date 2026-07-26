package generic.boundedGen;

import java.lang.reflect.Type;

public class Displayer_2 <T extends College>{
    T num;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
        this.num.printCollegeName();
    }

    public void display(){
        System.out.println("Element: " + this.num);
    }
}
