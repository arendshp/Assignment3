public class HumanResourceManager extends Employee {

    public HumanResourceManager(String name, int empId, int salary) {
        super(name, empId, salary);
    }

    public int increase(int x, int y){  //method overriding
        return x/y;
    }
}
