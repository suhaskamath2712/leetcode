/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution
{
    private Employee getEmp (List<Employee> employees, int id)
    {
        for (Employee e : employees)
            if (e.id == id)
                return e;
        return null;
    }

    private int getImpRec (List<Employee> employees, Employee emp)
    {
        int sum = emp.importance;

        for (int empId : emp.subordinates)
            sum += getImpRec(employees,getEmp(employees,empId));
        
        return sum;
    }

    public int getImportance(List<Employee> employees, int id)
    {
        return getImpRec(employees,getEmp(employees,id));
    }
}