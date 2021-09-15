class Student {
    int id;
    //id = 100;  i cant reassign a variable outside a method
    void compute(){
        id = 100;  // this work
        int nextId = id + 1;
        System.out.println("id: " + id);
        System.out.println("nextId:" + nextId);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }
}