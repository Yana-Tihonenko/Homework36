public class Soda {
    private String addition;

    public Soda(String addition) {
        this.addition = addition;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    public String GetMyDrinkString(){
        String result;
        if (addition.isEmpty()){
            return  result = "Soda water";
        } else {
            return  result = "Soda water and  "+ addition;
        }
    }
}
