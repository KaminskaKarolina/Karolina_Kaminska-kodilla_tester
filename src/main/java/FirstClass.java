public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1700,2020);
        System.out.println(notebook.weight + " " + notebook.price);
        System.out.println(notebook.yearOfProduction);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 2800,2010);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        System.out.println(heavyNotebook.yearOfProduction);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        notebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 3000,1980);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        System.out.println(oldNotebook.yearOfProduction);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        notebook.checkYear();


    }
}
