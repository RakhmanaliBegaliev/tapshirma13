public class Main {
    public static void main(String[] args) {
        Class class1 = new Class (1,"Asan", new int []{1,2,3,5,8});
        System.out.println("number: " + class1.getNumber());
        System.out.println("word: " + class1.getWord());
        for (int t: class1.getArray()){
            System.out.println("array.lenght: " + t);
        }
    }

}