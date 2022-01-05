package povtor.important.reflection_examples;

import java.lang.reflect.Field;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class employeeClass = Class.forName("reflection_examples.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        Field id = employeeClass.getField("id");
         System.out.println("Type of id field = " + id.getType());

        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " +
                    field.getType());
        }
        Field[] allFields = employeeClass.getDeclaredFields();
        System.out.println(allFields);

    }
}
