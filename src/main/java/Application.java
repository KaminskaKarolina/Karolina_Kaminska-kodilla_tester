
class Worker {
    String name;
    int age;
    double height;

    public Worker(String name, int age, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void CheckThis() {
        if (this.age > 30 && height > 160) {

            System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is older than 30 and taller than 160cm");
        }

    }

}

class Application {
    public static void main(String[] args) {
        Worker worker = new Worker(Adam, 40.5, 178);
        System.out.println(Worker.name +" "+ Worker.age+" "+ Worker.heigh);
        Worker.CheckThis();
    }
}


