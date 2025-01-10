package CSBS;

public class CSBS1Inheritance {
    public static void main(String[] args) {
        System.out.println("hi");
    }
}

// A class to represent employees in general.
class Employee {
    public int getHours() {
        return __baseHours;                // 40 hours/week
    }

    public double getSalary() {
        return __baseSalary;               // $40,000.00
    }

    public int getVacationDays() {
        return __baseVacationDays;         // 10 days
    }

    public String getVacationForm() {
        return __baseVacationForm;         // yellow
    }


    // These are so that test cases can change the base values
    // and make sure that subclasses also change their values.
    // (Your code that you submit is NOT supposed to directly use, call,
    // or modify the values below!  They are here only to help our site
    // successfully test your code.  Please ignore them.)

    private static int __baseHours = 40;
    private static double __baseSalary = 40000.0;
    private static int __baseVacationDays = 10;
    private static String __baseVacationForm = "yellow";

    public static final void setBaseHours(int hours) {
        __baseHours = hours;
    }
    public static final void setBaseSalary(double salary) {
        __baseSalary = salary;
    }
    public static final void setBaseVacationDays(int days) {
        __baseVacationDays = days;
    }
    public static final void setBaseVacationForm(String form) {
        __baseVacationForm = form;
    }
}

class Lawyer extends Employee {
    // overrides getVacationDays from Employee class
    public int getVacationDays() {
        return super.getVacationDays() + 5;
    }

    // overrides getVacationDays from Employee class
    public String getVacationForm() {
        return lawyerVacationForm;
    }

    // this is the Lawyer's added behavior
    public String sue() {
        return "I'll see you in court!";
    }


    // these are so that test cases can change the Lawyer values
    // and make sure that subclasses also change
    private static String lawyerVacationForm = "pink";

    public static final void setLawyerVacationForm(String form) {
        lawyerVacationForm = form;
    }
}

class StanfordLawyer extends Lawyer {

    public double getSalary() {
        return super.getSalary()*1.2;
    }

    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }

    public String getVacationForm() {
        String lawyerVacationForm = super.getVacationForm();
        return lawyerVacationForm + lawyerVacationForm + lawyerVacationForm + lawyerVacationForm;
    }
}