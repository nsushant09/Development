package random;

class ValidationWithMD5 implements UserValidation {

    public void validateMD5(){}
    @Override
    public boolean validate() {
        System.out.println("MD5 validation");
        return false;
    }
}