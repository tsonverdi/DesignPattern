package StructuralDP.CompositeDP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department{

    List<Department> childDepartments;

    public RegionalDepartment(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream().//Finance objesu ve Sales objesi
                map(Department::getName).//Finance ve Sales isimleri geldi names ile.
                collect(Collectors.joining(", "));//"Finance, Sales"
    }

    @Override
    List<String> getEmployees(){
        return childDepartments.stream().flatMap(d -> d.getEmployees().stream()).collect(Collectors.toList());
    }
}
