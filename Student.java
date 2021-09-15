class Student {
    int id;
    //id = 100;  i cant reassign a variable outside a method
    byte age = 18;
    int phoneNumber = 1234567890;

    double gpa = 3.8888888888888888888888888888888;

    void compute(){
        id = 100;  // this work
        int nextId = id + 1;
        System.out.println("id: " + id);
        System.out.println("nextId:" + nextId);
        System.out.println("age:" + age);
        System.out.println("phoneNumber:" + phoneNumber);
        System.out.println("gpa:" + gpa);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }
}