package random;

public class ValidationWithSHA implements UserValidation {


    public void validateSHA(){}
    @Override
    public boolean validate(){

        System.out.println("SHA Validation");
        return true;

    }

}
