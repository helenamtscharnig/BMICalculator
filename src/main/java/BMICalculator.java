import static java.lang.Math.round;

public class BMICalculator {
    public String firstname;
    public String lastname;
    public int bodyHeight;
    public double bodyWeight;
    public char gender;

    public BMICalculator(String firstname, String lastname, int bodyHeight, double bodyWeight, char gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public char getGender() {
        return gender;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public double calculateBMI(){
        double bmi;
        bmi = bodyWeight / ((bodyHeight / 100.0)*(bodyHeight / 100.0));
        return round(bmi);
    }

    public int calculateBMICategory(){
        int bmicat;
        if (gender == 'm'){
            if(calculateBMI() < 16.0){
                return bmicat = -2;
            }
            else if (calculateBMI() >= 16.0 && calculateBMI() <= 18.4){
                return bmicat = -1;
            }
            else if (calculateBMI() >= 18.5 && calculateBMI() <= 24.9){
                return bmicat = 0;
            }
            else if (calculateBMI() >= 25.0 && calculateBMI() <= 34.9){
                return bmicat = 1;
            }
            else if (calculateBMI() >= 35.0){
                return bmicat = 2;
            }
        }
        else if (gender == 'w') {
            if (calculateBMI() < 15.0) {
                return bmicat = -2;
            } else if (calculateBMI() >= 15.0 && calculateBMI() <= 17.4) {
                return bmicat = -1;
            } else if (calculateBMI() >= 17.5 && calculateBMI() <= 23.9) {
                return bmicat = 0;
            } else if (calculateBMI() >= 24.0 && calculateBMI() <= 33.9) {
                return bmicat = 1;
            } else if (calculateBMI() >= 34.0) {
                return bmicat = 2;
            }
        }
        return 0;
    }

    public String getBMICategoryName(){
        String bmiName;
        if (calculateBMICategory() == -2){
            return bmiName = "Sehr starkes Untergewicht";
        }
        else if (calculateBMICategory() == -1) {
            return bmiName = "Untergewicht";
        }
        else if (calculateBMICategory() == 0){
            return bmiName = "Normalgewicht";
        }
        else if (calculateBMICategory() == 1){
            return bmiName = "Übergewicht";
        }
        else if (calculateBMICategory() == 2){
            return bmiName = "Sehr starkes Übergewicht";
        }
        return null;
    }




}
