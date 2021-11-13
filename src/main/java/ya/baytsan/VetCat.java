package ya.baytsan;

public class VetCat {
    static class Cat {
        String nameCat;
        int age;
        int weight;

        public void setName() {
            System.out.println(nameCat);
        }

        public void setAge() {
            System.out.println(age);
        }

        public void setWeight() {
            System.out.println(weight);
        }
    }

    public static void main(String[] args) {
        Cat boris = new Cat();
        //Cat ymka = new Cat();
        boris.nameCat = "Борис";
        boris.age = 5;
        boris.weight = 6;
        boris.setName();
        boris.setAge();
        boris.setWeight();



    }
}
