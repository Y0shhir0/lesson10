package zad2;

public class EmploymentValidationRule extends  ValidationRule{

public EmploymentValidationRule(Boolean value){
    super(value,"Ипотека выдается только трудоустроенным");
}

@Override
public boolean isValid(){
    return (boolean)value;
}
        }