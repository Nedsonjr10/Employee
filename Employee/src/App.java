import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        List<Employee> emp = new ArrayList<>();

        int cont = sc.nextInt();

        for (int i = 0; i < cont; i++){
            String name = sc.next();
            String email = sc.next();
            Double salary = sc.nextDouble();
            emp.add(new Employee(name, email, salary));
        }

       System.out.println("Enter Salary : ");
       Double salary = sc.nextDouble();

       List<String> Email = emp.stream().filter(p -> p.getSalary() > salary).map(e -> e.getEmail()).sorted().collect(Collectors.toList());
       System.out.println("Email " + Email);

        System.out.println("Enter Salary : ");
       char letter = sc.next().charAt(0);
      
       Double sum = emp.stream().filter(n -> n.getName().charAt(0) == letter).map(s -> s.getSalary()).reduce(0.0, (x,y) -> x + y);
       System.out.println("Sum of salary from people : " + sum);

        
       sc.close();
    }
}
