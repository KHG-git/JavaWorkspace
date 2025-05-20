package chap_10;

import java.util.Arrays;
import java.util.stream.Stream;

public class _Quiz_10 {
    public static void main(String[] args) {
        Customer [] customers = {  new Customer("챈들러", 50)
                         ,new Customer("레이첼", 42)
                         ,new Customer("모니카", 21)
                         ,new Customer("벤자민", 18)
                         ,new Customer("제임스", 5)
                         ,new Customer("수퍼맨", 50)
                         ,new Customer("홀란드", 15)
                         ,new Customer("스미스", 55)
                         ,new Customer("안젤라", 19) };

        Stream<Customer> stream = Arrays.stream(customers);

        System.out.println("미술관 입장료");
        System.out.println("---------------------------");
        Arrays.stream(customers)
                .map(c1->c1.getName() + " " + ( c1.getAge() > 20 ? "5000원" : "무료") + "     (" + c1.getAge() + ")")
                .forEach(System.out::println)
                ;


    }
}

class Customer {

    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}